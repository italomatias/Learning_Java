package Learning.For;

import br.com.softblue.commons.io.Console;

public class Learning_FOR {

	public static void main(String[] args) {
		
		
		System.out.println("Digite um número : ");
		
		int num = Console.readInt();
		
		// FOR EM JAVA 
		for( int x = 0 ; x <= 10 ; x++  ) {
			
			System.out.println(num + " X " + x + " = " + (num * x));
			
		}

	}

}
