package ejercicio3;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("Test3");
		try {
			System.out.println("Primer try");
			try {
				throw new Exception();
			} finally {
				System.out.println("Finally del 2º try");
			}
		} catch (Exception e) {
			System.out.println("Se capturó la Excepción ex del 1º Primer try");
		} finally {
			System.out.println("Finally del 1º try");
		}
	}
}

// Ejecuta el "Test3" luego el try con el "Primer try" despues el otro try manda una excepcion, como no tiene un manejador ahi
// ejecuta el bloque finally correspondiente a este try, que es el "Finally del 2° try", despues encuentra un catch el bloque de afuera
// y ejecuta este que es "Se capturo la excepcion ex del 1° Primer try" y luego el finally "Finally del 1° try".
// El bloque Finally se ejecuta siempre luego del catch, pero si no encuentra un catch, se ejecuta luego del try nomas

