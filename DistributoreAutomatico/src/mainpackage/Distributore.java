package mainpackage;

import java.util.ArrayList;

import java.util.List;

//classe per rappresentare il distributore automatico
   	public class Distributore {
	
   		private ArrayList<Prodotti> products;
   		private double incassoTotale;
   		
   		
   		public Distributore() {
   			products = new ArrayList<>();
   			incassoTotale = 0.0;
   		}
   		
   		public void aggiungiProdotto(String nome,double prezzo,double quantita) {
   			Prodotti p = new Prodotti(nome,prezzo,quantita);
   			products.add(p);
   			
   		}
   		
   		public void rimuoviProdotto(String nomeProdotto) {
   			for(int i = 0; i < products.size(); i++) {
   				if(products.get(i).getNome().equals(nomeProdotto)) {
   					products.remove(i);
   					System.out.println("prodotto rimosso");
   					return;
   				}
   			}
   		}
   		
  	}
   	

