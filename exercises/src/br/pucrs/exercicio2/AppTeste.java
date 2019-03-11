package br.pucrs.exercicio2;

import java.util.ArrayList;

public class AppTeste {

	public static void main(String[] args) {
		
		//Pessoa[] lista = new Pessoa[10];
		
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa("Fulano",  "89672843585");		
		Pessoa p2 = new Pessoa("Ciclano", "89791656282");
		Pessoa p3 = new Pessoa("Beltrano","78657253901");
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		for(int pos=0; pos < lista.size(); pos++) {
			Pessoa p = lista.get(pos);
			System.out.println(p.getNome()+ " - " + p.getCpf());
		}
		
		for(Pessoa p : lista) {
			System.out.println(p.getNome()+ " - " + p.getCpf());
		}
		
		
		
		
		
	}

}
