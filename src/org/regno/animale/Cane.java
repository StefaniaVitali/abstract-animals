package org.regno.animale;

public class Cane extends Animale {
	
	
	private int numeroZampe = 4;
	
	private String verso = "Bau Bau";
	
	private String alimentazione = "carne"; 
	
	
	//COSTRUTTORE
	
	public Cane (String verso, String cibo) {
		
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
		System.out.println("Abbaio e faccio: " + this.getVerso());
		
	}

	@Override
	public void mangia() {
		System.out.println("Mangio " + this.getAlimentazione());
	}

}
