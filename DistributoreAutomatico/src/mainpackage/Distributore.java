package mainpackage;

import java.util.ArrayList;

import java.util.List;

//classe per rappresentare il distributore automatico
   	public class Distributore {
	
   		private ArrayList<Prodotti> products;
   		private double incassoTotale;
   		
   		//costruttore della classe distriubutore e inizializzaxzione del suo arraylist
   		public Distributore() {
   			products = new ArrayList<>();
   			incassoTotale = 0.0;
   		}
   		//Aggiungo il metodo per aggiungere un prodooto all'arraylsit
   		public void aggiungiProdotto(String nome,double prezzo,int quantita) {
   			Prodotti p = new Prodotti(nome,prezzo,quantita);
   			products.add(p);
   			
   		}
   		//aggiungo un metodo per rimuovere un prodotto
   		public void rimuoviProdotto(String nomeProdotto) {
   			for(int i = 0; i < products.size(); i++) {
   				if(products.get(i).getNome().equals(nomeProdotto)) {
   					products.remove(i);
   					System.out.println("prodotto rimosso");
   					return;
   				}
   			}
   		}
   		//aggiung ometodo per aggiornare la quantita del prodotto
   		public void setQuantita(String nome, int quantita) {
   			for(Prodotti prodotto : products) {
   				if(prodotto.getNome().equals(nome)) {
   					prodotto.setQuantita(quantita);
   					System.out.println("La quantità del prodotto è stata aggiornata!");
   					return;
   				}
   			}
   		}
   	//aggiung ometodo per aggiornare il prezzo del prodotto
   		public void setPrezzo(String nome, double prezzo) {
   			for(Prodotti prodotto : products) {
   				if(prodotto.getNome().equals(nome)) {
   					prodotto.setPrezzo(prezzo);
   					System.out.println("Il prezzo del prodotto è stato aggiornato!");
   				}
   			}
   		}
   		
   		public void visualizzaProdotto() {
   			for(Prodotti prodotto : products) {
   				System.out.println(prodotto.getNome()+"<--il prezzo è: " + prodotto.getPrezzo());
   			}
   		}
   		   		
   		public void incassoTotale() {
   			System.out.println("Incasso totale del distributore: "+incassoTotale);
   		}
  	}
   	

