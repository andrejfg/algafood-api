package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;


public class NotificadorSMS implements Notificador {

    private boolean caixaAlta;

    public NotificadorSMS() {
        System.out.println("NotificadorSMS");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {

        if (this.caixaAlta) {
            mensagem = mensagem.toUpperCase();
        }
        System.out.printf("Notificando %s através do SMS através do telefone %s: %s \n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }

}
