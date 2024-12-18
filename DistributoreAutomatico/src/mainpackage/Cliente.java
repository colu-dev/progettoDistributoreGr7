package mainpackage;
import java.util.Scanner;
public class Cliente extends Distributore{
	
		public static double resto;	//dichiarazioni variabili
		public static int eta =(int)(Math.random()*93+8);
		public static double soldiInseriti=(int)(Math.random()*10+3);
		
		public void CompraBev(String nome,double prezzo,int quantita) {	//metodo per comprare le bevande
			System.out.println("hai inserito:"+ soldiInseriti);
			System.out.println("Benvenuto cliente");
			System.out.println("hai: "+ eta +" anni.");
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Inserire codice bevanda");
			int codbevanda=scanner.nextInt();
			
			switch(codbevanda) {	//switch case per scegliere la bevanda
			case 1:
				System.out.println("Hai scelto "+prodotto1.getNome()+",prezzo: "+ prodotto1.getPrezzo());
				if(soldiInseriti>=prodotto1.getPrezzo()&& prodotto1.getQuantita()>0) {
					
					System.out.println("Erogazione in corso");
					prodotto1.quantitaDopoVendita();			//richiamo il metodo per aggiornare la quantita
					quantitaIncasso+=prodotto1.getPrezzo();		//aumento la quantita incassata
					prodotto1.setQuantitaAcq();					//aumento la quantita dei prodotti acquistata
					resto=soldiInseriti-prodotto1.getPrezzo();  //calcolo del resto
					soldiInseriti=resto;						
					stampaResto();								//richiamo il metodo stampa resto
				}
				else if(soldiInseriti<prodotto1.getPrezzo()){
					System.out.println("Non hai abbastanza soldi");
				}
				else if(quantita<=0){
					System.out.println("il prodotto è terminato");
				}
			break;
			case 2:
				System.out.println("Hai scelto "+prodotto2.getNome()+",prezzo: "+prodotto2.getPrezzo());
				if(soldiInseriti>=prodotto2.getPrezzo()&& prodotto2.getQuantita()>0) {
					System.out.println("Erogazione in corso");
					prodotto2.quantitaDopoVendita();
					quantitaIncasso+=prodotto2.getPrezzo();
					prodotto2.setQuantitaAcq();
					resto=soldiInseriti-prodotto2.getPrezzo();
					soldiInseriti=resto;
					stampaResto();
				}
				else if(soldiInseriti<prodotto2.getPrezzo()){
					System.out.println("Non hai abbastanza soldi");
				}
				else if(quantita<=0){
					System.out.println("il prodotto è terminato");
				}
			break;
			case 3:
				System.out.println("Hai scelto "+prodotto3.getNome()+",prezzo: "+prodotto3.getPrezzo());
				if(soldiInseriti>=prodotto3.getPrezzo()&& prodotto3.getQuantita()>0) {
					System.out.println("Erogazione in corso");
					prodotto3.quantitaDopoVendita();
					prodotto3.setQuantitaAcq();
					quantitaIncasso+=prodotto3.getPrezzo();
					resto=soldiInseriti-prodotto3.getPrezzo();
					soldiInseriti=resto;
					stampaResto();
				}
				else if(soldiInseriti<prodotto3.getPrezzo()){
					System.out.println("Non hai abbastanza soldi");
				}
				else if(quantita<=0){
					System.out.println("il prodotto è terminato");
				}
			break;
			case 4:
				System.out.println("Hai scelto "+prodotto4.getNome()+",prezzo: "+prodotto4.getPrezzo());
				if(soldiInseriti>=prodotto4.getPrezzo()&& prodotto4.getQuantita()>0) {
					System.out.println("Erogazione in corso");
					prodotto4.quantitaDopoVendita();
					prodotto4.setQuantitaAcq();
					quantitaIncasso+=prodotto4.getPrezzo();
					resto=soldiInseriti-prodotto4.getPrezzo();
					soldiInseriti=resto;
					stampaResto();
				}
				else if(soldiInseriti<prodotto4.getPrezzo()){
					System.out.println("Non hai abbastanza soldi");
				}
				else if(quantita<=0){
					System.out.println("il prodotto è terminato");
				}
			break;
			case 5:
				System.out.println("Hai scelto "+prodotto5.getNome()+",prezzo: "+prodotto5.getPrezzo());
				if(soldiInseriti>=prodotto5.getPrezzo()&& prodotto5.getQuantita()>0) {
					System.out.println("Erogazione in corso");
					prodotto5.quantitaDopoVendita();
					prodotto5.setQuantitaAcq();
					quantitaIncasso+=prodotto5.getPrezzo();
					resto=soldiInseriti-prodotto5.getPrezzo();
					soldiInseriti=resto;
					stampaResto();
				}
				else if(soldiInseriti<prodotto5.getPrezzo()){
					System.out.println("Non hai abbastanza soldi");
				}
				else if(quantita<=0){
					System.out.println("il prodotto è terminato");
				}
			break;
			case 6:
				System.out.println("Hai scelto "+prodotto6.getNome()+",prezzo: "+prodotto6.getPrezzo());
				System.out.println("Inserire tessera sanitaria");
				if(soldiInseriti>=prodotto6.getPrezzo() && eta>=18 && prodotto6.getQuantita()>0) {
					System.out.println("Erogazione in corso");
					prodotto6.quantitaDopoVendita();
					prodotto6.setQuantitaAcq();
					quantitaIncasso+=prodotto6.getPrezzo();
					resto=soldiInseriti-prodotto6.getPrezzo();
					soldiInseriti=resto;
					stampaResto();
				}
				else if(eta<18) {
					System.out.println("Sei minorenne");
				}
				else if(soldiInseriti<prodotto6.getPrezzo()) {
					System.out.println("Non hai abbastanza soldi");
				}
				else if(quantita<=0){
					System.out.println("il prodotto è terminato");
				}
					
			break;
			case 7:
				System.out.println("Hai scelto "+prodotto7.getNome()+",prezzo: "+prodotto7.getPrezzo());
				System.out.println("Inserire tessera sanitaria");
				if(soldiInseriti>=prodotto7.getPrezzo() && eta>=18 && prodotto7.getQuantita()>0) {
					System.out.println("Erogazione in corso");
					prodotto7.quantitaDopoVendita();
					prodotto7.setQuantitaAcq();
					quantitaIncasso+=prodotto7.getPrezzo();
					resto=soldiInseriti-prodotto7.getPrezzo();
					soldiInseriti=resto;
					stampaResto();
				}
				else if(eta<18) {
					System.out.println("Sei minorenne");
				}
				else if(soldiInseriti<prodotto7.getPrezzo()) {
					System.out.println("Non hai abbastanza soldi");
				}
				else if(quantita<=0){
					System.out.println("il prodotto è terminato");
				}
				break;
			case 8:
				System.out.println("Hai scelto "+prodotto8.getNome()+",prezzo: "+prodotto8.getPrezzo());
				System.out.println("Inserire tessera sanitaria");
				if(soldiInseriti>=prodotto8.getPrezzo() && eta>=18 && prodotto8.getQuantita()>0) {
					System.out.println("Erogazione in corso");
					prodotto8.quantitaDopoVendita();
					prodotto8.setQuantitaAcq();
					quantitaIncasso+=prodotto8.getPrezzo();
					resto=soldiInseriti-prodotto8.getPrezzo();
					soldiInseriti=resto;
					stampaResto();
				}
				else if(eta<18) {
					System.out.println("Sei minorenne");
				}
				else if(soldiInseriti<prodotto8.getPrezzo()) {
					System.out.println("Non hai abbastanza soldi");
				}
				else if(quantita<=0){
					System.out.println("il prodotto è terminato");
				}
			break;
			case 9:
				System.out.println("Hai scelto "+prodotto9.getNome()+",prezzo: "+prodotto9.getPrezzo());
				System.out.println("Inserire tessera sanitaria");
				if(soldiInseriti>=prodotto9.getPrezzo() && eta>=18 && prodotto9.getQuantita()>0) {
					System.out.println("Erogazione in corso");
					prodotto9.quantitaDopoVendita();
					prodotto9.setQuantitaAcq();
					quantitaIncasso+=prodotto9.getPrezzo();
					resto=soldiInseriti-prodotto9.getPrezzo();
					soldiInseriti=resto;
					stampaResto();
					
				}
				else if(eta<18) {
					System.out.println("Sei minorenne");
				}
				else if(soldiInseriti<prodotto9.getPrezzo()) {
					System.out.println("Non hai abbastanza soldi o il prodotto è terminato");
				}
				else if(quantita<=0){
					System.out.println("il prodotto è terminato");
				}
			break;
			
			default:
				System.out.println("Codice errato.");
				System.exit(0);
				
			}
			}
		
		public static void stampaResto() {	//metodo per stampare il resto
			System.out.println("questo è il tuo resto:"+resto);
		}
}