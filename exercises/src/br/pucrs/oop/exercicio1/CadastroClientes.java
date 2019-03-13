package br.pucrs.oop.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class CadastroClientes {

    // == fields ==
    private List<Cliente> lista;

    // == constructors ==
    public CadastroClientes() {
        lista = new ArrayList<>();
    }

    // == public methods ==
    public void add(Cliente cliente) {
        lista.add(cliente);
    }
}
