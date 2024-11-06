package ejercicio4;

class FutbolException extends Exception{}
class Falta extends FutbolException{}
class EquipoIncompleto extends FutbolException{}
class ClimaException extends Exception{}
class Lluvia extends ClimaException{}
class Mano extends Falta{}
class Partido {
	Partido() throws FutbolException{}
	void evento() throws FutbolException{}
	void jugada() throws EquipoIncompleto,
	Falta{}
	void penal(){}
}
interface Tormenta {
	void evento() throws Lluvia;
	void diluvio() throws Lluvia;
}
public class Encuentro extends Partido implements Tormenta {
	Encuentro() throws Lluvia,
	FutbolException{} //{..}
	Encuentro (String fecha) throws Falta,
	FutbolException{}//{..}
	void penal() throws Mano{}//{..}
	public void evento() throws Lluvia{}//{..}
	public void diluvio() throws Lluvia{}//{..}
	public void evento(){}//{..}
	void jugada() throws Mano{}//{..}
	public static void main (String[] args) {
		try {
			Encuentro enc = new Encuentro();
			enc.jugada();
		} catch(Mano e) {
		} catch(Lluvia e) {
		} catch(FutbolException e) {
			try {
				Partido par = new Encuentro();
				par.jugada();
			} catch(EquipoIncompleto e) {
			} catch(Falta e) {
			} catch(Lluvia e) {
			} catch(FutbolException e) {}
		}
	}
}

// Un error es que el metodo void penal() de la clase Encuentro, quiere lanzar la excepcion Mano, cuando en la superclase
// tiene definido un metodo penal y no lanza ninguna excepcion, y por definicion, en un metodo sobreescrito, no se puede agregar
// excepciones, puede usar las mismas o menos, pero no mas, la solucion seria agregar en la superclase la excepcion que lanza
// Otro error en la clase Encuentro, es el metodo evento que quiere lanzar la excepcion Lluvia, pero en su superclase utiliza el mismo metodo
// la excepcion FutbolExcepcion, pero la interfaz que implementa Encuentro el metodo si utiliza Lluvia, aca se da un problema de compatibilidad
// lo ideal seria que no implemente ninguna excepcion o alguna que los dos hereden, por ejemplo Exception
// Otro problema es la duplicacion del metodo, que comparten la misma firma de nombre y parametros, aunque se diferencien en excepcion lanzada
// una solucion de esto seria renombrar el metodo