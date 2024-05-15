package java.regno.animale;

public class Cane extends Animale {
	
	private int numeroZampe = 4;
	
	private String verso = "Bau Bau";
	
	private String alimentazione = "carne"; 
	
	
	//COSTRUTTORE
	
	
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
		System.out.println("");
		
	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		
	}


}
