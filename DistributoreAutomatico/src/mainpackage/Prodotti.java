package mainpackage;

public class Prodotti {
	public double prezzo;
	public String nome;
	public int quantita;
	boolean disponibile;
	public int quantitaacq;
	Prodotti prodotto1 = new Prodotti(nome, prezzo, quantita); //creato oggetto per l'array della classe 
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
}
