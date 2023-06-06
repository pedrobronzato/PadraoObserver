package org.example;

import java.util.Observable;

public class Medico extends Observable {
    private String nome;
    private String especializacao;

    public Medico(String nome, String especializacao) {
        this.nome = nome;
        this.especializacao = especializacao;
    }

    public void emitirExames() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nome=" + nome +
                ", especializacao=" + especializacao +
                '}';
    }
}
