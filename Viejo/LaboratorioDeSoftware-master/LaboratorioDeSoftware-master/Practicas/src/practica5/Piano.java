package practica5;

import org.jfugue.player.Player;

import practica2.InstrumentoMusical;

public class Piano implements InstrumentoMusical {

    private Player player=new Player();
    
	@Override
	public void hacerSonar() {
		player.play("V0 I[Piano] C");;
	}

	@Override
	public void hacerSonar(Notas n, DuracionNota duracion){
         player.play("V0 I[Guitar] " + n.toString()+duracion.toString());
	}

	@Override
	public String queEs() {
		return "Piano";
	}

	@Override
	public void afinar() {
	    System.out.println("Se afino con la frecuencia estándar (440 Hz)");
	}

	@Override
	public void afinar(FrecuenciasDeLA frecuencia) {
	    System.out.println("Se afino con la fecruencia "+frecuencia);
	}

}
