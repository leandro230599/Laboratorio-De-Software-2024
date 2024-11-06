package ejercicio1;

import java.util.SortedSet;
import java.util.TreeSet;

public class Materia {
	private String nombre;
	SortedSet<Alumno> alumnos;
	
	public Materia (String nombre) {
		this.nombre = nombre;
		this.alumnos = new TreeSet<>();
	}
	
	public void agregarAlumno(Alumno a) {
		this.alumnos.add(a);
	}
	
	public SortedSet<Alumno> getAlumnos(){
		return this.alumnos;
	}
}
