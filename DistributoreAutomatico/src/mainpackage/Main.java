package mainpackage;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Distributore distributore1 = new Distributore();
		Operatore ciro = new Operatore();
		distributore1.aggiungiProdotto(null,0,0);
		distributore1.aggiungiProdotto(null,0,0);
		//distributore1.rimuoviProdotto(null);
		ciro.CambQuant();
		ciro.CambPrezzo();
		
		
		distributore1.visualizzaProdotti();
	
	}

}
