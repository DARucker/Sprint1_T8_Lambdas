package n1_exercici3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App8_1_3 {
		
	/*
	 * Crea una llista amb els noms dels mesos del any. Imprimeix tots 
	 * els elements de la llista amb una lambda.
	 */
	
	public static void main(String[] args) {
		
	List<String> listaStrings = new ArrayList<>();
	listaStrings.addAll(Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "Junio", "Julio", "agosto",
			"septiembre", "octubre", "noviembre", "diciembre"));

	
	System.out.println("-> Ejercicio 3" + "\n");
	listaStrings.forEach(s -> System.out.print(s + " "));

	}
}
