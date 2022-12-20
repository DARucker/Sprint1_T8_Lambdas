package n2_exercici4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class App8_2_4 {

	public static void main (String args[]) {
		
		/* 
		 * 	Crea una lista que contenga algunas cadenas de texto y números.
			Ordénalas por:
			Alfabéticamente por su primer carácter. (Nota: charAt(0) devuelve 
			el código numérico del primer carácter) 
			Las cadenas que contienen una "e" primero, el resto de cadenas después. Pone el código directamente en la lambda.
			Modifica todos los elementos de la lista que tienen una a. Modifica la 'a' por un '4'.
			Muestra sólo los elementos que son numéricos. (Aunque estén guardados como Strings).
		 */
		
		List<Object> list = new ArrayList<>();
		list.addAll(Arrays.asList(24, "hola", "Europa", "mundo", 2022, "europeo", "Hello", "world", "Lio", "Messi"));	
			
		System.out.println("  1. ordenado por el primer caracter" + "\n");
		list.sort(Comparator.comparing(s -> s.toString().charAt(0)));
		list.forEach(System.out::println);
			
		System.out.println("\n");
		System.out.println("  2.  primero los que comienzan con e" + "\n");
		list.stream().filter(s -> s.toString().startsWith("e")).forEach(System.out::println);
		list.stream().filter(s -> !s.toString().startsWith("e")).forEach(System.out::println);	
		
		System.out.println("\n");
		System.out.println("  3.  reemplazo a por 4" + "\n");
		list.forEach(s -> System.out.println(s.toString().replace("a", "4")));
	
		System.out.println("\n");
		System.out.println("  4.  Solo se muestran las cadenas numericas" + "\n");
		list.stream().filter(s -> StringUtils.isNumeric(s.toString())).forEach(System.out::println);
	}
	
}
