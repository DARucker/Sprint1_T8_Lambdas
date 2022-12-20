package n2_exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App8_2_1 {

	/*Crea una lista de cadenas con nombres propios. Escribe un método
	 *  que devuelve una lista de todas las cadenas que comienzan 
	 *  con la letra 'A' (mayúscula) y tienen exactamente 3 letras. 
	 *  Imprime el resultado.
	 */
	
	
	public static void main(String [] args) {
		
		List <String> nombres = new ArrayList<>();
		
		nombres.addAll(Arrays.asList("Leo", "Messi", "Julian", "Ana", "Angel"));
		
		nombres.stream()
			.filter(s -> s.length() == 3 && s.startsWith("A"))
			.forEach(s -> System.out.print(s + " "));		
		
	}
	
}
