package mainpackage;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	
	

	public static void main(String[] args) {
		int codice;
	
		Scanner scanner= new Scanner(System.in);
		Cliente io = new Cliente();
		Operatore ciro = new Operatore();
		Distributore distributore1 = new Distributore();
		Prodotti myprodotto = new Prodotti(null,0,0);
		while(true) {
		 System.out.print("Inserisci codice: \n1) Clienti. \n2) Operatore. \n3) Esci. ");
	        codice = scanner.nextInt();

	        if (codice == 1) {
	            System.out.println("Benvenuto cliente");
	            distributore1.visualizzaProdotti();
	            io.CompraBev(null, 0, 0);
	        }
	            
	        else if(codice ==2){
	        	int i=1;
	        	while(i>0) {
	        
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungi prodotto");
            System.out.println("2. rimuovi prodotto");
            System.out.println("3. cambia quantita");
            System.out.println("4. cambia prezzo");
            System.out.println("5. stampa quantita venduta");
            System.out.println("6. stampa totale incassato");
            System.out.println("7. stampa lista prodotti");
            System.out.println("8. Esci");
            System.out.print("Scegli un'opzione: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();  // Consuma la nuova linea
            switch(scelta) {
            case 1: 
            	distributore1.aggiungiProdotto(null, 0, 0);
            break;
            case 2:
            	distributore1.rimuoviProdotto(null);
            break;
            case 3:
            	ciro.CambQuant();
            break;
            case 4:
            	ciro.CambPrezzo();
            break;
            case 5:
            	myprodotto.getQuantitaAcq();
            break;
            case 6:
            	io.stampaTotaleIncassato();
            break;
            case 7:
            	distributore1.visualizzaProdotti();
            case 8:
            	System.exit(0);
            	
            
            }
            
            	
            }
	        } else if(codice==3) {
			System.out.println("Arrivederci");
			System.exit(0);
		}else {
			System.out.println("Codice errato.");
		}
	}
}
	}


