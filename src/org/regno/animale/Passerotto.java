package org.regno.animale;

public class Passerotto extends Animale {
	
private int numeroZampe = 2;
	
	private String verso = "Pio Pio";
	
	private String alimentazione = "semi"; 
	
	
	//COSTRUTTORE
	
	public Passerotto (String verso, String cibo) {
		
		this.verso = verso;
		this.alimentazione = cibo;
		
	}
	
	
	//GETTER E SETTER
	

	public String getAlimentazione() {
		return alimentazione;
	}

	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}


	public String getVerso() {
		return verso;
	}

	public void setVerso(String verso) {
		this.verso = verso;
	}
	
	public int getNumeroZampe() {
		return numeroZampe;
	}
	
	//METODI VERSO() E MANGIA()
	

	@Override
	public void verso() {
		System.out.println("Pigolo e faccio: " + this.getVerso());
		
	}

	@Override
	public void mangia() {
		System.out.println("Mangio " + this.getAlimentazione());
	}

}
