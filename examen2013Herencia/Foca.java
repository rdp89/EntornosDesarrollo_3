package examen2013Herencia;

public class Foca extends Mamiferos {

	private final int extremidades = 4;
	
	public Foca(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Foca [extremidades=" + extremidades + "]" + super.toString();
	}

	@Override
	String comer() {
		if(super.getEtapa() == Etapa.CRIA)
			return super.mamar();
		else
			return "Como peces, crustaceos y cefalopodos";
		
	}

	@Override
	String desplazarse() {
		return "Estoy reptando y nadando";

	}
	
	

}
