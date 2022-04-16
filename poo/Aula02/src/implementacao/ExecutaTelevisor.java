package implementacao;

import beans.Televisor;

public class ExecutaTelevisor {

	public static void main(String[] args) {

		System.out.println("Utilizando televisor!");
		
		Televisor televisor = new Televisor();
		
		televisor.mostarStatus();

		// aumentar o volume 5 vezes com o televisor ligado
		televisor.ligar();
		televisor.setCanal(5);
		for (int i=0; i<5; i++) {
			televisor.aumentarVolume();
		}
		televisor.mostarStatus();


		// aumentar o volume 2 vezes e aumentar 3 canais com o televisor desligado
		televisor.ligar();
		for (int i=0; i<3; i++) {
			televisor.aumentarCanal();
		}
		for (int i=0; i<2; i++) {
			televisor.aumentarVolume();
		}
		televisor.mostarStatus();
				
		
		// aumentar o volume 2 vezes e aumentar 3 canais com o televisor desligado
		televisor.desligar();
		for (int i=0; i<3; i++) {
			televisor.aumentarCanal();
		}
		for (int i=0; i<2; i++) {
			televisor.aumentarVolume();
		}
		televisor.mostarStatus();

		
		
		// diminuir o volume 2 vezes e aumentar 12 canais com o televisor ligado
		televisor.ligar();
		for (int i=0; i<3; i++) {
			televisor.aumentarCanal();
		}
		for (int i=0; i<2; i++) {
			televisor.aumentarVolume();
		}
		televisor.mostarStatus();

		
	}

}
