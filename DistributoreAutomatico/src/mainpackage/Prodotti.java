package mainpackage;

public class Prodotti {
private double prezzo;
private String nome;
private int quantita;
boolean disponibile;
private int quantitaAcquistata;

public Prodotti(String nome,double prezzo,int quantita, boolean b, int i ) {
	this.nome=nome;
	this.prezzo=prezzo;
	this.quantita=quantita;
	this.disponibile=quantita>0;
	this.quantitaAcquistata= 0;
	


}
	public String getNome() {
	return nome;
	}
	public double getPrezzo() {
			return prezzo;
			}
	public void setPrezzo( double nuovoPrezzo) {
		this.prezzo = nuovoPrezzo;
	}
	
	public int getQuantita() {
		return quantita;
		}
	public void setQuantita(int nuovaQuantita) {
		this.quantita=nuovaQuantita;
		this.disponibile=nuovaQuantita>0;
	}
	public boolean IsDisponibile() {
			return disponibile;
		}
	 public int getQuantitaAcquistata() {
		 return quantitaAcquistata;
		 }
	 public void setQuantitaAcquistata(int nuovaQuantita) {
	        this.quantita = nuovaQuantita;
	        this.disponibile = nuovaQuantita > 0; 

	    }
	 public void registraAcquisto(int quantitaDaAcquistare) {
		  if(  this.quantitaAcquistata >= quantitaDaAcquistare) {
			  this.quantita -= quantitaDaAcquistare;
			  this.quantita += quantitaDaAcquistare;
			  this.disponibile=this.quantita>0;
		  }else {
	           System.out.println("Quantità richiesta non disponibile.");

		  }
		  
		}
	 public String toString() {
	        return "Prodotto: " + nome + " | Prezzo: " + prezzo + "€ | Quantità: " + quantita +
	                " | Disponibile: " + (disponibile ? "Sì" : "No") + " | Venduti: " + quantitaAcquistata;
		
}
	
}

