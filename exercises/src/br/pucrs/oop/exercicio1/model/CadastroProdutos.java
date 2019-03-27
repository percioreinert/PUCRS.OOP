package br.pucrs.oop.exercicio1.model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class CadastroProdutos {

    // == fields ==
    private List<Produto> list;

    // == constructors ==
    public CadastroProdutos() {
        list = new ArrayList<>();
    }

    // == public methods ==
    public List<Produto> getList() {
        return Collections.unmodifiableList(list);
    }
    public void addProduto(Produto toAdd) {
        list.add(toAdd);
    }

    public Produto getProduto(int codigo) {
        for (Produto produto : list) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }
}
