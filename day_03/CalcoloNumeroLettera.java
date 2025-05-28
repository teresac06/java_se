package day_03;

import java.util.Scanner;

public class CalcoloNumeroLettera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Inserisci una frase: ");
	        String frase = scanner.nextLine();

	        System.out.print("Inserisci la lettera da cercare: ");
	        char lettera = scanner.nextLine().charAt(0); // prende solo il primo carattere

	        int conteggio = 0;

	        for (int i = 0; i < frase.length(); i++) {
	            if (frase.charAt(i) == lettera) {
	                conteggio++;
	            }
	        }

	        System.out.println("La lettera '" + lettera + "' compare " + conteggio + " volte nella frase.");

	        scanner.close();

	}

}
