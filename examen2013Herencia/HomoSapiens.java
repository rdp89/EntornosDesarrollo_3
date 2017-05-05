package examen2013Herencia;

public class HomoSapiens extends Mamiferos {

	private final int piernas = 2;
	private final int brazos = 2;
	
	public HomoSapiens(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "HomoSapiens [piernas=" + piernas + ", brazos=" + brazos + "]" + super.toString();
	}

	@Override
	String comer() {
		if(super.getEtapa() == Etapa.CRIA)
			return super.mamar();
		else
			return "Estoy comiendo";
		
	}

	@Override
	String desplazarse() {
		if(super.getEtapa() == Etapa.CRIA)
			return "Estoy gateando";
		else
			return "Estoy corriendo";
	}
	
}
