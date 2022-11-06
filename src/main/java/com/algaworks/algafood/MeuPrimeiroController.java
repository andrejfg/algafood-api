package com.algaworks.algafood;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// Aula 2.7 Criando um controller com Spring MVC
@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService ativacaoCliente;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoCliente) {
        this.ativacaoCliente = ativacaoCliente;
        System.out.println("MeuPrimeiroController: " + ativacaoCliente);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente joao = new Cliente("João", "joao@email.com", "335647891" );

        ativacaoCliente.ativar(joao);
        return "Hello!";
    }
}
