package br.pucrs.oop.exercicio1.model;

import java.util.*;

public class CadastroClientes {

    // == fields ==
    private List<Cliente> list;

    // == constructors ==
    public CadastroClientes() {
        list = new ArrayList<>();
    }

    // == public methods ==
    public List<Cliente> getList() {
        return Collections.unmodifiableList(list);
    }
    public void addCliente(Cliente toAdd) {
        list.add(toAdd);
    }

    public Cliente getCliente(String id) {
        for (Cliente cliente : list) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        return null;
    }
}
