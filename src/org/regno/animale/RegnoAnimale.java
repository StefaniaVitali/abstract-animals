package org.regno.animale;

public class RegnoAnimale {
	
	public static void main (String[] args) {
		
		System.out.println("Benvenuto nel regno animale! Crea un nuovo animale");
		
		Animale cane1 = new Cane ("Bobby");
		
		cane1.verso();
		cane1.mangia();
		cane1.dormi();
		
		System.out.println("Cane 2 di nome Doggie");
		
		Cane cane2 = new Cane("Doggie");
		cane2.stampaNome();
		cane2.verso();
		cane2.mangia();
		cane2.dormi();
		
		
		System.out.println("Cane 3 di nome Snoopy prima del cambio");
		
		Cane cane3 = new Cane("Snoopy");
		cane3.stampaNome();
		cane3.verso();
		cane3.mangia();
		cane3.dormi();
		
		
		System.out.println("Cane 3 di nome Snoopy dopo il cambio");
		
		cane3 = cane2;
	
		cane3.stampaNome();
		cane3.verso();
		cane3.mangia();
		cane3.dormi();
		
		System.out.println("aquila 1");
		
		Animale aquila1 = new Aquila();
		aquila1.verso();
		aquila1.mangia();
		aquila1.dormi();
		
		System.out.println("delfino 1");
		
		Animale delfino1 = new Delfino();
		delfino1.verso();
		delfino1.mangia();
		delfino1.dormi();
		
	
		
		
		
		
		
	}

}


// CONSIDERAZIONI SUL CODICE:
//non posso riassegnare cane3 se non cambio il tipo di cane3 da Animale a Cane, sono due tipi diversi
//anche se uno Animale è superclasse di Cane

