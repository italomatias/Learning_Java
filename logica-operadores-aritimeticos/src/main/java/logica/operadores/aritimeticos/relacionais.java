package logica.operadores.aritimeticos;

import br.com.softblue.commons.io.Console;

public class relacionais {

	public static void main(String[] args) {
		
		System.out.println("Digite um n�mero : ");
		int n1 = Console.readInt();
		
		System.out.println("Digite um n�mero : ");
		int n2 = Console.readInt();
		
		
		boolean igual =  n1 == n2;
		boolean dif   =  n1!=n2; 
		boolean primeiroMaiorSegundo = n1>n2;
		boolean primeiroMaiorIgualSegundo = n1>=n2;
		
		System.out.println("Iguais ? " + igual);
		System.out.println("Diferentes ? " + dif);
		System.out.println("Primeiro Maior que segundo ? " + primeiroMaiorSegundo);
		System.out.println("Primeiro Maior ou igual que segundo ? " + primeiroMaiorIgualSegundo);
		
		

	}

}
