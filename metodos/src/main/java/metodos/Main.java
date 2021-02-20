package metodos;

public class Main {

	public static void main(String[] args) {

		calcularFibonacci(7, ",");
		
		System.out.println();
		
		int [] valores = calcularFibonacci(5);
		
		for ( int v : valores) {
			System.out.print(v + "-");
		}

	}

	// Método sem retorno JAVA ( SEM RETORNO )
	static void calcularFibonacci(int vezes, String Separador) {

		// Estas variavés funcionam apenas no bloco do FOR
		for (int i = 0, a = 0, b = 1; i < vezes; i++) {
			System.out.print(a + Separador);

			a = a + b;
			b = a - b;
		}

	}

	static int[] calcularFibonacci(int vezes) {

		int[] resposta = new int[vezes];
		// Estas variavés funcionam apenas no bloco do FOR
		for (int i = 0, a = 0, b = 1; i < vezes; i++) {
			resposta[i] = a;
			a = a + b;
			b = a - b;
		}
		
		// Retorno do metodo
		return resposta;

	}

}
