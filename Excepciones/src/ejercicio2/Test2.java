package ejercicio2;

public class Test2 {
	public int unMetodo(){
		try {
			System.out.println("Va a retornar 1");
			return 1;
		} finally {
			System.out.println("Va a retornar 2");
			return 2;
		}
	}
	public static void main(String[] args) {
		Test2 res = new Test2();
		System.out.println(res.unMetodo());
	}
}

// Genera error porque nunca alcanza al SOUT 2, siempre finaliza antes porque retorna 1 siempre
// El retorno al borrar los comentarios es imprimir los 2 SOUT y despues imprimir 2 por el retorno, y un warning
// porque no es normal que retorne algo dentro de un finally

