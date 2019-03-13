package br.pucrs.oop.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class CadastroProdutos {

    // == fields ==
    private List<Produto> lista;

    // == constructors ==
    public CadastroProdutos() {
        lista = new ArrayList<>();
    }

    // == public methods ==
    public void add(Produto produto) {
        lista.add(produto);
    }
}
