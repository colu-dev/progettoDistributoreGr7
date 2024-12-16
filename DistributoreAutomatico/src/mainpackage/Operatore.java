package mainpackage;
import java.util.Scanner;
import java.util.ArrayList;
import mainpackage.Distributore;
public class Operatore extends Distributore{
	//private static Distributore distributore = new Distributore();
	/*public void Aggprod() {
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("Inserisci il nome del prodotto: ");
		String nome = scanner.nextLine();
		System.out.print("Inserisci il prezzo del prodotto: ");
		double prezzo =scanner.nextDouble();
		System.out.print("Inserisci la quantità disponibile: ");
		int quantita =scanner.nextInt();
		distributore.aggiungiProdotto(nome, prezzo, quantita);
	}*/
				
	
	public void CambQuant() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Inserisci codice operatore");
		int codoperatore=scanner.nextInt();
		if(codoperatore==0001) {
			System.out.println("Welcome sir");
			System.out.print("Vuoi cambiare la quantità di un prodotto? Premi 1: ");
			int inputMagazziniere = scanner.nextInt();
			if (inputMagazziniere == 1) { 
				System.out.print("In quale posizione vuoi cambiare la quantità un prodotto?");
				int posizione = scanner.nextInt();
				if (posizione >= 0 &&  posizione < bevande.size()) {
					System.out.print("che quantita vuoi mettere? ");
						int nuovaQuantita = scanner.nextInt();
				bevande.get(posizione).setQuantita(nuovaQuantita);
		
				}
			}
		}
	}
	public void CambPrezzo() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Inserisci codice operatore");
		int codoperatore=scanner.nextInt();
		if(codoperatore==0002) {
			System.out.println("Welcome sir");
			System.out.print("Vuoi cambiare il prezzo di un prodotto? Premi 1: ");
			int inputMagazziniere = scanner.nextInt();
			if (inputMagazziniere == 1) { 
				System.out.print("In quale posizione vuoi cambiare il prezzo di un prodotto?");
				int posizione = scanner.nextInt();
				if (posizione >= 0 &&  posizione < bevande.size()) {
					System.out.print("che quantita vuoi mettere? ");
						int nuovoPrezzo = scanner.nextInt();
				bevande.get(posizione).setPrezzo(nuovoPrezzo);
		
				}
			}
		}
	}
	public static void VisualizzaInc() {
		
	}
	public  static void VisualizzaVenduti() {
		
	}
}
