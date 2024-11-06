package ejercicio5;

public class Suma {
	public static void main(String[] args){
		int suma=0;
		int i=0;
		while (i<args.length)
			try {
				for(int j=0;j<=args.length;j++) {
					i = j;
					suma+= Integer.parseInt(args[i]);
				}
			} catch (NumberFormatException e) {
				System.out.println("El dato ingresado: "+args[i]+" no es compatible");
				i++;
		}
		System.out.print("La suma es:"+suma);
	}
}

