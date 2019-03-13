package br.pucrs.oop.exercicio1.service;

import br.pucrs.oop.exercicio1.model.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class CadastroProdutosService {

    // == fields ==
    private List<Produto> list;

    // == constructors ==
    public CadastroProdutosService() {
        list = new ArrayList<>();
    }

    // == public methods ==
    public List<Produto> getProdutos() {
        return Collections.unmodifiableList(list);
    }

    public void addProduto(Produto toAdd) {
        list.add(toAdd);
    }

    public void removeProduto(int codigo) {
        ListIterator<Produto> iterator = list.listIterator();

        while (iterator.hasNext()) {
            Produto produto = iterator.next();

            if (produto.getCodigo() == codigo) {
                iterator.remove();
                break;
            }
        }
    }

    public void updateProduto(Produto toUpdate) {
        ListIterator<Produto> iterator = list.listIterator();

        while (iterator.hasNext()) {
            Produto produto = iterator.next();

            if (produto.equals(toUpdate)) {
                iterator.set(toUpdate);
                break;
            }
        }
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
