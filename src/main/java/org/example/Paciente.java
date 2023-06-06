package org.example;

import java.util.Observable;
import java.util.Observer;

public class Paciente implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Paciente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void iniciarTratamento(Medico medico) {
        medico.addObserver(this);
    }

    public void update(Observable medico, Object arg1) {
        this.ultimaNotificacao = this.nome + ", exames emitidos por " + medico.toString();
    }
}
