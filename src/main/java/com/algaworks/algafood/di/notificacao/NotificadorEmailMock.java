package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmailMock implements Notificador {

    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmailMock() {
        System.out.println("NotificadorEmail mock");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {

        if (this.caixaAlta) {
            mensagem = mensagem.toUpperCase();
        }
        System.out.printf("Mock: Notificando seria enviada para %s através do e-mail %s: %s \n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

    public String getHostServidorSmtp() {
        return hostServidorSmtp;
    }

    public void setHostServidorSmtp(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }

}
