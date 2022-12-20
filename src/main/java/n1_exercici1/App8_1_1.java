package n1_exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App8_1_1 {

	/*
	A partir de una lista de Strings, escribe un metodo que devuelve una 
	lista de todas las cadenas que contienen la letra o. Imprime el resultado.
	*/
	
	public static void main(String[] args) {
		
		List<String> listaStrings = new ArrayList<>();
		listaStrings.addAll(Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "Junio", "Julio", "agosto",
				"septiembre", "octubre", "noviembre", "diciembre"));
		
		listaStrings.stream()
			.filter (s -> s.contains("o"))
			.forEach(s -> System.out.print(s + " "));
		System.out.println("\n");


	}

}
