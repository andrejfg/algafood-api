package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

    @Autowired
    private NotificadorProperties properties;

    public NotificadorEmail() {
        System.out.println("NotificadorEmail real");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {


        System.out.printf("Notificando %s através do e-mail %s usando SMTP %s na porta %d: %s \n",
                cliente.getNome(), cliente.getEmail(), properties.getHostServidor(), properties.getPortaServidor(), mensagem);
    }

}
