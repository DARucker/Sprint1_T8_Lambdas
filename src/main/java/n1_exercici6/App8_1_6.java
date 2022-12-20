package n1_exercici6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App8_1_6 {

	/*
	 * Crea una lista con números y cadenas de texto y ordena la lista con las
	 *  cadenas de más corta a más larga.
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
