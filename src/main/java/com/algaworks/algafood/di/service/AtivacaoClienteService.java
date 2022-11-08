package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class AtivacaoClienteService {
    private final Notificador notificador;

    @Autowired
    public AtivacaoClienteService(@TipoDoNotificador(NivelUrgencia.NORMAL) Notificador notificador) {
        this.notificador = notificador;
    }

    @PostConstruct
    public void init(){ System.out.println("INIT");}
    @PreDestroy
    public void destroy(){System.out.println("DESTROY");}
    public void ativar(Cliente cliente) {
        cliente.ativar();
        if (notificador != null)
            notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
        else
            System.out.println("Não existe notificador, mas cliente foi ativado");
    }
}
