package com.api.login.controller;

import com.api.login.model.UserModel;
import com.api.login.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/api")
public class LoginController {

    @Autowired
    private Repository repository;

    @PostMapping("/logar")
    public String logar(@RequestBody String email, String senha){
        if (repository.findByEmail(email).isPresent()){
            return "entrou";
        }
        return "erro";
    }


}
