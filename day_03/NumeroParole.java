package day_03;

import java.util.Scanner;

public class NumeroParole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una frase: ");
        String frase = scanner.nextLine().trim(); // Rimuove spazi iniziali e finali

        if (frase.isEmpty()) {
            System.out.println("Hai inserito una stringa vuota. Numero di parole: 0");
        } else {
            // Divide la stringa usando uno o più spazi come separatore
            String[] parole = frase.split("\\s+");
            System.out.println("Numero di parole: " + parole.length);
        }

        scanner.close();

	}

}
