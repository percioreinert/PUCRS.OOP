package br.pucrs.oop.exercicio1.model;

import br.pucrs.oop.exercicio1.service.CadastroClientesService;

public class CadastroClientes {

    // == fields ==
    private CadastroClientesService service;

    // == constructors ==
    public CadastroClientes() {
        service = new CadastroClientesService();
    }

    // == public methods ==
    public void add(Cliente cliente) {
        service.addCliente(cliente);
    }

    public void remove(int id) {
        service.removeCliente(id);
    }

    public void update(Cliente cliente) {
        service.updateCliente(cliente);
    }

    public Cliente getCliente(String cpf) {
        return service.getCliente(cpf);
    }
}
