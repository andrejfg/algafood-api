package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// Aula 2.7 Criando um controller com Spring MVC
@Controller
public class MeuPrimeiroController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello!";
    }
}
