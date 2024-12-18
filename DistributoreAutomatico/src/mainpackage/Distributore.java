package mainpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Distributore{
	public static ArrayList<Prodotti> bevande;	//creo un arraylist con i prodotti disponibili
	public static Prodotti prodotto1 = new Prodotti("coca-cola",2.00,10);
	public static Prodotti prodotto2 = new Prodotti("fanta",2.00,10);
	public static Prodotti prodotto3 = new Prodotti("gatorade",3.00,10);
	public static Prodotti prodotto4 = new Prodotti("acqua",0.70,10);
	public static Prodotti prodotto5 = new Prodotti("thè",2.00,10);
	public static Prodotti prodotto6 = new Prodotti("birra",2.30,10);
	public static Prodotti prodotto7 = new Prodotti("campari soda",2.50,10);
	public static Prodotti prodotto8 = new Prodotti("molinari",1.50,10);
	public static Prodotti prodotto9 = new Prodotti("grappino",1.50,10);
	public static double quantitaIncasso;
	
		public Distributore() {
			this.bevande = new ArrayList<>();
			bevande.add(prodotto1);		//aggiungo i prodotti all'arraylist
			bevande.add(prodotto2);
			bevande.add(prodotto3);
			bevande.add(prodotto4);
			bevande.add(prodotto5);
			bevande.add(prodotto6);
			bevande.add(prodotto7);
			bevande.add(prodotto8);
			bevande.add(prodotto9);
		}
	
		public void aggiungiProdotto(String nome, double prezzo, int quantita) {	//metodo per aggiungere un prodotto al distributore
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
		public void rimuoviProdotto(String nome) {	//metodo per rimuovere un prodotto dal distributore
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
		
		public void StampaQuantitaIncasso() {		//metodo per stampare la quantità incassata
			System.out.println(quantitaIncasso);
		}
		
		public void visualizzaProdotti() {		//metodo per visualizzare i prodotti
			for(Prodotti prodotto : bevande) {
				System.out.println(" nome: " +prodotto.getNome()+" prezzo: " + prodotto.getPrezzo()+ " quantita: "+ prodotto.getQuantita());
			}
		}
		
}
