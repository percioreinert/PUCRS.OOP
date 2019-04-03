package br.pucrs.oop.exercicio1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Venda {

    // == static fields ==
    private static int id = 1;
    private static int totalVendas = 1;

    // == fields ==
    private LocalDate data;
    private int nVenda;
    private Cliente cliente;
    private List<ItemVenda> list;

    // == constructors ==
    public Venda() {
        list = new ArrayList<>();
        data = LocalDate.now();
        nVenda = totalVendas;
        totalVendas++;
    }

    public Venda(Cliente cliente) {
        list = new ArrayList<>();
        data = LocalDate.now();
        nVenda = totalVendas;
        totalVendas++;
        this.cliente = cliente;
    }

    // == public methods ==
    public LocalDate getData() {
        return data;
    }

    public int getNVenda() {
        return nVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemVenda> getList() {
        return Collections.unmodifiableList(list);
    }

    public void addItemVenda(ItemVenda item) {
        item.setId(id);
        list.add(item);
        id++;
    }

    public void removeItemVenda(int id) {
        ListIterator<ItemVenda> iterator = list.listIterator();

        while (iterator.hasNext()) {
            ItemVenda item = iterator.next();

            if (item.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }

    public void updateItemVenda(ItemVenda toUpdate) {
        ListIterator<ItemVenda> iterator = list.listIterator();

        while (iterator.hasNext()) {
            ItemVenda item = iterator.next();

            if (item.equals(toUpdate)) {
                iterator.set(item);
                break;
            }
        }
    }

    public ItemVenda getItemVenda(int id) {
        for (ItemVenda item : list) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public double getTotal() {
        ListIterator<ItemVenda> iterator = list.listIterator();
        double total = 0;

        while (iterator.hasNext()) {
            ItemVenda item = iterator.next();

            total += item.getTotal();
        }
        return total;
    }

    public String emitirNotaFiscal() {
        StringBuilder builder = new StringBuilder("== NOTA FISCAL ==\n\n");
        builder.append("Data: ");
        builder.append(getData());
        builder.append("\n\nNº da venda:");
        builder.append(getNVenda());
        if (getCliente() != null) {
            builder.append("\nCPF:");
            builder.append(getCliente().getCodigo());
        }
        builder.append("\n\nLista de Itens:");
        for (ItemVenda item : list) {
            builder.append(item.toString());
            builder.append("\nTotal do Item:");
            builder.append(item.getTotal());
        }
        builder.append("\n\nTotal da venda: ");
        builder.append(getTotal());

        return builder.toString();
    }
}
