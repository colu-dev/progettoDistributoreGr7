package mainpackage;

public class Prodotti{
	public double prezzo;
	public String nome;
	public int quantita;
	boolean disponibile;
	public int quantitaAcq;
	
	public Prodotti(String nome,double prezzo,int quantita,boolean disponibile,int quantitaAcq) {
	this.nome=nome;
	this.prezzo=prezzo;
	this.quantita=quantita;
	this.disponibile=quantita>0;
	this.quantitaAcq=0;
	}
		public String getNome() {
			return nome;
		}
			public double getPrezzo() {
				return prezzo;
			}
			public void setPrezzo(double nuovoPrezzo) {
				prezzo=nuovoPrezzo;
				}
			public int getQuantita() {
				return quantita;
			}
			public boolean Isdisponibile() {
				return disponibile;
			}
			public int getQuantitaAcq() {
			return quantitaAcq;
			}
			public void setQuantitaAcq() {
				 this.quantitaAcq++;
				
			}
			public void setQuantita(int nuovaQuantita) {
				quantita=nuovaQuantita;
				this.disponibile=nuovaQuantita>0;
			}
			public void quantitaDopoVendita() {
				if(quantita>0) {
					quantita--;
					
				}
			
			}

}