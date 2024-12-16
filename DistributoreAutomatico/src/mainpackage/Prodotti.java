package mainpackage;

public class Prodotti {
	private double prezzo;
	private String nome;
	private int quantita;
	boolean disponibile;
	private double quantitaAcquistata;
	
	
	
	
	//Costruttore della classe prodotto	
	public Prodotti(String nome,double prezzo,int quantita) {
		this.nome=nome;
		this.prezzo=prezzo;
		this.quantita=quantita;
	}
		
		//getter per il nome, prezxo, quantita er disponibilita
		public String getNome() {
			return nome;
		}
		public double getPrezzo() {
			return prezzo;
		}
		public double getQuantita() {
			return quantita;
		}
		public boolean getDisponibilita() {
			return disponibile;
		}
		public double getQuantitaAcquistata() {
			return quantitaAcquistata;
		}
		//setter per cambiare il prezzo e la quantita
		public void setPrezzo(double prezzo) {
			this.prezzo = prezzo;
		}
		public void setQuantita(int quantita) {
			this.quantita = quantita;
		}
		@Override 
		public String toString() {
			return "Nome: " +nome+ " Prezzo " +prezzo+ " Quantità " +quantita+ " Disponibilità " +disponibile+ " Quantità acquistata " +quantitaAcquistata;
		}
}
