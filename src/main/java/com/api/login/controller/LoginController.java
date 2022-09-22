package com.api.login.controller;

import com.api.login.model.LoginModel;
import com.api.login.model.UserModel;
import com.api.login.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
    public String logar(@RequestBody LoginModel login){
        if (repository.existsByEmail(login.getEmail())){
            if (repository.existsBySenha(login.getSenha())){
                return "https://pokedex-mendes-dev.herokuapp.com/";
            }
            return "foi email";
        }
        return "n";
    }


}
