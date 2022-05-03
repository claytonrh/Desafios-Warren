package warrenDesafio;

public class WarrenDesafio1 {		
	
	public static int inverter(int n) {
	    int resultado = 0;
	    while (n > 0) {
	        resultado = 10 * resultado + n % 10;
	        n /= 10;
	    }
	    return resultado;    
	}
	
public static void main(String[] args) {
		
		
	    for (int i = 11; i < 1000000; i++) {
	        if ((i + inverter(i)) % 2 != 0) {
	            System.out.println(i);              
	        }
	    }	    
	}
}
	
	   
	