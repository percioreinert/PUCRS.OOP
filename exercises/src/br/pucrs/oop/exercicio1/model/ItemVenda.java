package br.pucrs.oop.exercicio1.model;

public class ItemVenda {

    // == fields ==
    private int quantidade;
    private Produto produto;

    // == constructors ==
    public ItemVenda(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    // == public methods ==
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
