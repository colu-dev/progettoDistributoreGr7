package mainpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Distributore{
	public static ArrayList<Prodotti> bevande;
	public double totaleIncassato;
	
	public Distributore() {
		this.bevande = new ArrayList<>();
		this.totaleIncassato = 0;
	}
	
	public void aggiungiProdotto(String nome, double prezzo, int quantita) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Inserisci il nome del prodotto: ");
		String nomeAgg = scanner.nextLine();
		System.out.print("Inserisci il prezzo del prodotto: ");
		double prezzoAgg =scanner.nextDouble();
		System.out.print("Inserisci la quantità disponibile: ");
		int quantitaAgg =scanner.nextInt();
		nome=nomeAgg;
		prezzo=prezzoAgg;
		quantita=quantitaAgg;
		bevande.add(new Prodotti(nome,prezzo,quantita));
		System.out.println("Prodotto aggiunto con successo.");
	}
	public void rimuoviProdotto(String nome) {
			Scanner scanner= new Scanner(System.in);
			System.out.println("inserire il nome del prodotto da rimuovere: ");
			String nomeProd=scanner.nextLine();
			for(int i = 0; i < bevande.size(); i++) {
				if(bevande.get(i).getNome().equals(nomeProd)) {
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
		//System.out.println("Elenco dei prodotti:");
		//System.out.println(bevande.toString());
		for(Prodotti prodotto : bevande) {
				System.out.println(" nome: " +prodotto.getNome()+" prezzo: " + prodotto.getPrezzo()+ " quantita: "+ prodotto.getQuantita());
			}
	}
		
}
