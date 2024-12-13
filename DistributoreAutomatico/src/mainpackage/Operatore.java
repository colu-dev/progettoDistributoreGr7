package mainpackage;
import java.util.Scanner;
import java.util.ArrayList;
import mainpackage.Distributore;
public class Operatore extends Distributore{
	//static ArrayList<Prodotti> bevande = new ArrayList<>();
	
	public void Aggprod() {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Inserisci codice operatore");
	      int codoperatore=scanner.nextInt();
			if(codoperatore==0001) {
				System.out.println("Welcome sir");
				System.out.print("Vuoi aggiungere un prodotto? Premi 1: ");
				int inputMagazziniere = scanner.nextInt();
				if (inputMagazziniere == 1) { 
					System.out.print("In quale posizione vuoi aggiungere un prodotto?");
					int posizione = scanner.nextInt();
					if (posizione >= 0 &&  posizione <= bevande.size()) {
						System.out.print("Quanti prodotti vuoi aggiungere? ");
							int quantitaDaAggiungere = scanner.nextInt();
						
						bevande.get(posizione).setQuantita(quantitaDaAggiungere);
						
					}
				}
			}
	}
	public static void Rimuovi() {
		Scanner scanner= new Scanner(System.in);
			System.out.println("Inserisci codice operatore");
			int codoperatore=scanner.nextInt();
			if(codoperatore==0002) {
				System.out.println("Welcome sir");
				System.out.print("Vuoi rimuovere un prodotto? Premi 1: ");
				int inputMagazziniere = scanner.nextInt();
				if (inputMagazziniere == 1) { 
					System.out.print("In quale posizione vuoi rimuovere un prodotto?");
					int posizione = scanner.nextInt();
					if (posizione >= 0 &&  posizione < bevande.size()) {
						System.out.print("Quanti prodotti vuoi rimuovere? ");
							int quantitaDaRimuovere = scanner.nextInt();
					
							bevande.get(posizione).setQuantita(quantitaDaRimuovere);
					}
				}
			}
		
	}
	public static void CambQuant() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Inserisci codice operatore");
		int codoperatore=scanner.nextInt();
		if(codoperatore==0003) {
			System.out.println("Welcome sir");
			System.out.print("Vuoi cambiare la quantità di un prodotto? Premi 1: ");
			int inputMagazziniere = scanner.nextInt();
			if (inputMagazziniere == 1) { 
				System.out.print("In quale posizione vuoi cambiare la quantità un prodotto?");
				int posizione = scanner.nextInt();
				if (posizione >= 0 &&  posizione < bevande.size()) {
					System.out.print("che quantita vuoi mettere? ");
						int nuovaQuantita = scanner.nextInt();
				
						bevande.get(posizione).setNuovaQuantita(nuovaQuantita);
		
	}
				}
			}
		}
	public static void CambPrezzo() {
		
	}
	public static void VisualizzaInc() {
		
	}
	public  static void VisualizzaVenduti() {
		
	}
}
