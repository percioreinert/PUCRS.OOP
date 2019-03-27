package br.pucrs.oop.exercicio1.model;

import java.util.Objects;

public class ClientePF extends Cliente {

    // == fields ==
    private String cpf;

    // == constructors ==
    public ClientePF(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    // == public methods ==
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientePF clientePF = (ClientePF) o;
        return cpf.equals(clientePF.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
