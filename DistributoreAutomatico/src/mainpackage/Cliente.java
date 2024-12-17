package mainpackage;
import java.util.Scanner;
import java.util.ArrayList;
public class Cliente extends Distributore{ 
	
	
	public static double resto;
	public static double quantitaIncasso;
	private static Distributore distributore1 = new Distributore();
	public static double eta =(int)(Math.random()*93+8);
	public static double soldi=(int)(Math.random()*10+1);
	public static void StampaQuantitaIncasso() {
		System.out.println(quantitaIncasso);
	}
	public static void CompraBev(String nome,double prezzo,int quantita) {
		
			System.out.println("in tasca hai: "+ soldi);
		
		//	System.out.println("hai: "+ eta+" anni.");
		Scanner scanner = new Scanner(System.in);
			System.out.println("Benvenuto cliente");
			System.out.println("hai: "+ eta +" anni.");
			System.out.println("Inserire codice bevanda");
		int codbevanda=scanner.nextInt();
			switch(codbevanda) {
			case 1:
				System.out.println("Hai scelto "+bevande.get(0)+",prezzo:2.00€");
				if(soldi>=prodotto1.getPrezzo()) {
					System.out.println("Erogazione in corso");
					prodotto1.quantitaDopoVendita();
					quantitaIncasso+=prodotto1.getPrezzo();
					prodotto1.setQuantitaAcq();
					soldi-=prodotto1.getPrezzo();
					resto=soldi-prodotto1.getPrezzo();
				}else 
					System.out.println("Caccia du piotte");
			break;
			case 2:
				System.out.println("Hai scelto "+bevande.get(1)+",prezzo:2.00€");
				if(soldi>=prodotto2.getPrezzo()) {
					System.out.println("Erogazione in corso");
					prodotto2.quantitaDopoVendita();
					quantitaIncasso+=prodotto2.getPrezzo();
					prodotto2.setQuantitaAcq();
					resto=soldi-prodotto2.getPrezzo();
					soldi-=prodotto2.getPrezzo();
				}else 
				System.out.println("Caccia du piotte");
			break;
			case 3:
				System.out.println("Hai scelto "+bevande.get(2)+",prezzo:1.00€");
				if(soldi>=prodotto3.getPrezzo()) {
					System.out.println("Erogazione in corso");
					prodotto3.quantitaDopoVendita();
					prodotto3.setQuantitaAcq();
					quantitaIncasso+=prodotto3.getPrezzo();
					soldi-=prodotto3.getPrezzo();
					resto=soldi-prodotto3.getPrezzo();
				}else 
					System.out.println("Caccia du piotte");
			break;
			case 4:
				System.out.println("Hai scelto "+bevande.get(3)+",prezzo:0.70€");
				if(soldi>=prodotto4.getPrezzo()) {
					System.out.println("Erogazione in corso");
					prodotto4.quantitaDopoVendita();
					prodotto4.setQuantitaAcq();
					quantitaIncasso+=prodotto4.getPrezzo();
					soldi-=prodotto4.getPrezzo();
					resto=soldi-prodotto4.getPrezzo();
				}else 
					System.out.println("Caccia du piotte");
			break;
			case 5:
				System.out.println("Hai scelto "+bevande.get(4)+",prezzo:2.00€");
				if(soldi>=prodotto5.getPrezzo()) {
					System.out.println("Erogazione in corso");
					prodotto5.quantitaDopoVendita();
					prodotto5.setQuantitaAcq();
					quantitaIncasso+=prodotto5.getPrezzo();
					soldi-=prodotto5.getPrezzo();
					resto=soldi-prodotto5.getPrezzo();
				}else 
					System.out.println("Caccia du piotte");
			break;
			case 6:
				System.out.println("Hai scelto "+bevande.get(5)+",prezzo:2.30€");
				System.out.println("Inserire tessera sanitaria");
				if(soldi>=prodotto6.getPrezzo() && eta>=18) {
					System.out.println("Erogazione in corso");
					prodotto6.quantitaDopoVendita();
					prodotto6.setQuantitaAcq();
					quantitaIncasso+=prodotto6.getPrezzo();
					soldi-=prodotto6.getPrezzo();
					resto=soldi-prodotto6.getPrezzo();
				}else if(eta<18) {
					System.out.println("Sei minorenne");
				}else if(soldi<prodotto6.getPrezzo()) {
					System.out.println("Caccia du piotte");
				}
					
			break;
			case 7:
				System.out.println("Hai scelto "+bevande.get(6)+",prezzo:2.50€");
				if(soldi>=prodotto7.getPrezzo() && eta>=18) {
					System.out.println("Erogazione in corso");
					prodotto7.quantitaDopoVendita();
					prodotto7.setQuantitaAcq();
					quantitaIncasso+=prodotto7.getPrezzo();
					soldi-=prodotto7.getPrezzo();
					resto=soldi-prodotto7.getPrezzo();
				}else if(eta<18) {
					System.out.println("Sei minorenne");
				}else if(soldi<prodotto7.getPrezzo()) {
					System.out.println("Caccia du piotte");
				}
				break;
			case 8:
				System.out.println("Hai scelto "+bevande.get(7)+",prezzo:1.50€");
			
				if(soldi>=prodotto8.getPrezzo() && eta>=18) {
					System.out.println("Erogazione in corso");
					prodotto8.quantitaDopoVendita();
					prodotto8.setQuantitaAcq();
					quantitaIncasso+=prodotto8.getPrezzo();
					soldi-=prodotto8.getPrezzo();
					resto=soldi-prodotto8.getPrezzo();
				}else if(eta<18) {
					System.out.println("Sei minorenne");
				}else if(soldi<prodotto8.getPrezzo()) {
					System.out.println("Caccia du piotte");
				}
			break;
			case 9:
				System.out.println("Hai scelto "+prodotto9.getNome()+",prezzo:1.50€");
		
				if(soldi>=prodotto9.getPrezzo() && eta>=18) {
					System.out.println("Erogazione in corso");
					prodotto9.quantitaDopoVendita();
					prodotto9.setQuantitaAcq();
					quantitaIncasso+=prodotto9.getPrezzo();
					soldi-=prodotto9.getPrezzo();
					resto=soldi-prodotto9.getPrezzo();
				}else if(eta<18) {
					System.out.println("Sei minorenne");
				}else if(soldi<prodotto9.getPrezzo()) {
					System.out.println("Caccia du piotte");
				}
			break;
			
			default:
				System.out.println("Codice errato...A coglione");
			
			System.exit(0);
			}
		
	}

}

