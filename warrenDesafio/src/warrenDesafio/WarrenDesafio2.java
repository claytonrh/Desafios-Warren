package warrenDesafio;

public class WarrenDesafio2 {
	
	public static void main(String[] args) {	
	
		int[] horariosDeChegada = {-3, -2, 1, 0, 1, -2, 3, -1, 0, 5};
		int atrasados = 0; {
		for (int horario : horariosDeChegada) {
		    if (horario < 0) {
		        atrasados++;
		    }
		}
		if ((double) atrasados / horariosDeChegada.length > 0.3) {
		    System.out.println("Aula Cancelada!!!");
		} else {
		    System.out.println("Aula Normal");
		}
	}
}
}