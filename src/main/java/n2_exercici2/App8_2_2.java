package n2_exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App8_2_2 {

	/*
	 * Programa un método que devuelve una cadena separada por comas, basada en una
	 * lista de Integers. Cada elemento debe ir precedido por letra “e” si el número
	 * es par, o por la letra “o” si el número es impar. Por ejemplo, si la lista de
	 * entrada es (3, 55, 44), la salida debe ser “o3, o55, e44”. Imprime el
	 * resultado.
	 */

	public static void main(String[] args) {


		System.out.println(modifyList());
		
	}
	
		
		public static String modifyList() {
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(3, 55, 44));

		String result = (String) list.stream().map(n -> {
			if (n % 2 == 0) {
				return "e" + n.toString();
			} else {
				return "o" + n.toString();
			}
		}).collect(Collectors.joining(", "));
		return result;
		
	}
}
