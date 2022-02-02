package com.ferhad.accountservice.repository;

import com.ferhad.accountservice.model.UserAcc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserAcc, Long> {
    UserAcc findByUsername(String username);
}
