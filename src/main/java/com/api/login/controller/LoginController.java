package com.api.login.controller;

import com.api.login.model.LoginModel;
import com.api.login.model.UserModel;
import com.api.login.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class LoginController {

    @Autowired
    private Repository repository;

    @GetMapping("/up")
    public String up(){
        return "up";
    }

    @PostMapping("/login")
    public boolean login(@RequestBody LoginModel UserLogin){
        if (repository.existsByEmail(UserLogin.getEmail())){
            if (repository.existsBySenha(UserLogin.getSenha())){
                return true;
            }
        }
        return false;
    }

    @PostMapping("/cadastrar")
    public boolean cadastrar(@RequestBody UserModel model){
        if (repository.existsByEmail(model.getEmail())){
            return false;
        }
        repository.save(model);
        return true;
    }


}
