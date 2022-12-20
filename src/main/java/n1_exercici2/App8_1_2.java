package n1_exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App8_1_2 {

	/*
	Tienes que hacer lo mismo que en el punto anterior, pero ahora, 
	 el metodo debe devolver una lista con los Strings que ademas 
	 de contener la letra o tambien tienen mas de 5 letras. 
	 Imprime el resultado.
	
	 */
	public static void main(String[] args) {
	
	List<String> listaStrings = new ArrayList<>();
	listaStrings.addAll(Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "Junio", "Julio", "agosto",
			"septiembre", "octubre", "noviembre", "diciembre"));
	
	listaStrings.stream()
	.filter(s -> s.contains("o") 
	&& s.length() > 5)
	.forEach(s -> System.out.print(s + " "));
	}
}
