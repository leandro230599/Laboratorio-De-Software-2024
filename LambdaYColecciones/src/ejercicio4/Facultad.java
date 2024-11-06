package ejercicio4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Facultad {
	
	List<Alumno> alumnos = new ArrayList<>();
	
	public Alumno getEstudianteMayorNota() {
		return this.alumnos.stream().max(Comparator.comparingDouble(Alumno::getNota_aprobacion))
									.orElse(null);
	}
	
	public List<Alumno> getDosAlumnos(){
		return this.alumnos.stream().limit(2).toList();
	}
	
	public List<Alumno> getEstudianteLaboratorio(){
		return this.alumnos.stream().filter(a -> a.getMateria_aprobada() == "Lab").toList();
	}
	
	public List<Alumno> getPySeis(){
		return this.alumnos.stream().filter(a -> a.getNombre().startsWith("P") && a.getNombre().length() <= 6).toList();
	}
}
