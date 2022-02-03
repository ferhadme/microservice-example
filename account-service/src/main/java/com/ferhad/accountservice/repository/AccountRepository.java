package com.ferhad.accountservice.repository;

import com.ferhad.common.UserRequest;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.Tables;
import nu.studer.sample.tables.pojos.Account;
import nu.studer.sample.tables.records.AccountRecord;
import nu.studer.sample.tables.records.RolesRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AccountRepository {
    private final DSLContext context;

    public void save(UserRequest request) {
        context.insertInto(Tables.ACCOUNT)
                .columns(Tables.ACCOUNT.USERNAME, Tables.ACCOUNT.PASSWORD)
                .values(request.getUsername(), request.getPassword())
                .execute();
    }

    public void saveRole(String username, String roleName) {
        AccountRecord accountRecord = context.selectFrom(Tables.ACCOUNT)
                .where(Tables.ACCOUNT.USERNAME.eq(username))
                .fetchOne();
        RolesRecord rolesRecord = context.selectFrom(Tables.ROLES)
                .where(Tables.ROLES.ROLE_NAME.eq(roleName))
                .fetchOne();
        if (accountRecord != null && rolesRecord != null) {
            context.insertInto(Tables.ACCOUNT_ROLE)
                    .columns(Tables.ACCOUNT_ROLE.ACCOUNT_ID, Tables.ACCOUNT_ROLE.ROLE_ID)
                    .values(accountRecord.getAccountId(), rolesRecord.getRoleId())
                    .execute();
        }
    }

    public AccountRecord findByUsername(String username) {
        return context.selectFrom(Tables.ACCOUNT)
                .where(Tables.ACCOUNT.USERNAME.eq(username))
                .fetchOne();
    }

    public List<Account> findAll() {
        return context.selectFrom(Tables.ACCOUNT)
                .fetchInto(Account.class);
    }
}
