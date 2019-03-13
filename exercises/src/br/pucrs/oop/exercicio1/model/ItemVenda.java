package br.pucrs.oop.exercicio1.model;

import java.util.Objects;

public class ItemVenda {

    // == fields ==
    private int id;
    private int quantidade;
    private Produto produto;

    // == constructors ==
    public ItemVenda(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    // == public methods ==
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemVenda itemVenda = (ItemVenda) o;
        return id == itemVenda.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
