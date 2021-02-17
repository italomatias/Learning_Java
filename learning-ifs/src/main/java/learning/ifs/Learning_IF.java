package learning.ifs;

import br.com.softblue.commons.io.Console;

public class Learning_IF {

	public static void main(String[] args) {
		
		System.out.println("Digite a sua idade: ");
		int idade = Console.readInt();
		
		if(idade >= 0 && idade <=12 ) 
			System.out.println("Criança");
		else if (idade > 12 && idade <= 17  ) 
			System.out.println("Adolescente");
		else if (idade >= 17 && idade <=59 )
			System.out.println("Adulto");
		else 
			System.out.println("Idoso");
		

}
}