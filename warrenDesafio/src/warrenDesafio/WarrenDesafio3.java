package DesafioWarren;
import java.util.Arrays;
import java.util.List;

public class WarrenDesafio3 {
	
public static void main(String[] args) {		       
	    
	 int n = 10;
	    
	    List<Integer> lista = Arrays.asList(2,3,4);   

	    
	    for(int a = lista.get(0); a <= lista.get(2); a++) { 
	        for(int b = lista.get(1); b <= lista.get(2); b++) { 
	            for(int c = lista.get(2); c <= lista.get(2); c++) {                 

	    int soma = a+b+c;
	    if(soma==n) 
	    System.out.printf("%d + %d + %d = %d \n",a,b,c, soma);           
	    }
	}
}
}
}

