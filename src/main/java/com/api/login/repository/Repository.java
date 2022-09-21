package com.api.login.repository;

import com.api.login.model.UserForm;
import com.api.login.model.UserUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Repository extends JpaRepository<UserForm,Long> {
    Optional<UserForm> findByNome(String nome);
}
