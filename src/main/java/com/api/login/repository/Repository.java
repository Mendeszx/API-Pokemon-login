package com.api.login.repository;

import com.api.login.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface Repository extends JpaRepository<UserModel,Integer> {
    @Query(value="select * from administradores where email = :email and senha = :senha", nativeQuery = true)
    public UserModel Login(String email, String senha);
}
