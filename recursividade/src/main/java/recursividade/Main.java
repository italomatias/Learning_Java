package recursividade;

public class Main {

	public static void main(String[] args) {
		
	 int r =	fatorial(10);
	 
	 System.out.println(r);

	}
	
	static int fatorial (int n ) {
		
		if (n == 0) {
			return 1;
		}
		
		return n * fatorial (n-1);
	}

}
