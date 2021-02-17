package learning;

import br.com.softblue.commons.io.Console;

public class While {

	public static void main(String[] args) {
		/* Exemplo Do While
		double nota = 0 ;
		int count = 1;
		
		do {
			
			System.out.println("Digite uma nota " + count++ + " : ");
			nota +=  Console.readDouble();	
			
			
			
		}while( nota != -1 );
		
		System.out.println("A média das notas é : " + (nota/count));
		*/
		
		double nota = 0 ;
		
		while(nota != -1) {
			System.out.println("Digite a nota :");
			nota = Console.readDouble();
			
			// break;  Sai do bloco de repetição ! 
			
		}
		

	}

}
