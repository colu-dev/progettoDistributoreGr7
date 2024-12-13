package mainpackage;

public class Prodotti {
	private double prezzo;
	private String nome;
	private double quantita;
	boolean disponibile;
	private double quantitaAcquistata;
	//Ciao dal branchwiliam
	public Prodotti(String nome,double prezzo,double quantita) {
		this.nome=nome;
		this.prezzo=prezzo;
		this.quantita=quantita;
	}
		
		
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
