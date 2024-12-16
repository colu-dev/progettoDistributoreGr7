package mainpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    public static void compraProdotto(ArrayList<Prodotti> listaProdotti, Scanner scanner) {
    	System.out.println("scegli un prodotto");
 	for (int i=0 ; i<listaProdotti.size(); i++) {
    	Prodotti prodotto = listaProdotti.get(i);
    	if(prodotto.IsDisponibile()) {
    		System.out.println(prodotto.getNome() + ", " + prodotto.getPrezzo() + "€, " + prodotto.getQuantita() + " disponibili");
    	}
    }
     int sceltaProdotto=scanner.nextInt();
     if(sceltaProdotto <1 || sceltaProdotto> listaProdotti.size()) {
    	 System.out.println("scelta non valida");
    	 return;
     }
     Prodotti prodottoScelto=listaProdotti.get(sceltaProdotto);
     if(!(prodottoScelto.IsDisponibile())) {
    	 System.out.println("scelta non disponibile");
    	 return;
     }
    System.out.println("Hai scelto" + prodottoScelto.getNome() + "prezzo" +prodottoScelto.getPrezzo());
 System.out.println("Inserisci denaro");
 double soldiInseriti = scanner.nextDouble();
	if(soldiInseriti >= prodottoScelto.getPrezzo()) {
    	double resto = soldiInseriti - prodottoScelto.getPrezzo();
    	 prodottoScelto.setQuantita(prodottoScelto.getQuantita() - 1); 
         System.out.println("Erogazione in corso");
         System.out.println("Resto: " + resto + "€");
     } else {
         System.out.println("Importo insufficiente.torna domani");
     }
 }
}