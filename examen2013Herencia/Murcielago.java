package examen2013Herencia;

public class Murcielago extends Mamiferos {
	
	private final int alas = 2;
	private final int patas = 2;
	
	/**
	 * Constructor de murcielago
	 * @param nombre
	 */
	public Murcielago(String nombre) {
		super(nombre);
	}



	@Override
	public String toString() {
		return "Murcielago [alas=" + alas + ", patas=" + patas + "]" + super.toString();
	}

	@Override
	String comer() {
		if(super.getEtapa() == Etapa.CRIA)
			return super.mamar();
		else
			return "Como insectos";
		
	}

	@Override
	String desplazarse() {
		return "Volando";
	}

	
}
