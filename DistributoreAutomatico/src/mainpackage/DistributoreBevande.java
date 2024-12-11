package mainpackage;
import java.util.Scanner;
import java.util.ArrayList;
public class DistributoreBevande {

	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	
	int codoperatore=0;
	double [][]prezzi= {{2.00,2.00,1.00},{0.70,2.00,2.30},{2.50,1.50,1.50}};
	int [][]prodotti= {{0,5,7},{1,3,2},{10,6,8}};
	String bevande[]= {"coca-cola","fanta","caffè","acqua","thè","birra","campari soda","molinari","grappino"};
	int codice=0;
	double resto=0;
	int eta=0;
	double prezzo=0;
	double soldi=5;
	String risposta;
	System.out.print("Inserisci codice: 1clienti,2operatore,3stampa ");
	codice=scanner.nextInt();
	if(codice==1) {
		System.out.println("Benvenuto cliente");
		System.out.println("Inserire codice bevanda");
		int codbevanda=scanner.nextInt();
		switch(codbevanda) {
		case 1:
			 
			System.out.println("Hai scelto "+bevande[0]+",prezzo:2.00€");
			if(soldi>=prezzi[0][0]) {
				System.out.println("Erogazione in corso");
				prodotti[0][0]--;
				soldi=soldi-prezzi[0][0];
				System.out.println("Vuoi stampare lo scontrino?");
				risposta=scanner.nextLine();
				if(risposta.equals("si")) {
					
				}
			}else 
				System.out.println("Caccia du piotte");
			
			break;
		case 2:
			
			System.out.println("Hai scelto "+bevande[1]+",prezzo:2.00€");
			if(soldi>=prezzi[0][1]) {
				System.out.println("Erogazione in corso");
				prodotti[0][1]--;
				soldi=soldi-prezzi[0][1];
			}else 
				System.out.println("Caccia du piotte");
			break;
		case 3:
			System.out.println("Hai scelto "+bevande[2]+",prezzo:1.00€");
			if(soldi>=prezzi[0][2]) {
				System.out.println("Erogazione in corso");
				prodotti[0][2]--;
				soldi=soldi-prezzi[0][2];
			}else 
				System.out.println("Caccia du piotte");
			break;
		case 4:
			System.out.println("Hai scelto "+bevande[3]+",prezzo:0.70€");
			if(soldi>=prezzi[1][0]) {
				System.out.println("Erogazione in corso");
				prodotti[1][0]--;
				soldi=soldi-prezzi[1][0];
			}else 
				System.out.println("Caccia du piotte");
			break;
		case 5:
			System.out.println("Hai scelto "+bevande[4]+",prezzo:2.00€");
			if(soldi>=prezzi[1][1]) {
				System.out.println("Erogazione in corso");
				prodotti[1][1]--;
				soldi=soldi-prezzi[1][1];
			}else 
				System.out.println("Caccia du piotte");
			break;
		case 6:
			System.out.println("Hai scelto "+bevande[5]+",prezzo:2.30€");
			System.out.println("Inserire tessera sanitaria");
			eta=(int)(Math.random()*93+8);
			System.out.println(eta);
			if(soldi>=prezzi[1][2] && eta>=18) {
				System.out.println("Erogazione in corso");
				prodotti[1][2]--;
				System.out.println(prodotti);
				soldi=soldi-prezzi[1][2];
			}else if(eta<18) {
				System.out.println("Sei minorenne");
			}else if(soldi<prezzi[1][2]) {
				System.out.println("Caccia du piotte");
			}
				
			break;
		case 7:
			System.out.println("Hai scelto "+bevande[6]+",prezzo:2.50€");
			eta=(int)(Math.random()*93+8);
			
			System.out.println(eta);
			if(soldi>=prezzi[2][0] && eta>=18) {
				System.out.println("Erogazione in corso");
				prodotti[2][0]--;
				soldi=soldi-prezzi[2][0];
			}else if(eta<18) {
				System.out.println("Sei minorenne");
			}else if(soldi<prezzi[2][0]) {
				System.out.println("Caccia du piotte");
			}
			break;
		case 8:
			System.out.println("Hai scelto "+bevande[7]+",prezzo:1.50€");
			eta=(int)(Math.random()*93+8);
			
			System.out.println(eta);
			if(soldi>=prezzi[2][1] && eta>=18) {
				System.out.println("Erogazione in corso");
				prodotti[2][1]--;
				soldi=soldi-prezzo;
			}else if(eta<18) {
				System.out.println("Sei minorenne");
			}else if(soldi<prezzi[2][1]) {
				System.out.println("Caccia du piotte");
			}
			break;
		case 9:
			System.out.println("Hai scelto "+bevande[8]+",prezzo:1.50€");
			eta=(int)(Math.random()*93+8);
			
			System.out.println(eta);
			if(soldi>=prezzi[2][2] && eta>=18) {
				System.out.println("Erogazione in corso");
				prodotti[2][2]--;
				soldi=soldi-prezzi[2][2];
			}else if(eta<18) {
				System.out.println("Sei minorenne");
			}else if(soldi<prezzi[2][2]) {
				System.out.println("Caccia du piotte");
			}
			break;
			
			default:
			System.out.println("Codice errato...A coglione");
			
			System.exit(0);}
		
	}else if(codice==2) {
		System.out.println("Inserisci codice operatore");
       codoperatore=scanner.nextInt();
		if(codoperatore==0001) {
			System.out.println("Welcome sir");
			System.out.print("Vuoi aggiungere un prodotto? Premi 1: ");
			int inputMagazziniere = scanner.nextInt();
			if (inputMagazziniere == 1) { 
				System.out.print("In quale scaffale vuoi aggiungere un prodotto?");
				int scaffale = scanner.nextInt();
				if (scaffale >= 0 &&  scaffale < prodotti.length) {
					System.out.print("In quale scomparto vuoi aggiungere un prodotto? ");
					int scomparto = scanner.nextInt();
					if (scomparto >= 0 && scomparto < prodotti[scaffale].length) {
						System.out.print("Quanti prodotti vuoi aggiungere? : ");
						int quantitaDaAggiungere = scanner.nextInt();
					
						prodotti[scaffale][scomparto] += quantitaDaAggiungere;
					}
				}
					}
		}
		else if(codoperatore==0002) {
			
			System.out.println("Welcome sir");
			System.out.print("Vuoi rimuovere un prodotto? Premi 1: ");
			int inputMagazziniere = scanner.nextInt();
			if (inputMagazziniere == 1) { 
				System.out.print("In quale scaffale vuoi rimuovere un prodotto?");
				int scaffale = scanner.nextInt();
				if (scaffale >=0 &&  scaffale < prodotti.length) {//inserire numero prodotti >0
					System.out.print("In quale scomparto vuoi rimuovere un prodotto? ");
					int scomparto = scanner.nextInt();
					if (scomparto >=0 && scomparto < prodotti[scaffale].length) {
						System.out.print("Quanti prodotti vuoi rimuovere? : ");
						int quantitaDarimuovere = scanner.nextInt();
					
						prodotti[scaffale][scomparto] -= quantitaDarimuovere;
					
				}
					}
		}
	}else if(codoperatore==0003) {
		int scomparto=0;
		int scaffale=0;
		System.out.println("Welcome sir");
		System.out.print("Vuoi cambiare prezzo? Premi 1: ");
		int inputMagazziniere = scanner.nextInt();
		if (inputMagazziniere == 1) { 
			System.out.print("In quale scaffale vuoi modificare il prezzo?");
			 scaffale = scanner.nextInt();
			if (scaffale >=0 &&  scaffale < prezzi.length) {//inserire numero prodotti >0
				System.out.print("In quale scomparto vuoi modificare il prezzo? ");
				 scomparto = scanner.nextInt();
				if (scomparto >=0 && scomparto < prezzi[scaffale].length) {
					System.out.println(prezzi[scaffale][scomparto]);
					System.out.print("Qual'è il nuovo prezzo? : ");
					double nuovoprezzo = scanner.nextDouble();
				
					prezzi[scaffale][scomparto] = nuovoprezzo;
					//System.out.println(prezzi[scaffale][scomparto]);				
			}
					
				}
			int i=0;
			int j=0;
			for(i=0;i<prezzi.length;i++) {
				for(j=0;j<prezzi[i].length;j++) {
					
					System.out.print(prezzi[i][j]+" ");
				}
			}
	}
	}
		
	}else {
		System.out.println("codice errato");
	}
	}
	}
