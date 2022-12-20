package n1_exercici4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App8_1_4 {

	/*
	Realizar la misma impresión del punto anterior, 
	pero mediante method reference.
	*/
	
	public static void main(String[] args) {

		List<String> listaStrings = new ArrayList<>();
		listaStrings.addAll(Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "Junio", "Julio", "agosto",
				"septiembre", "octubre", "noviembre", "diciembre"));
		
		System.out.println("-> Ejercicio 4" + "\n");
		listaStrings.forEach(System.out::println);

	}

}
