package logica.operadores.aritimeticos;

public class logicos {

	public static void main(String[] args) {

		boolean a = true ;
		boolean b = !a;  // !  � not no JAVA 
		
		System.out.println(b);
		
		boolean c = true;
		boolean d = true;
		boolean e = c && d; // && �  And JAVA
		
		System.out.println(e);
		
		boolean f = true;
		boolean g = false;
		boolean h = f ||  g   ; // ||  � OR no JAVA 
		
		System.out.println(h);
		

	}

}
