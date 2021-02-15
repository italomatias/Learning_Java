package logica.variaveis;

public class logica_variaveis {

	public static void main(String[] args) {
		
		// Coment�rio em Java
		//int idade;		
		//idade = 26;
		
		int idade = 26 ;
		double nota = 8.6;
		boolean ligado = true;
		boolean ativo = false;
		
		// String n�o � um tipo primitivo e Strings sempre em Aspas duplas
		String nome = "Italo Reis";
		
		// Exibindo valor em console 
		System.out.println(nota);
		System.out.println(nome + " -> " + nota);
		
		//VARIAVEIS SEMPRE EM LETRA MIN�SCULA e usar Cammel Case		
		int numeroDePessoas = 10;
		
		// Ao usar VAR a variav�l muda conforme o que recebe
		
		var x = 5;      // Isso � Int 
		var y = "Abc";  // Isso � String 
		var z = 2.2; 	// Isso � double 
		var w = true;   // Isso � Boolean
		
		// Ao setar uma variav�l o tipo dela n�o muda , se criou a var recebendo int
		// Ela � int at� o final ! 
		
		
		// Usando variav�l para nao dar erro no projeto 
		System.out.println(nome + idade  + ligado + ativo + numeroDePessoas + x + y + z + w);
	}

}
