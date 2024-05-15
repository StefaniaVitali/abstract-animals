package org.regno.animale;

public class Cane extends Animale {
	
	private String nomeCane;
	
	private int numeroZampe;
	
	private String verso = "Bau Bau";
	
	private String alimentazione = "carne"; 
	
	
	//COSTRUTTORE
	
	public Cane (String nomeCane) {
		
		this.setNomeCane(nomeCane);		
		numeroZampe = 4;
		
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
	
	public String getNomeCane() {
		return nomeCane;
	}


	public void setNomeCane(String nomeCane) {
		this.nomeCane = nomeCane;
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

    
	public void stampaNome() {
		System.out.println("Mi chiamo: " + this.getNomeCane());
	}

}
