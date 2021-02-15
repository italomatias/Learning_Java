package logica.variaveis;

public class logica_variaveis {

	public static void main(String[] args) {
		
		// Comentário em Java
		//int idade;		
		//idade = 26;
		
		int idade = 26 ;
		double nota = 8.6;
		boolean ligado = true;
		boolean ativo = false;
		
		// String não é um tipo primitivo e Strings sempre em Aspas duplas
		String nome = "Italo Reis";
		
		// Exibindo valor em console 
		System.out.println(nota);
		System.out.println(nome + " -> " + nota);
		
		//VARIAVEIS SEMPRE EM LETRA MINÚSCULA e usar Cammel Case		
		int numeroDePessoas = 10;
		
		// Ao usar VAR a variavél muda conforme o que recebe
		
		var x = 5;      // Isso é Int 
		var y = "Abc";  // Isso é String 
		var z = 2.2; 	// Isso é double 
		var w = true;   // Isso é Boolean
		
		// Ao setar uma variavél o tipo dela não muda , se criou a var recebendo int
		// Ela é int até o final ! 
		
		
		// Usando variavél para nao dar erro no projeto 
		System.out.println(nome + idade  + ligado + ativo + numeroDePessoas + x + y + z + w);
	}

}
