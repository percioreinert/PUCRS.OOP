package br.pucrs.oop.exercicio1.model;

import br.pucrs.oop.exercicio1.util.NomesProduto;

public class ConcreteProdutoFactory implements ProdutoFactory {

    @Override
    public Produto getProduto(String type) {

        if (type.equalsIgnoreCase(NomesProduto.P1)) {
//            return new P1;
        } else if (type.equalsIgnoreCase(NomesProduto.P2)) {
//            return new P2;
        } else if (type.equalsIgnoreCase(NomesProduto.P3)) {
//            return new P3;
        } else if (type.equalsIgnoreCase(NomesProduto.P4)) {
//            return new P4;
        }
        return null;
    }
}
