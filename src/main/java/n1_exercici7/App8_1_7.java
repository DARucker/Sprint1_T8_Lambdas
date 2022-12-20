package n1_exercici7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App8_1_7 {

	/*
	 * Con la lista del ejercicio anterior, ahora ordénala al revés, 
	 * de cadena más larga a más corta.
	 */
public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>();
		
		list.add("Leo");
		list.add(10);
		list.add("Messi");
		
		list.sort(Comparator.comparing(s -> s.toString().length()).reversed());
		list.forEach(System.out::println);

	}
}
