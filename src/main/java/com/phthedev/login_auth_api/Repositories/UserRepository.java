package com.phthedev.login_auth_api.Repositories;

import com.phthedev.login_auth_api.Domain.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User, String> {
    Optional<User> findByEmail(String email);
}
