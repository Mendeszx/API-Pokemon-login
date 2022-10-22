package com.api.login.repository;

import com.api.login.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<UserModel,Integer> {
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
    boolean existsBySenha(String senha);
}
