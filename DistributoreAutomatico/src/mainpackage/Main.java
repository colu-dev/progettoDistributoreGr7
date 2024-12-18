package mainpackage;
import java.util.Scanner;

public class Main {
	
	
	

	public static void main(String[] args) {
		//creazione oggetti
		Scanner scanner= new Scanner(System.in);
		Cliente io = new Cliente();			
		Operatore myoperatore = new Operatore();
		Distributore distributore1 = new Distributore();
		Prodotti myprodotto = new Prodotti(null,0,0);
		while(true) {	//ciclo infinito
		 System.out.print("Inserisci codice: \n1) Clienti. \n2) Operatore. \n3) Esci. ");	//menu iniziale
	       int codice = scanner.nextInt();

	        if (codice == 1) {
	            System.out.println("Benvenuto cliente");
	            distributore1.visualizzaProdotti();
	            io.CompraBev(null, 0, 0);
	        }
	            
	        else if(codice ==2){
	        	while(true) { //ciclo infinito
	        
            System.out.println("\nMenu:");		//menu operatore
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
            	distributore1.aggiungiProdotto(null, 0, 0);		//richiamo metodo per aggiungere un prodotto
            break;
            case 2:
            	distributore1.rimuoviProdotto(null);			//richiamo metodo per rimuovere un prodotto
            break;
            case 3:
            	myoperatore.CambQuant();						//richiamo metodo per cambiare la quantita
            break;
            case 4:
            	myoperatore.CambPrezzo();						//richiamo metodo per cambiare il prezzo
            break;
            case 5:
            	myprodotto.stampaQuantitaAcq();					//richiamo metodo per stampare la quantità acquistata
             break;
            case 6:
            	distributore1.StampaQuantitaIncasso();			//richiamo metodo per stampare incasso
            break;
            case 7:
            	distributore1.visualizzaProdotti();				//richiamo metodo per visualizzare i prodotti
            break;
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


