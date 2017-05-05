package examen2013Herencia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import utiles.Menu;
import utiles.Teclado;

public class Catalogo {
	/**
	 * Envoltorio del ArrayList de mamiferos
	 */
	private ArrayList<Mamiferos> catalogo;
	
	private static final Menu menuMamiferos = new Menu("** Elige un mamifero de la lista", new String[] {
	 "Homo sapiens", "Murcielagos", "Focas", "Salir"
	});
	
	/**
	 * Constructor del catalogo
	 */
	public Catalogo() {
		this.catalogo = new ArrayList<Mamiferos>();
	}
	
	/**
	 * Añade un mamifero al catalogo
	 */
	void annadirMamifero() {
		int opcion;
		do {
			opcion = menuMamiferos.gestionar();
			gestionarOpciones(opcion);
		} while (opcion != 4);
	}
	
	/**
	 * Lista los mamiferos
	 */
	void listarMamiferos() {
		for (Mamiferos mamiferos : catalogo) {
			System.out.println(mamiferos);
		}
	}

	/**
	 * Lista solamente los humanos del catalogo
	 */
	void listarHumanos() {
		for (int i = 0; i < catalogo.size(); i++) {
			if (catalogo.get(i) instanceof HomoSapiens)
				System.out.println(catalogo.get(i));
		}
	}
	
	/**
	 * Listar focas en orden inverso
	 */
	void listarFocasInverso() {
		// Recorremos con listIterator y situamos el iterador al final
		ListIterator<Mamiferos> listIterator = catalogo.listIterator(catalogo.size());
		Mamiferos elemento;
		// Mientras tenga elemento previo
		while (listIterator.hasPrevious()) {
			elemento = listIterator.previous();
			// Si es instancia de foca que lo muestre
			if (elemento instanceof Foca)
				System.out.println(elemento);
		}
	}
	
	/**
	 * Cuenta los murcielagos del catalogo
	 */
	void contarMurcielagos() {
		int contador = 0;
		for (Mamiferos mamiferos : catalogo) {
			if (mamiferos instanceof Murcielago) {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " Murcielagos en el catalogo.");
	}
	
	/**
	 * Alimentar a todos los mamiferos
	 */
	void alimentarTodos() {
		for (int i = 0; i < catalogo.size(); i++) {
			catalogo.get(i).comer();
			System.out.println("Dando de comer a " + catalogo.get(i));
		}
	}
	
	/**
	 * Gestiona las opciones del menu para añadir mamiferos
	 * @param opcion
	 */
	private void gestionarOpciones(int opcion) {
		switch (opcion) {
		case 1:
			// Añadir Homo Sapiens
			catalogo.add(new HomoSapiens(Teclado.leerCadena("Nombre:")));
			break;
		case 2:
			// Añadir Murcielago
			catalogo.add(new Murcielago(Teclado.leerCadena("Nombre:")));
			break;
		case 3:
			// Añadir foca
			catalogo.add(new Foca(Teclado.leerCadena("Nombre:")));
			break;
		case 4:
			// Salir
			break;

		}
	}
	
	/**
	 * Carga rapida de 3 animales de cada especie
	 */
	void cargaRapida() {
		catalogo.add(new Murcielago("Murci1"));
		catalogo.add(new Murcielago("Murci2"));
		catalogo.add(new Murcielago("Murci3"));
		catalogo.add(new HomoSapiens("Pepe1"));
		catalogo.add(new HomoSapiens("Pepe2"));
		catalogo.add(new HomoSapiens("Pepe3"));
		catalogo.add(new Foca("Foca1"));
		catalogo.add(new Foca("Foca2"));
		catalogo.add(new Foca("Foca3"));
	}

}
