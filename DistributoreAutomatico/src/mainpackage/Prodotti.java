package mainpackage;

public class Prodotti {
private double prezzo;
private String nome;
private int quantita;
boolean disponibile;
private int quantitaacq;
//Ciao dal branchwiliam
public Prodotti(String nome,double prezzo,int quantita) {
	this.nome=nome;
	this.prezzo=prezzo;
	this.quantita=quantita;
}
	public String Prendinome() {
	return nome;
	}
		public double Prendiprezzo() {
			return prezzo;
		}
		public int Prendiquantita() {
			return quantita;
		}
		public boolean Isdisponibile() {
			return disponibile;
		}
		public static void main(String[] args) {}
}
