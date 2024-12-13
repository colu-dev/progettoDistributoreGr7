package mainpackage;

public class Prodotti {
	public double prezzo;
	public String nome;
	public int quantita;
	boolean disponibile;
	public int quantitaacq;
	//Prodotti prodotto1 = new Prodotti(nome, prezzo, quantita);//creato oggetto per l'array della classe 
	
	public Prodotti(String nome,double prezzo,int quantita) {
	this.nome=nome;
	this.prezzo=prezzo;
	this.quantita=quantita;
	}
		public String getNome() {
			return nome;
		}
		public void setNome(String nuovoNome) {
			nome=nuovoNome;
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
			public void setQuantita(int quantitaDaAggiungere) {
				quantita+=quantitaDaAggiungere;
			}
			public boolean Isdisponibile() {
				return disponibile;
			}
			public int getQuantitaAcq() {
				return quantitaacq;
			}
			public void setQuantitaAcq(int quantitaAcq) {
				quantitaacq=quantitaAcq;
				
			}public void setNuovaQuantita(int nuovaQuantita) {
				quantita=nuovaQuantita;
			}

}
/*Partendo dai diagrammi di flusso realizzati in precedenza, programmare il software per la gestione del distributore di bevande.

Nel progetto dovranno essere utilizzati tutti i concetti visti fino a questo momento, inoltre il codice dovrà essere integrato/migliorato con i concetti della OOP che impareremo nei prossimi giorni.

New feature: gestione operatore. L'operatore può, inserendo un codice riservato, accedere ad un menu di selezione con cui poter fare le seguenti operazioni:

aggiungere un nuovo prodotto
rimuovere un prodotto
cambiare la quantità disponibile di un prodotto
cambiare il prezzo di un prodotto
Inoltre, l'operatore potrà vedere:

totale incassato dal distributore
elenco dei prodotti acquistati con relative quantità (es: caffè 10, ginseng 18, coca 4)*/
