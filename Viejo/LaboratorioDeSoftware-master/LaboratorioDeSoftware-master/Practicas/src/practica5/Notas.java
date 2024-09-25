package practica5;

public enum Notas {
    DO("C"),
    RE("D"),
	MI("E"),
	FA("F"),
	SOL("G"),
	LA("A"),
	SI("B");
	
	private String nota;
	
	Notas(String nota){
		this.nota=nota;
	}
	
	public String toString() {
		return nota;
	}
    
}
