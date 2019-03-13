package br.pucrs.oop.exercicio1;

public class Cliente {

    // == fields ==
    private String cpf;
    private String nome;

    // == constructors ==
    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    // == public methods ==
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
