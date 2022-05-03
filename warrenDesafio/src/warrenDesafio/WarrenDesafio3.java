package warrenDesafio;

public class WarrenDesafio3 {
	
public static void main(String[] args) {		
		
	int n = 10; 
	int[] v = { 2, 4, 5, 6, 9, 10 };

	for ( int i = 0; i < v.length; i++ ) {
	    for ( int j = i + 1; j < v.length; j++ ) {
	        for ( int k = j + 1; k < v.length; k++ ) {
	            if ( v[i] + v[j] + v[k] == n ) {         	           
         	            	
	            }	
	            int soma = i+j+k;
            	if(soma==n) 		         
            	System.out.printf("%d + %d + %d = %d \n",i,j,k, soma);
	        }		        
	    }		    
	}		
}	
}

