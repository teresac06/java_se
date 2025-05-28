package day_03;

import java.util.Scanner;

public class NomeSchermo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        int lunghezza = nome.length();
        String bordo = "+" + "-".repeat(lunghezza + 2) + "+";

        System.out.println(bordo);
        System.out.println("| " + nome + " |");
        System.out.println(bordo);

        scanner.close();
	}

}
