package org.regno.animale;

public class Passerotto extends Animale implements IVolanteAnimale {
	
private int numeroZampe;
	
	private String verso = "Pio Pio";
	
	private String alimentazione = "semi"; 
	
	
	//COSTRUTTORE
	
	public Passerotto () {
		
		numeroZampe = 2;
		
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

	
    //METODO INFERFACCIA IVolanteAnimale
	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
		
	}

}
