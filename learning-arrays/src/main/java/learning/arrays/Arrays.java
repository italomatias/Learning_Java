package learning.arrays;

import br.com.softblue.commons.io.Console;

public class Arrays {

	public static void main(String[] args) {
		/*
		System.out.println("Digite a nota 1: ");
		double n1 = Console.readDouble();
		
		System.out.println("Digite a nota 2: ");
		double n2 = Console.readDouble();
		
		System.out.println("Digite a nota 3: ");
		double n3 = Console.readDouble();
		
		System.out.println("Notas : ");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		*/
		
		
		System.out.println("Digite a qtd de notas: ");
		int qtd = Console.readInt();
		
		// Declaração de array
		double [] notas = new double[qtd];
		
		for (int i = 0 ; i < notas.length ; i++ ) {
			
			System.out.println("Digite a nota : "    );
			notas[i]= Console.readDouble();
			
		}
		
		
		// FOR do inicio ao fim do fetor ( FORECH ) 
		for( double nota : notas ) {
			System.out.println(nota);
		}
		
	}

}
