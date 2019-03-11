package br.pucrs.exercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {

    // == fields ==
    private LocalDate data;
    private int nVenda;
    private Cliente cliente;
    private List<ItemVenda> lista;

    // == constructors ==
    public Venda() {
        lista = new ArrayList<>();
    }

    // == public methods ==
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getnVenda() {
        return nVenda;
    }

    public void setNVenda(int nVenda) {
        this.nVenda = nVenda;
    }

    // TODO: finish the implementation of the remaining methods.
}
