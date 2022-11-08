package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Component
public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail() {
        System.out.println("NotificadorEmail real");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {

        if (this.caixaAlta) {
            mensagem = mensagem.toUpperCase();
        }
        System.out.printf("Notificando %s através do e-mail %s usando SMTP %s: %s \n",
                cliente.getNome(), cliente.getEmail(), getHostServidorSmtp(), mensagem);
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
