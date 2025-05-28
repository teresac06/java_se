package day_03;

import java.util.Scanner;

public class StringaPalindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Inserisci una frase o parola: ");
		        String input = scanner.nextLine();

		        // Rende la stringa minuscola e rimuove spazi e punteggiatura
		        String pulita = input.toLowerCase().replaceAll("[^a-z0-9]", "");

		        // Inverte la stringa
		        String inversa = new StringBuilder(pulita).reverse().toString();

		        if (pulita.equals(inversa)) {
		            System.out.println("✅ La stringa è un palindromo!");
		        } else {
		            System.out.println("❌ La stringa NON è un palindromo.");
		        }

		        scanner.close();

	}

}
