package com.ferhad.accountservice.repository;

import com.ferhad.accountservice.model.RoleAcc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleAcc, Long> {
    RoleAcc findByName(String name);
}
