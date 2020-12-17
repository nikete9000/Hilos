package Ejemplo1;

public class main {

	public static void main(String[] args) {
		Tarea tarea = new Tarea();
		tarea.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Hilo principal");
		}
	}
}
