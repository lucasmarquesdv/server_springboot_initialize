package com.rootmann.server.controller;

@RestController
public class MeuController {

    @GetMapping("http://localhost:8080/")
    public String meuMetodo() {
        return "Olá, mundo!"
    }
}
