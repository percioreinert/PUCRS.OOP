package br.pucrs.oop.exercicio1.model;

import java.util.Objects;

public class ClientePJ extends Cliente {

    // == fields ==
    private String cnpj;

    // == constructors ==
    public ClientePJ(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    // == public methods ==
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientePJ clientePJ = (ClientePJ) o;
        return cnpj.equals(clientePJ.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj);
    }
}
