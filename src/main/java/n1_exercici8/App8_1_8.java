package n1_exercici8;

public class App8_1_8 {

	/*
	 * Crea una Functional Interface que contenga un método llamado reverse(). 
	 * Este método debe recibir y debe devolver un String. En el main() de la 
	 * clase principal, inyecta a la interfaz creada mediante una lambda, el 
	 * cuerpo del método, de modo que devuelva la misma cadena que recibe 
	 * como parámetro pero al revés. Invoca la instancia de la interfaz 
	 * pasándole una cadena y comprueba si el resultado es correcto.
	 */

	
	public static void main(String[] args) {

	String string = "Hello world"; 
	Reverser reverser = (s -> new StringBuilder(s).reverse().toString());
	System.out.println(reverser.reverse(string));
	
	
	}
}
