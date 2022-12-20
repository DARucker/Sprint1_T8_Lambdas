package n1_exercici8;

public class App8_1_8 {

	/*
	 * Crea una Functional Interface que contenga un m�todo llamado reverse(). 
	 * Este m�todo debe recibir y debe devolver un String. En el main() de la 
	 * clase principal, inyecta a la interfaz creada mediante una lambda, el 
	 * cuerpo del m�todo, de modo que devuelva la misma cadena que recibe 
	 * como par�metro pero al rev�s. Invoca la instancia de la interfaz 
	 * pas�ndole una cadena y comprueba si el resultado es correcto.
	 */

	
	public static void main(String[] args) {

	String string = "Hello world"; 
	Reverser reverser = (s -> new StringBuilder(s).reverse().toString());
	System.out.println(reverser.reverse(string));
	
	
	}
}
