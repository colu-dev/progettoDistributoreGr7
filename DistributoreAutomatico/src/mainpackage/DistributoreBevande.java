package mainpackage;
import java.util.Scanner;
import java.util.ArrayList;

public class DistributoreBevande {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codoperatore = 0;
        double[][] prezzi = {{2.00, 2.00, 1.00}, {0.70, 2.00, 2.30}, {2.50, 1.50, 1.50}};
        int[][] prodotti = {{0, 5, 7}, {1, 3, 2}, {10, 6, 8}};
        String bevande[] = {"coca-cola", "fanta", "Succo", "acqua", "thè", "Ringo", "Kinder Bueno", "Oreo", "Patatina"};
        int codice = 0;
        double resto = 0;
        double prezzo = 0;
        double soldi = 0;
       
        System.out.print("Inserisci codice: \n1) Clienti. \n2) Operatore. \n3) Stampa. ");
        codice = scanner.nextInt();

        if (codice == 1) {
            System.out.println("Benvenuto cliente");
            System.out.println("Inserire codice bevanda");
            int codbevanda = scanner.nextInt();
            switch (codbevanda) {
                case 1:
                    prezzo = 2.00;
                    System.out.println("Hai scelto " + bevande[0] + ", prezzo: 2.00€");
                    System.out.println("Inserisci denaro:");
                    soldi = scanner.nextDouble();
                    if (soldi >= prezzo) {
                        System.out.println("Erogazione in corso");
                        prodotti[0][0]--;
                        resto = soldi - prezzo;
                        System.out.println("resto: " + resto + "€");
                    } else {
                        System.out.println("imporot insufficienti!");
                        System.out.println("Inserisci denaro");
                        soldi = scanner.nextInt();
                        if (soldi >= prezzo) {
                            System.out.println("Erogazione in corso");
                            prodotti[2][0]--;
                            resto = soldi - prezzo;
                            System.out.println("resto: " + resto + "€");
                        } else if (soldi < prezzo) {
                        	
                        }
                    }
                    break;
                case 2:
                    prezzo = 2.00;
                    System.out.println("Hai scelto " + bevande[1] + ", prezzo: 2.00€");
                    System.out.println("Inserisci denaro:");
                    soldi = scanner.nextDouble();
                    if (soldi >= prezzo) {
                        System.out.println("Erogazione in corso");
                        prodotti[0][1]--;
                        resto = soldi - prezzo;
                        System.out.println("resto: " + resto + "€");
                    } else {
                        System.out.println("importo insufficienti!");
                        System.out.println("Inserisci denaro");
                        soldi = scanner.nextInt();
                        if (soldi >= prezzo) {
                            System.out.println("Erogazione in corso");
                            prodotti[2][0]--;
                            resto = soldi - prezzo;
                            System.out.println("resto: " + resto + "€");
                        } else if (soldi < prezzo) {
                        	
                        }
                    }
                    break;
                case 3:
                    prezzo = 1.00;
                    System.out.println("Hai scelto " + bevande[2] + ", prezzo: 1.00€");
                    System.out.println("Inserisci denaro:");
                    soldi = scanner.nextDouble();
                    if (soldi >= prezzo) {
                        System.out.println("Erogazione in corso");
                        prodotti[0][2]--;
                        resto = soldi - prezzo;
                        System.out.println("resto: " + resto + "€");
                    } else {
                        System.out.println("importo insufficienti!");
                        System.out.println("Inserisci denaro");
                        soldi = scanner.nextInt();
                        if (soldi >= prezzo) {
                            System.out.println("Erogazione in corso");
                            prodotti[2][0]--;
                            resto = soldi - prezzo;
                            System.out.println("resto: " + resto + "€");
                        } else if (soldi < prezzo) {
                        	
                        }
                    }
                    break;
                case 4:
                    prezzo = 0.70;
                    System.out.println("Hai scelto " + bevande[3] + ", prezzo: 0.70€");
                    System.out.println("Inserisci denaro:");
                    soldi = scanner.nextDouble();
                    if (soldi >= prezzo) {
                        System.out.println("Erogazione in corso");
                        prodotti[1][0]--;
                        resto = soldi - prezzo;
                        System.out.println("resto: " + resto + "€");
                    } else {
                        System.out.println("importo insufficienti!");
                        System.out.println("Inserisci denaro");
                        soldi = scanner.nextInt();
                        if (soldi >= prezzo) {
                            System.out.println("Erogazione in corso");
                            prodotti[2][0]--;
                            resto = soldi - prezzo;
                            System.out.println("resto: " + resto + "€");
                        } else if (soldi < prezzo) {
                        	
                        }
                    }
                    break;
                case 5:
                    prezzo = 2.00;
                    System.out.println("Hai scelto " + bevande[4] + ", prezzo: 2.00€");
                    System.out.println("Inserisci denaro:");
                    soldi = scanner.nextDouble();
                    if (soldi >= prezzo) {
                        System.out.println("Erogazione in corso");
                        prodotti[1][1]--;
                        resto = soldi - prezzo;
                        System.out.println("resto: " + resto + "€");
                    } else {
                        System.out.println("importo insufficienti!");
                        System.out.println("Inserisci denaro");
                        soldi = scanner.nextInt();
                        if (soldi >= prezzo) {
                            System.out.println("Erogazione in corso");
                            prodotti[2][0]--;
                            resto = soldi - prezzo;
                            System.out.println("resto: " + resto + "€");
                        } else if (soldi < prezzo) {
                        	
                        }
                    }
                    break;
                case 6:
                    prezzo = 2.30;
                    System.out.println("Hai scelto " + bevande[5] + ", prezzo: 2.30€");    
                    System.out.println("Inserisci denaro");
                    soldi=scanner.nextInt();
                    if (soldi >= prezzo) {
                        System.out.println("Erogazione in corso");
                        prodotti[1][2]--;
                        resto = soldi - prezzo;
                        System.out.println("resto: " + resto + "€");
                        System.out.println("Inserisci denaro");
                        soldi = scanner.nextInt();
                        if (soldi >= prezzo) {
                            System.out.println("Erogazione in corso");
                            prodotti[2][0]--;
                            resto = soldi - prezzo;
                            System.out.println("resto: " + resto + "€");
                        } else if (soldi < prezzo) {
                        	
                        }
                    }
                        break;
                case 7:
                    prezzo = 2.50;
                    System.out.println("Hai scelto " + bevande[6] + ", prezzo: 2.50€");
                    System.out.println("Inserisci denaro");
                    soldi = scanner.nextInt();
                    if (soldi >= prezzo) {
                        System.out.println("Erogazione in corso");
                        prodotti[2][0]--;
                        resto = soldi - prezzo;
                        System.out.println("resto: " + resto + "€");
                    } else if (soldi < prezzo) {
                        System.out.println("Soldi insufficienti!");
                        System.out.println("Inserisci denaro");
                        soldi = scanner.nextInt();
                        if (soldi >= prezzo) {
                            System.out.println("Erogazione in corso");
                            prodotti[2][0]--;
                            resto = soldi - prezzo;
                            System.out.println("resto: " + resto + "€");
                        } else if (soldi < prezzo) {
                        	
                        }
                        
                    }
                    break;
                case 8:
                    prezzo = 1.50;
                    System.out.println("Hai scelto " + bevande[7] + ", prezzo: 1.50€");
                    System.out.println("Inserisci denaro");
                    soldi = scanner.nextInt();
                    
                    if (soldi >= prezzo ) {
                        System.out.println("Erogazione in corso");
                        prodotti[2][1]--;
                        resto = soldi - prezzo;
                        System.out.println("resto: " + resto + "€");
                
                    } else if (soldi < prezzo) {
                        System.out.println("importo insufficienti!");
                        System.out.println("Inserisci denaro");
                        soldi = scanner.nextInt();
                        if (soldi >= prezzo) {
                            System.out.println("Erogazione in corso");
                            prodotti[2][0]--;
                            resto = soldi - prezzo;
                            System.out.println("resto: " + resto + "€");
                        } else if (soldi < prezzo) {
                        	
                        }
                    }
                    break;
                case 9:
                    prezzo = 1.50;
                    System.out.println("Hai scelto " + bevande[8] + ", prezzo: 1.50€");
                    System.out.println("Inserisci denaro");
                    soldi = scanner.nextInt();
                    
                    if (soldi >= prezzo) {
                        System.out.println("Erogazione in corso");
                        prodotti[2][2]--;
                        resto = soldi - prezzo;
                        System.out.println("resto: " + resto + "€" );
                  
                    } else if (soldi < prezzo) {
                        System.out.println("importo insufficienti!");
                        System.out.println("Inserisci denaro");
                        soldi = scanner.nextInt();
                        if (soldi >= prezzo) {
                            System.out.println("Erogazione in corso");
                            prodotti[2][0]--;
                            resto = soldi - prezzo;
                            System.out.println("resto: " + resto + "€" );
                         } else if (soldi < prezzo) {
                        	
                        	
                        }
                        
                    }
                    break;
                default:
                    System.out.println("Codice bevanda errato!");
                    break;
                    
            }
        } else if (codice == 2) {
        	System.out.println("Inserisci codice operatore");
        	int codiceOperatore= 0001;
        	codiceOperatore=scanner.nextInt();
        	if(codiceOperatore==0001) {
          System.out.println("msa msa y zmili!! dimmi tutto?");
          System.out.println("1) aggiungere un prodotto.");
          System.out.println("2) rimuovere prodotto.");
          System.out.println("3) cambiare la quantità disponibile.");
          System.out.println("4) cambiare il prezzo di un prodotto.");
          System.out.println("5) Visualizza totale incassato.");
          System.out.println("6) Visualizza prodotti venduti.");
        } else {
            System.out.println("Codice errato.");
        }

        }
    }
}

