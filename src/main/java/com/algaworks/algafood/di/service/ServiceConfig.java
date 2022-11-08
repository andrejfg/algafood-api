package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoDoNotificador;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    AtivacaoClienteService ativacaoClienteService(@TipoDoNotificador(NivelUrgencia.URGENTE) Notificador notificador){
        return new AtivacaoClienteService(notificador);
    }
}
