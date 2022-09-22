package com.api.login.controller;

import com.api.login.model.LoginModel;
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
    public boolean logar(@RequestBody LoginModel login){
        if (repository.existsByEmail(login.getEmail())){
            if (repository.existsBySenha(login.getSenha())){
                return true;
            }
        }
        return false;
    }


}
