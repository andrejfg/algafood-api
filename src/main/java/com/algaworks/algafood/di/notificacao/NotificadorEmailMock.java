package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("development")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmailMock implements Notificador {

    @Autowired
    private NotificadorProperties properties;

    public NotificadorEmailMock() {
        System.out.println("NotificadorEmail mock");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {


        System.out.printf("Mock: Notificando %s através do e-mail %s usando SMTP %s na porta %d: %s \n",
                cliente.getNome(), cliente.getEmail(), properties.getHostServidor(), properties.getPortaServidor(), mensagem);
    }

}
