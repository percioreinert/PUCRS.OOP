package br.pucrs.oop.exercicio1.model;

import java.util.Objects;

public class Cliente {

    // == fields ==
    private String nome;

    // == constructors ==
    public Cliente(String nome) {
        this.nome = nome;
    }

    // == public methods ==
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
