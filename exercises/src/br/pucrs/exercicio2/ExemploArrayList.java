package br.pucrs.exercicio2;

import java.util.*;

public class ExemploArrayList {

    public static void main(String[] args) {

        // Criação do ArrayList para armazenar Strings
        ArrayList<String> lista = new ArrayList<String>();

        // Veja como adicionar elementos à lista
        lista.add("Fulano");
        lista.add("Beltrano");
        lista.add("Ciclano");
        lista.add("Huguinho");
        lista.add("Zezinho");
        lista.add("Luizinho");

        // Exibindo a lista
        System.out.println("Lista: "+lista);

        // Inserindo elementos em determinadas posições
        lista.add(0, "Ringo");
        lista.add(1, "John");

        // Removendo elementos da lista (método retorna true ou false)
        lista.remove("Zezinho");
        lista.remove("Fulano");

        System.out.println("Lista agora é: " + lista);

        // Removendo elementos de determinada posição
        lista.remove(1);

        System.out.println("Lista final: " + lista);

        // Exibindo cada elemento da lista em uma linha com for

        System.out.println();
        for(int pos=0; pos < lista.size(); pos++) {
            String nome = lista.get(pos);
            System.out.println(nome);
        }
        System.out.println();

        // Exibindo cada elemento da lista em uma linha com for..each

        for(String nome: lista) {
            System.out.println(nome);
        }
    }
}