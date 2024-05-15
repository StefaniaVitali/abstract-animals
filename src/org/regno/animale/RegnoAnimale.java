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
		
		System.out.println("Aquila 1");
		
		Animale aquila1 = new Aquila();
		aquila1.verso();
		aquila1.mangia();
		aquila1.dormi();
		
	}

}
