package com.ferhad.authservice.repository;

import com.ferhad.authservice.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
