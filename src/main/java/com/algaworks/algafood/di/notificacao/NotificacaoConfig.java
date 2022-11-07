package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NotificacaoConfig {

    @Bean // é necessário remover @component da classe original
    @Qualifier("normal")
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }

    @Bean // é necessário remover @component da classe original
    @Qualifier("urgente")
    public NotificadorSMS notificadorSMS() {
        NotificadorSMS notificador = new NotificadorSMS();
        notificador.setCaixaAlta(true);

        return notificador;
    }

}