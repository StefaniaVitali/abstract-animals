package org.regno.animale;

public class Delfino extends Animale{
	
private int numeroPinne = 3;
	
	private String verso = "Fiuu Fiuu";
	
	private String alimentazione = "pesce"; 
	
	
	//COSTRUTTORE
	
	public Delfino (String verso, String cibo) {
		
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
	
	public int getNumeroPinne() {
		return numeroPinne;
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
