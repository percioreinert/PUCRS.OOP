package br.pucrs.oop.exercicio1.model;

import br.pucrs.oop.exercicio1.service.CadastroProdutosService;

public class CadastroProdutos {

    // == fields ==
    private CadastroProdutosService service;

    // == constructors ==
    public CadastroProdutos() {
        service = new CadastroProdutosService();
    }

    // == public methods ==
    public void add(Produto produto) {
        service.addProduto(produto);
    }

    public void remove(int codigo) {
        service.removeProduto(codigo);
    }

    public void update(Produto produto) {
        service.updateProduto(produto);
    }

    public Produto getProduto(int codigo) {
        return service.getProduto(codigo);
    }
}
