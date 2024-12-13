package mainpackage;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Distributore w = new Distributore();
		Distributore h = new Distributore();
		Distributore v = new Distributore();
		Prodotti p = new Prodotti("coca cola", 2.0, 25);
		Prodotti l = new Prodotti("fanta", 2.0, 25);
		Prodotti o = new Prodotti("sprite", 2.0, 25);
		Operatore ciao1 = new Operatore();
		Operatore ciao2 = new Operatore();
		Operatore ciao3 = new Operatore();
		w.aggiungiProdotto("coca cola", 2.0, 25);
		h.aggiungiProdotto("fanta", 2.0, 25);
		v.aggiungiProdotto("sprite", 2.0, 25);
		
		ciao1.Aggprod();
		System.out.println("Prodotto aggiunto: " + p.getQuantita());
		ciao2.Aggprod();
		System.out.println("Prodotto aggiunto: " + l.getQuantita());
		ciao3.Aggprod();
		System.out.println("Prodotto aggiunto: " + o.getQuantita());

	}

}
