package bublle_sort;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		int [] valores = { 3 , 6 , 5 , 2 , 1 , 4 , 0 , 7 } ;
		
		System.out.println("Array antes de ordenar");
		
		for ( int x : valores ) {
			
			System.out.print(x + "  ");
			
		}
		
		for(int i = 0 ; i < valores.length -1 ; i++) {
			for (int j = i + 1 ; j < valores.length ; j++) {
				if(valores[i]>valores[j]) {
					int aux = valores[i];
					valores[i] = valores[j];
					valores[j]= aux;
				}
			}
		}
		
		System.out.println(" ");
		System.out.println("Array depois de ordenar");
		
		for ( int x : valores ) {
			
			System.out.print(x + "  ");
			
		}
	}

}
