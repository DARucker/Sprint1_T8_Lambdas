package n1_exercici6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App8_1_6 {

	/*
	 * Crea una lista con n�meros y cadenas de texto y ordena la lista con las
	 *  cadenas de m�s corta a m�s larga.
	 */

	
	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>();
		
		list.add("Leo");
		list.add(10);
		list.add("Messi");
		
		list.sort(Comparator.comparing(s -> s.toString().length()));
		list.forEach(System.out::println);
		
	}

}
