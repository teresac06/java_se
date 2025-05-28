package day_03;

import java.util.Scanner;

public class AreaTrapezio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la lunghezza della base maggiore: ");
        double baseMaggiore = scanner.nextDouble();

        System.out.print("Inserisci la lunghezza della base minore: ");
        double baseMinore = scanner.nextDouble();

        System.out.print("Inserisci l'altezza del trapezio: ");
        double altezza = scanner.nextDouble();

        double area = ((baseMaggiore + baseMinore) * altezza) / 2;

        System.out.println("L'area del trapezio è: " + area);

        scanner.close();

	}

}
