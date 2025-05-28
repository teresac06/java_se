package day_03;

import java.util.Scanner;

public class ValoreAssoluto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();

        int valoreAssoluto = Math.abs(numero);

        System.out.println("Il valore assoluto è: " + valoreAssoluto);

        scanner.close();

	}

}
