package Ejemplo1;

public class Tarea extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Otro hilo");
		}
	}

}
