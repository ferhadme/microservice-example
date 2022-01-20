package com.ferhad.authservice.repository;

import com.ferhad.authservice.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
