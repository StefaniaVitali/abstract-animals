package org.regno.animale;

public class Delfino extends Animale{
	
    private int numeroPinne;
	
	private String verso = "Fiuu Fiuu";
	
	private String alimentazione = "pesce"; 
	
	
	//COSTRUTTORE
	
	public Delfino () {
		
	numeroPinne = 4;
		
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
		System.out.println("Fischio e faccio: " + this.getVerso());
		
	}

	@Override
	public void mangia() {
		System.out.println("Mangio " + this.getAlimentazione());
	}
	
	//METODI PROPRIO DI DELFINO
	public void salvoVite() {
		System.out.println("Sono amico degli esseri umani e salvo vite quando gli esseri umani sono in pericolo!");
	}
	


}
