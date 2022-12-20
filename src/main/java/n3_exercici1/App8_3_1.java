package n3_exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App8_3_1 {

	/*
	 * 	Crea una clase Alumno con sus atributos: Nombre, edad, curso y nota.

		Llena una lista con 10 alumnos

		Muestra por pantalla el nombre y la edad de cada alumno/a.
		Filtra la lista por todos los alumnos cuyo nombre comienza 
		por ‘a’. Asigna a estos alumnos a otra lista y muestra por pantalla la nueva lista 
		(todo con lambdes).
		Filtra y muestra por pantalla a los alumnos que tienen una nota de 5 o superior.
		Filtra y muestra por pantalla a los alumnos que tienen una nota de 5 o más, y que no son de PHP.
		Muestra a todos los alumnos que hacen JAVA y son mayores de edad. 
	 */
	
	
	public static void main(String[] args) {

		List<Alumno> alumnos = new ArrayList<>();
		alumnos.add(new Alumno("Martinez", 14 , "PHP",4 ));
		alumnos.add(new Alumno("Messi", 15 , "Python", 6));
		alumnos.add(new Alumno("Alvarez",16 , "Python",5 ));
		alumnos.add(new Alumno("Ardiles", 17 , "PHP",4 ));
		alumnos.add(new Alumno("Houseman",17 , "Java",5 ));
		alumnos.add(new Alumno("Brindisi",18 , "Java", 6));
		alumnos.add(new Alumno("Pastore", 19, "Java", 4));
		alumnos.add(new Alumno("Otamendi",20 , "Python",5 ));
		alumnos.add(new Alumno("Molina",21 , "PHP", 6));
		alumnos.add(new Alumno("De Paul",22 , "PHP",7 ));
		
		System.out.println(" 1. Lista completa" + "\n");
		alumnos.forEach(s -> System.out.println("Nombre " + s.getName() + ", edad: " + s.getAge()));
		System.out.println("\n");
		
		System.out.println(" 2. Comienzan con A" + "\n");
	List<Alumno> shortList = alumnos.stream()	
			.filter(s -> s.getName().startsWith("A"))
			.collect(Collectors.toList());	
		shortList.forEach(s -> System.out.println("Nombre " + s.getName() + ", edad: " + s.getAge()));
		System.out.println("\n");
		
		System.out.println(" 3. Tienen una nota > 5" + "\n");
		alumnos.stream().filter(s -> s.getMark() > 5).forEach(System.out::print);
		System.out.println("\n");
		
		System.out.println(" 4. Tienen una nota > 5 y distinto a PHP" + "\n");
		alumnos.stream().filter(s -> s.getMark() > 5 && !s.getCourse().equals("PHP")).forEach(System.out::print);
		System.out.println("\n");
		
		System.out.println(" 5. Mayor de edad y estudia Java" + "\n");
		alumnos.stream().filter(s -> s.getAge() > 17 && s.getCourse().equals("Java")).forEach(System.out::print);
	}

}
