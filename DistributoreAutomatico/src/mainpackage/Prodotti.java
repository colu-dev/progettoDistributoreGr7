package mainpackage;

public class Prodotti{
			public double prezzo;	//dichiarazione variabili
			public String nome;
			public int quantita;
			public static int quantitaAcq;
			
			public Prodotti(String nome,double prezzo,int quantita) {   //costruttore
			this.nome=nome;
			this.prezzo=prezzo;
			this.quantita=quantita;
			}
			
				public String getNome() {	//metodo per prendere il nome
				return nome;
				}
				
				public double getPrezzo() {	//metodo per prendere il prezzo
					return prezzo;
				}
				
				public void setPrezzo(double nuovoPrezzo) {	//metodo per cambiare il prezzo
					prezzo=nuovoPrezzo;
				}
				
				public int getQuantita() {	//metodo per prendere la quantità
					return quantita;
				}
				
				public void stampaQuantitaAcq() {	//metodo per stampare la quantità acquistata
					System.out.println(quantitaAcq);
				}
				public void setQuantitaAcq() {	//metodo per aumentare la quantità acquistata
					quantitaAcq+=1;
					
				}
				public void setQuantita(int nuovaQuantita) {	//metodo per modificare la quantità
					quantita=nuovaQuantita;
				}
				
				public void quantitaDopoVendita() {	//metodo per diminuire la quantità una volta acquistato un prodotto
						if(quantita>0) {
							quantita--;
						}
				}
}