package mainpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Operatore {
    public static void Aggprod(ArrayList<Prodotti> listaProdotti, Scanner scanner) {
        System.out.println("Inserisci il nome del nuovo prodotto:");
        String nome = scanner.next();
        System.out.println("Inserisci il prezzo del prodotto:");
        double prezzo = scanner.nextDouble();
        System.out.println("Inserisci la quantità disponibile:");
        int quantita = scanner.nextInt();

        listaProdotti.add(new Prodotti(nome, prezzo, quantita, true, 0));
        System.out.println("Prodotto aggiunto con successo!");
    }

    public static void Rimuovi(ArrayList<Prodotti> listaProdotti, Scanner scanner) {
        System.out.println("Inserisci il nome del prodotto da rimuovere:");
        String nome = scanner.next();
        listaProdotti.removeIf(prodotto -> prodotto.getNome().equalsIgnoreCase(nome));
        System.out.println("Prodotto rimosso, se esisteva nella lista.");
    }

    public static void CambQuant(ArrayList<Prodotti> listaProdotti, Scanner scanner) {
        System.out.println("Inserisci il nome del prodotto per cambiare la quantità:");
        String nome = scanner.next();
        for (Prodotti prodotto : listaProdotti) {
            if (prodotto.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Quantità attuale: " + prodotto.getQuantita());
                System.out.println("Inserisci la nuova quantità:");
                int nuovaQuantita = scanner.nextInt();
                prodotto.setQuantitaAcquistata(nuovaQuantita);
                System.out.println("Quantità aggiornata!");
                return;
            }
        }
        System.out.println("Prodotto non trovato.");
    }

    public static void CambPrezzo(ArrayList<Prodotti> listaProdotti, Scanner scanner) {
        System.out.println("Inserisci il nome del prodotto per cambiare il prezzo:");
        String nome = scanner.next();
        for (Prodotti prodotto : listaProdotti) {
            if (prodotto.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Prezzo attuale: " + prodotto.getPrezzo());
                System.out.println("Inserisci il nuovo prezzo:");
                double nuovoPrezzo = scanner.nextDouble();
                prodotto.setPrezzo(nuovoPrezzo);
                System.out.println("Prezzo aggiornato!");
                return;
            }
        }
        System.out.println("Prodotto non trovato.");
    }

    public static void VisualizzaIncasso(ArrayList<Prodotti> listaProdotti) {
        double totaleIncasso = 0;
        for (Prodotti prodotto : listaProdotti) {
            totaleIncasso += prodotto.getPrezzo() * prodotto.getQuantitaAcquistata();
        }
        System.out.println("Totale incassato: " + totaleIncasso + " €");
    }

    public static void VisualizzaVenduti(ArrayList<Prodotti> listaProdotti) {
        System.out.println("Elenco dei prodotti venduti:");
        for (Prodotti prodotto : listaProdotti) {
            int quantitaVenduta = prodotto.getQuantitaAcquistata();
            if (quantitaVenduta > 0) {
                System.out.println(prodotto.getNome() + ": " + quantitaVenduta + " unità vendute");
            }
        }
    }
	
}
