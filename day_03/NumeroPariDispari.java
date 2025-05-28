package day_03;

import java.util.Scanner;

public class NumeroPariDispari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Il numero è pari.");
        } else {
            System.out.println("Il numero è dispari.");
        }

        scanner.close();

	}

}
