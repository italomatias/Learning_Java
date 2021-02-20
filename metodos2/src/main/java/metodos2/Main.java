package metodos2;

public class Main {

	public static void main(String[] args) {
		
		double temp = converterParaCelsius(100.85);
		
		System.out.println("Fahrenheit = " + temp);
		
		double temp2 = converterParaFahrenheit(41.5);
		
		System.out.println("Celsius = " + temp2);
		

	}
	
	static double converterParaCelsius ( double temp ) {
		
		return  ( temp - 32 ) / 1.8 ;		
		
	}
	
	static double converterParaFahrenheit ( double temp ) {
		
		return  temp * 1.8 + 32 ;
				
	}

}
