package br.pucrs.oop.exercicio1.app;

import br.pucrs.oop.exercicio1.model.*;

import java.util.Scanner;

public class App {

    // == static fields ==
    private static CadastroClientes clientes = new CadastroClientes();
    private static CadastroProdutos produtos = new CadastroProdutos();
    private static Scanner scanner = new Scanner(System.in);
    private static Venda venda;

    // == main method ==
    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("== MENU ==");
            System.out.println("1 - Cadastrar um novo cliente");
            System.out.println("2 - Cadastrar um novo produto");
            System.out.println("3 - Efetuar uma venda");
            System.out.println("4 - Emitir a nota fiscal");
            System.out.println("0 - Sair");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: cadastrarCliente();
                    break;
                case 2: cadastrarProduto();
                    break;
                case 3: venda();
                    break;
                default:
                    break;
            }
        } while (choice < 0 || choice > 3);
    }

    // == private static methods ==
    private static void cadastrarCliente() {
        String cpf, nome;

        System.out.println("== CADASTRAR CLIENTE");
        System.out.println("Digite o CPF:");
        cpf = scanner.nextLine();
        System.out.println("Digite o nome:");
        nome = scanner.nextLine();
        Cliente toAdd = new Cliente(cpf, nome);

        clientes.add(toAdd);
    }

    private static void cadastrarProduto() {
        String nome;
        int codigo;
        double preco;

        System.out.println("== CADASTRAR PRODUTO");
        System.out.println("Digite o nome");
        nome = scanner.nextLine();
        System.out.println("Digite o código");
        codigo = scanner.nextInt();
        System.out.println("Digite o preço");
        preco = scanner.nextDouble();
        Produto toAdd = new Produto(nome, codigo, preco);

        produtos.add(toAdd);
    }

    private static void venda() {
        String choice, cpf;

        System.out.println("== VENDA ==");
        System.out.println("Quer adicionar o cpf? S/N");
        choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("S")) {
            System.out.println("Digite o CPF:");
            cpf = scanner.nextLine();
            Cliente cliente = clientes.getCliente(cpf);
            venda = new Venda(cliente);
        } else {
            venda = new Venda();
        }

        System.out.println("Adicione um produto");

        // TODO: Finish this implementation.
    }

    // TODO: Finish the implementation of the App.
}
