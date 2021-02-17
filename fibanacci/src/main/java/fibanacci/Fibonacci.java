package fibanacci;

import br.com.softblue.commons.io.Console;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Digite um valor : ");
		int n = Console.readInt();
		
		// Estas variavés funcionam apenas no bloco do FOR 
		
		for (int i = 0 , a = 0 , b = 1  ; i <= n ; i++)
		{
			System.out.print( a + " ");
			
			a = a + b ;
			b = a - b ;
		}

	}

}
