package com.algaworks.algafood.di.notificacao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {

    @Bean // é necessário remover @component da classe original
    @TipoDoNotificador(NivelUrgencia.NORMAL)
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }

    @Bean // é necessário remover @component da classe original
    @TipoDoNotificador(NivelUrgencia.URGENTE)
    public NotificadorSMS notificadorSMS() {
        NotificadorSMS notificador = new NotificadorSMS();
        notificador.setCaixaAlta(true);

        return notificador;
    }

}