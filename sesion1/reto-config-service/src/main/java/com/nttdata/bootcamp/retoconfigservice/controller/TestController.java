package com.nttdata.bootcamp.retoconfigservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${usuario.name}")
    private String name;

    @GetMapping("/getNombreUsuario")
    public String getUsuarioName (){
        return name;
    }

}
