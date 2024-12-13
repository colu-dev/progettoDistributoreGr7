package mainpackage;

public class Main {

	public static void main(String[] args) {
		
		Distributore p = new Distributore(); 
		Prodotti i = new Prodotti("coca cola", 2.0, 25);

		p.aggiungiProdotto("coca cola", 2.0, 25);
		System.out.println("Prodotto aggiunto: " + i.getNome());
		
	}
}
		
 
