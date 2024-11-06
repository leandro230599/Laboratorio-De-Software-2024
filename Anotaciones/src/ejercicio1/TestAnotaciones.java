package ejercicio1;

public class TestAnotaciones {
	public static void main(String arg[]) throws Exception {
		new TestAnotaciones().testearYa();
	}
	@SuppressWarnings({"deprecation"})
	public void testearYa() {
		TestDeprecated t2 = new TestDeprecated();
		t2.hacer();
	}
}

// A) Imprime Testeando: 'Deprecated'

// B) No, el compilador mostraria un warning sobre la linea del metodo deprecated

// C) Que anotar el metodo testearYa solo ignora los warning de ese metodo, anotar la clase TestAnotaciones
// haria que se ignore todos los warning deprecation de toda la clase
