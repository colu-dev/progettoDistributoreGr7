package mainpackage;

import java.util.ArrayList;

public class Distributore{
	public static ArrayList<Prodotti> bevande;
	public double totaleIncassato;
	public Distributore() {
			bevande = new ArrayList<>();
			totaleIncassato = 0.0;
		}
	public void aggiungiProdotto(String nome, double prezzo, int quantita) {
		Prodotti p = new Prodotti(nome,prezzo,quantita);
			bevande.add(p);
			Prodotti l = new Prodotti(nome,prezzo,quantita);
			bevande.add(l);
			Prodotti o = new Prodotti(nome,prezzo,quantita);
			bevande.add(o);
	}
	public void rimuoviProdotto(String nome) {
		for(int i = 0; i < bevande.size(); i++) {
				if(bevande.get(i).getNome().equals(nome)) {
					bevande.remove(i);
					System.out.println("prodotto rimosso");
					return;
	}
				}
		}
	public void cambiaPrezzoProdotto(String nome, double nuovoPrezzo) {
		
	}
	public void vendiProdotto(String nome) {
		
	}
	public void stampaTotaleIncassato() {
		
	}
	public void visualizzaProdotti() {
		
	}
	public static void main(String[] args) {  
		
	}
}
