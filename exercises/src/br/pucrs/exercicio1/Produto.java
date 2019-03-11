package br.pucrs.exercicio1;

public class Produto {

    // == fields ==
    private String nome;
    private int codigo;
    private double preco;

    // == constructors ==
    public Produto(String nome, int codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    // == public methods ==
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
