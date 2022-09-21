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
    public String logar(Model model, String email, String senha){
        UserModel userModel = this.repository.Login(email,senha);
        if (userModel != null){
            return "redirect:https://pokedex-mendes-dev.herokuapp.com/";
        }
        model.addAttribute("erro", "Usuário ou senha inválidos");
        return "http://127.0.0.1:5500/index.html";
    }


}
