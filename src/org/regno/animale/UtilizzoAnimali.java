package org.regno.animale;

public class UtilizzoAnimali {
	
	public static void main (String[] args) {
		
		
		INuotanteAnimale delfino2 = new Delfino();
		 faiNuotare( delfino2);
		 
		 
		 Passerotto passerotto1 = new Passerotto();
		 faiVolare(passerotto1);
		 
		
	}
	
	
	public static void faiVolare(IVolanteAnimale animale) {
		animale.vola();
	}
	
	public static void faiNuotare(INuotanteAnimale animale) {
		animale.nuota();
	}
	

}


//Per fare l'esercizio corretto in tutte le sue parti andavano fatti due metodi che in un altro main
//(diverso da regno animale) che richiamassero i metodi vola(); e nuota(); che accettassero parametri;