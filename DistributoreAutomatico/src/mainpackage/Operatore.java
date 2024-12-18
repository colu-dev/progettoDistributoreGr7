package mainpackage;
import java.util.Scanner;
public class Operatore extends Distributore{
	
	public static void CambQuant() {	//metodo per cambiare la quantità a un prodotto
		Scanner scanner= new Scanner(System.in);
		System.out.println("Inserisci codice operatore");
		int codoperatore=scanner.nextInt();
		
			if(codoperatore==0001) {	//codice per cambiare la quantità
				System.out.println("Benvenut* operatore");
				System.out.print("Vuoi cambiare la quantità di un prodotto? Premi 1: ");
				int inputMagazziniere = scanner.nextInt();
				
				if (inputMagazziniere == 1) { //chiediamo dove si trova il prodotto che vuole cambiare
					System.out.print("In quale posizione vuoi cambiare la quantità un prodotto?");
					int posizione = scanner.nextInt();
				
					if (posizione >= 0 &&  posizione < bevande.size()) { //
						System.out.print("che quantita vuoi mettere? ");
						int nuovaQuantita = scanner.nextInt();
						bevande.get(posizione).setQuantita(nuovaQuantita);
					}else System.out.println("la posizione è sbagliata");
				}
			}
	}
	
	public void CambPrezzo() { //metodo per cambiare il prezzo a un prodotto
		Scanner scanner= new Scanner(System.in);
		System.out.println("Inserisci codice operatore");
		int codoperatore=scanner.nextInt();
		
			if(codoperatore==0002) {
				System.out.println("Benvenut* operatore");
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
	
}
