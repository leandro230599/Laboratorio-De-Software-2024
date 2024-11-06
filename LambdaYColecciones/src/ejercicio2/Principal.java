package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		Veterinaria<Animal> vet = new Veterinaria<Gato>(); // Punto 1
		Veterinaria<Gato> vet = new Veterinaria<Animal>(); // Punto 2
		Veterinaria<?> vet = new Veterinaria<Gato>(); // Punto 3
		vet.setAnimal(new Gato()); // Punto 4
		Veterinaria vet = new Veterinaria (); // Punto 5
		vet.setAnimal(new Perro()); // Punto 6
		Veterinaria vet = new Veterinaria <?>(); // Punto 7
		Veterinaria <? extends Animal> vet = new Veterinaria<Gato>(); // Punto 8
	}
	
}

// Punto 1: Error en compilacion, por no ser covariantes, por mas que Gato sea subclase de Animal, en generico no permite algo asi, debe ser ambos Gato o la instancia
// no debe contener nada. Otra forma es usar el comodin de Veterinaria<? extends Animal> vet = new Veterinaria<Gato> que permite utilizar cualquier subclase de Animal

// Punto 2: Error en compilacion, porque Gato no puede contener algo de tipo animal ya que podria ser Perro y daria error

// Punto 3: Es valido ya que en tiempo de compilacion no puede determinar que clase generica utilizara, el comodin "?" permite utilizar cualquier clase.
// Lo malo de esto es que no se puede utilizar metodos de Veterinaria que dependan de la clase generica especifica como el setAnimal

// Punto 4: Dado a que el punto 4 va ligado al punto 3, no se puede utilizar porque se utilizo el comodin en el punto 3, y setAnimal es un metodo especifico

// Punto 5: Es valido pero al no declarar que tipo generico utiliza, se pierde informacion que no se obtiene en la compilacion, por ejemplo para hacer algo como getAnimal
// debo castear, cosa que si especificara el tipo de generico, no haria falta ciertos casting

// Punto 6: Es valido para lo anterior del punto 5, pero generaria problema al hacer algo como getAnimal

// Punto 7: No se puede instanciar un tipo "?" dado a que no se sabe que es, y despues del new se debe aclarar el tipo que ira

// Punto 8: Si es valido y le esta diciendo que puede recibir cualquier clase que extienda de Animal, como la instanciada que es Gato