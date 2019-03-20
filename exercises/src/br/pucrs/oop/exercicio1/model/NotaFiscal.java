package br.pucrs.oop.exercicio1.model;

public class NotaFiscal {

    // == fields ==
    private Venda venda;

    // == constructors ==
    public NotaFiscal(Venda venda) {
        this.venda = venda;
    }

    // == public methods ==
    public String getNotaFiscal() {
        StringBuilder builder = new StringBuilder("== NOTA FISCAL ==\n\n");
        builder.append("Data: ");
        builder.append(venda.getData());
        builder.append("\n\nNº da venda:");
        builder.append(venda.getNVenda());
        if (venda.getCliente() != null) {
            builder.append("\nCPF:");
            builder.append(venda.getCliente().getCpf());
        }
        builder.append("\n\nLista de Itens:");
        for (ItemVenda item : venda.getList()) {
            builder.append(item.toString());
            builder.append("\nTotal do Item:");
            builder.append(item.getTotal());
        }
        builder.append("\n\nTotal da venda: ");
        builder.append(venda.getTotal());

        return builder.toString();
    }
}
