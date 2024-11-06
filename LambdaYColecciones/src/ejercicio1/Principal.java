package ejercicio1;

import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		Materia materia = new Materia("LAB");
		
		Alumno al1 = new Alumno("Leandro", "Lopez", 15308, 41971);
		Alumno al2 = new Alumno("Micaela", "Lopez", 123134, 505264);
		Alumno al3 = new Alumno("Hector", "Lopez", 20000, 33453);
		Alumno al4 = new Alumno("Delicia", "Meza", 30000, 949494);
		materia.agregarAlumno(al1);
		materia.agregarAlumno(al2);
		materia.agregarAlumno(al3);
		materia.agregarAlumno(al4);
		
		for (Alumno alumno : materia.getAlumnos()) {
			System.out.println("Nombre: "+alumno.getNombre());
		}

	}

}

// Utilizar un SortedSet instanciado con TreeSet y en la clase Alumno implementar Comparable generico de Alumno Comparable<Alumno> e implemento un compareTo
// Para mantener una nomina no solo de alumnos, sino de empleados, clientes, etc. Deberia implementar algo como una superclase denominada Personada con
// atributos en comun y el SortedSet seria de Persona luego al agregar le agrego la instancia de la subclase tipo SortedSet<Persona> y add(new Alumno, new Cliente),etc