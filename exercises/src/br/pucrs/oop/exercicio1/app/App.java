package br.pucrs.oop.exercicio1.app;

import br.pucrs.oop.exercicio1.model.*;

public class App {

    public static void main(String[] args) {

        CadastroClientes clientes = new CadastroClientes();
        CadastroProdutos produtos = new CadastroProdutos();

        // == Criação dos objetos ==
        System.out.println();
        Cliente c1 = new ClientePF("111", "João", "45643");
        Cliente c2 = new ClientePJ("222", "Pedro", "23496");
        Cliente c3 = new ClienteEstrangeiro("333", "Maria", "45856");

        Produto p1 = new Produto("Bolacha", 111, 1.99);
        Produto p2 = new Produto("Refrigerante", 222, 3.99);
        Produto p3 = new Produto("Salgado", 333, 5.00);

        // == Inserção ==
        clientes.addCliente(c1);
        clientes.addCliente(c2);
        clientes.addCliente(c3);

        produtos.addProduto(p1);
        produtos.addProduto(p2);
        produtos.addProduto(p3);

        // == Listagem ==
        System.out.println("== LISTAGEM ==\n");
        for (Cliente cliente : clientes.getList()) {
            System.out.println(cliente);
        }

        for (Produto produto : produtos.getList()) {
            System.out.println(produto);
        }
        System.out.println();

        // == Pesquisa ==
        System.out.println("== PESQUISA ==\n");
        Cliente cliente = clientes.getCliente("111");
        System.out.println(cliente);

        Produto produto = produtos.getProduto(222);
        System.out.println(produto);

        System.out.println();

        // == Venda (sem CPF) ==
        Venda venda1 = new Venda();

        // == Venda (com CPF) ==
        Venda venda2 = new Venda(clientes.getCliente("333"));

        // == Prosseguimento da venda ==
        ItemVenda item1 = new ItemVenda(3, produtos.getProduto(111));
        ItemVenda item2 = new ItemVenda(2, produtos.getProduto(222));
        ItemVenda item3 = new ItemVenda(1, produtos.getProduto(333));

        venda1.addItemVenda(item1);
        venda1.addItemVenda(item2);
        venda1.addItemVenda(item3);

        venda2.addItemVenda(item1);
        venda2.addItemVenda(item2);
        venda2.addItemVenda(item3);

        // == Listagem das vendas ==
        System.out.println("== LISTAGEM DAS VENDAS ==");
        for (ItemVenda item : venda1.getList()) {
            System.out.println(item);
        }

        for (ItemVenda item : venda2.getList()) {
            System.out.println(item);
        }

        System.out.println();

        // == Emissão da NF ==
        System.out.println("== EMISSÃO DAS NOTAS FISCAIS ==");
        System.out.println(venda1.emitirNotaFiscal());

        System.out.println(venda2.emitirNotaFiscal());

    }
}
