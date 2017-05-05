package examen2013Herencia;

public abstract class Mamiferos {
	/**
	 * Nombre del mamifero
	 */
	private String nombre;
	/**
	 * Etapa del mamifero
	 */
	private Etapa etapa = Etapa.CRIA;
	/**
	 * Numero de veces que ha amamantado un mamifero
	 */
	private int amamantando;
	
	/**
	 * Constructor
	 * @param nombre
	 */
	public Mamiferos(String nombre) {
		setNombre(nombre);
	}
	
	/**
	 * Obtiene el nombre
	 * @return
	 */
	private String getNombre() {
		return nombre;
	}
	
	/**
	 * Guarda el nombre
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Obtiene la etapa
	 * @return
	 */
	protected Etapa getEtapa() {
		return etapa;
	}
	
	/**
	 * Modifica la etapa
	 * @param etapa
	 */
	private void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}
	
	/**
	 * Obtiene el numero de mamadas
	 * @return 
	 */
	protected int getAmamantanto() {
		return amamantando;
	}

	/**
	 * Modifica amamantando
	 * @param amamantanto
	 */
	protected void setAmamantanto() {
		amamantando++;
		if(getAmamantanto() == 3)
			madurar();
	}
	
	String mamar() {
		setAmamantanto();
		return "Estoy mamando";
	}

	/**
	 * Madura, cambia de una etapa a otra
	 */
	private void madurar() {
		setEtapa(Etapa.ADULTO);
	}
	
	/**
	 * Comer de cada especie
	 * @return
	 */
	abstract String comer() ;
	
	/**
	 * Desplazarse de cada especie
	 * @return
	 */
	abstract String desplazarse() ;

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mamiferos [nombre=" + getNombre() + ", etapa=" + getEtapa() + ", amamantanto=" + getAmamantanto() + ", comer()="
				+ comer() + ", desplazarse()=" + desplazarse() + "]";
	}

	
	
	
	
	
	
}
