package br.pucrs.oop.exercicio1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CadastroClientes {

    // == fields ==
    private List<Cliente> list;

    // == constructors ==
    public CadastroClientes() {
        list = new ArrayList<>();
    }

    // == public methods ==
    public void addCliente(Cliente toAdd) {
        list.add(toAdd);
    }

    public void removeCliente(String cpf) {
        ListIterator<Cliente> iterator = list.listIterator();

        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getCpf().equals(cpf)) {
                iterator.remove();
                break;
            }
        }
    }

    public void updateCliente(Cliente toUpdate) {
        ListIterator<Cliente> iterator = list.listIterator();

        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();

            if (cliente.equals(toUpdate)) {
                iterator.set(toUpdate);
                break;
            }
        }
    }

    public Cliente getCliente(String cpf) {
        for (Cliente cliente : list) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
}
