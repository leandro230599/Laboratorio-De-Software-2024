package ejercicio1;

public class Alumno implements Comparable<Alumno> {
	private int legajo;
	private String apellido;
	private String nombre;
	private int dni;
	
	public Alumno (String nombre, String apellido, int legajo, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.dni = dni;
	}
	
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	@Override
	public int compareTo(Alumno o) {
		return Integer.compare(this.getLegajo(), o.getLegajo());
	}
	
	
}
