package beans;

public class Televisor {

	private int canal;
	private int volume;
	private boolean ligado;
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if (canal < 16 & canal > 0 ) {
			this.canal = canal;			
		}
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public void mostarStatus() {
		System.out.println("-------------------------");
		System.out.println("Canal..: " + getCanal());
		System.out.println("Volume.: " + getVolume());
		System.out.println("Ligado.: " + isLigado());
		System.out.println("\n");
	}
	
	public void aumentarVolume() {
		if (this.volume < 10 & this.isLigado()) {
			this.volume ++;	
			System.out.println("Vol++");
		} else if (!this.isLigado()) {
			System.out.println("Televisor desligado! Ligue o televisor!");
		}
	}
	public void diminuirVolume() {
		if (this.volume > 0 & this.isLigado()) {
			this.volume --;			
			System.out.println("Vol--");
		} else if (!this.isLigado()) {
			System.out.println("Televisor desligado! Ligue o televisor!");
		}
	}
	
	public void aumentarCanal() {
		this.setCanal(this.canal = this.canal +1);
		System.out.println("Canal++");
	}
	
	public void diminuirCanal() {
		this.setCanal(this.canal = this.canal -1);
		System.out.println("Canal--");
	}
	
	public void ligar() {
		this.setLigado(true);
	}
	public void desligar() {
		this.setLigado(false);
	}
	
}
