package org.regno.animale;

public class Aquila extends Animale implements IVolanteAnimale{
	
	
    private int numeroZampe = 2;
	
	private String verso = "Screech!";
	
	private String alimentazione = "carne"; 
	
	
	//COSTRUTTORE
	
	public Aquila () {
	
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
		System.out.println("il mio verso è lo strido o grido: " + this.getVerso());
		
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
