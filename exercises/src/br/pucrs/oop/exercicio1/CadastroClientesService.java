package br.pucrs.oop.exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class CadastroClientesService {

    // == constants ==
    private static int id = 1;

    // == fields ==
    private List<Cliente> list;

    // == constructors ==
    public CadastroClientesService() {
        list = new ArrayList<>();
    }

    // == public methods ==
    public List<Cliente> getClientes() {
        return Collections.unmodifiableList(list);
    }

    public void addCliente(Cliente toAdd) {
        toAdd.setId(id);
        list.add(toAdd);
        id++;
    }

    public void removeCliente(int id) {
        ListIterator<Cliente> iterator = list.listIterator();

        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getId() == id) {
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
