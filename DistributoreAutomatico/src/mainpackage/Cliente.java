package mainpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    public static void compraProdotto(ArrayList<Prodotti> listaProdotti, Scanner scanner) {
    	System.out.println("scegli un prodotto");
 	for (int i=0 ; i<listaProdotti.size(); i++) { //  stampare i prodotti disponibili 
    	Prodotti prodotto = listaProdotti.get(i);
    	if(prodotto.IsDisponibile()) { // Controlla se il prodotto è disponibile (quantità > 0)
    		System.out.println(prodotto.getNome() + ", " + prodotto.getPrezzo() + "€, " + prodotto.getQuantita() + " disponibili");
    	}
    }
     int sceltaProdotto=scanner.nextInt();
     if(sceltaProdotto <1 || sceltaProdotto> listaProdotti.size()) { // Controlla dell'indice 
    	 System.out.println("scelta non valida");
    	 return;
     }
     Prodotti prodottoScelto=listaProdotti.get(sceltaProdotto);
     if(!(prodottoScelto.IsDisponibile())) { // Controlla se il prodotto scelto è disponibile
    	 System.out.println("scelta non disponibile");
    	 return;
     }
    System.out.println("Hai scelto" + prodottoScelto.getNome() + "prezzo" +prodottoScelto.getPrezzo());// Mostra i dettagli del prodotto scelto
 System.out.println("Inserisci denaro");
 double soldiInseriti = scanner.nextDouble(); // Controlla se l'importo inserito è sufficiente
	if(soldiInseriti >= prodottoScelto.getPrezzo()) {   // Calcolare il resto da dare 
    	double resto = soldiInseriti - prodottoScelto.getPrezzo();
    	 prodottoScelto.setQuantita(prodottoScelto.getQuantita() - 1); // Riduce la quantità disponibile del prodotto scelto di 1
         System.out.println("Erogazione in corso");
         System.out.println("Resto: " + resto + "€");
     } else {
         System.out.println("Importo insufficiente.torna domani");
     }
 }
}