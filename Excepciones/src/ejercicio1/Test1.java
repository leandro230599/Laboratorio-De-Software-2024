package ejercicio1;

class Excepcion1 extends Exception{}
class Excepcion2 extends Excepcion1{}
public class Test1 {
	public static void main(String[] args) {
		try {
			throw new Excepcion2();
		} 
		catch( Excepcion2 e2) {
			System.out.println("Se capturó la Excepción2");
		}
		catch(Excepcion1 e1) {
			System.out.println("Se capturó la Excepción1");
		} 
	}
}

// Para que funcione, cambie de lugar el catch de e2 con el e1, dado a que en el orden original de e1 primero y e2 segundo,
// tomaba la e1 siempre y nunca llegaba a e2, cambiando el orden si alcanza