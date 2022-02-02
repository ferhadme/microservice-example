package com.ferhad.accountservice.repository;

import com.ferhad.common.Role;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.Tables;
import nu.studer.sample.tables.pojos.Roles;
import nu.studer.sample.tables.records.AccountRecord;
import nu.studer.sample.tables.records.RolesRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class RoleRepository {
    private final DSLContext context;

    public void save(Role role) {
        context.insertInto(Tables.ROLES)
                .columns(Tables.ROLES.ROLE_NAME)
                .values(role.getRoleName())
                .execute();
    }

    public List<Roles> getRolesOfUser(Integer accountId) {
        List<Integer> idOfRoles = context.selectFrom(Tables.ACCOUNT_ROLE)
                .where(Tables.ACCOUNT_ROLE.ACCOUNT_ID.eq(accountId))
                .fetch(Tables.ACCOUNT_ROLE.ROLE_ID, Integer.class);
        List<Roles> roles = context.selectFrom(Tables.ROLES)
                .where(Tables.ROLES.ROLE_ID.in(idOfRoles))
                .fetchInto(Roles.class);
        return roles;
    }
}
