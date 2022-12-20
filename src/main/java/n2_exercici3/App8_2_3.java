package n2_exercici3;

public class App8_2_3 {

	public static void main(String[] args) {
		
		
		/* Crea una Functional Interface que contenga un método llamado operacion().
		 *  Este método debe devolver un float. Inyecta a la interfaz creada 
		 *  mediante una lambda, el cuerpo del método, de modo que se pueda 
		 *  transformar la operación con una suma, una resta, 
		 *  una multiplicación y una división.
		 */
		
		
	FuncInterface suma = (x,y) -> x+y;
	FuncInterface resta = (x,y) -> x-y;
	FuncInterface multiplicar = (x,y) -> x*y;
	FuncInterface dividir = (x,y) -> x/y;
	
	System.out.println(suma.operacion(8, 2));
	System.out.println(resta.operacion(8, 2));
	System.out.println(multiplicar.operacion(8, 2));
	System.out.println(dividir.operacion(8, 2));
	}
}
