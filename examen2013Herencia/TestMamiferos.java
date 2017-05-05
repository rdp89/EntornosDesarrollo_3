package examen2013Herencia;

import utiles.Menu;

public class TestMamiferos {
	private static Menu menuGeneral;

	private static Catalogo catalogo = new Catalogo();
	
	public static void main(String[] args) {
		menuGeneral = new Menu("** Catalogo de mamiferos",
				new String[] { "Añadir mamifero", "Listar mamiferos", "Listar humanos", "Listar focar en orden inverso",
						"Contar murcielagos", "Alientar a todos los mamiferos del catalogo", "Salir" });
		int opcion;
		catalogo.cargaRapida();
		do {
		opcion = menuGeneral.gestionar();
		
		gestionarOpciones(opcion);
		} while (opcion != 7);
	}

	private static void gestionarOpciones(int opcion) {
		switch (opcion) {
		case 1:
			// Añadir mamifero
			catalogo.annadirMamifero();
			break;
		case 2:
			// Listar mamiferos
			catalogo.listarMamiferos();
			break;
		case 3:
			// Listar humanos
			catalogo.listarHumanos();
			break;
		case 4:
			// Listar focas en orden inverso
			catalogo.listarFocasInverso();
			break;
		case 5:
			// Contar murcielagos
			catalogo.contarMurcielagos();
			break;
		case 6:
			// Alimentar a todos los mamiferos del catalogo
			catalogo.alimentarTodos();
			break;
		case 7:
			// Salir
			break;
		}
	}
	

}
