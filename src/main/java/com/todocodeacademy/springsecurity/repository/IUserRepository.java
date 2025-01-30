package com.todocodeacademy.springsecurity.repository;

import com.todocodeacademy.springsecurity.model.UserSec;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserSec, Long> {

    Optional<UserSec> findUserEntityByUsername(String username);
}
