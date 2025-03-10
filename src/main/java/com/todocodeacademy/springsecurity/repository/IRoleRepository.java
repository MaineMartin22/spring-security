package com.todocodeacademy.springsecurity.repository;

import com.todocodeacademy.springsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Long> {
}
