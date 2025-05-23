package day_02;
/*
 * Scrivi un programma Java che chieda all'utente di inserire la
 * lunghezza e la larghezza di un rettangolo e stampi l'area corrispondente.
 */

import java.util.Scanner;

public class AreaRettangolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Inserisci base del rettangolo");
		double base=input.nextDouble();
		System.out.println("Inserisci altezza del rettangolo");
		double altezza=input.nextDouble();
		double area = base * altezza;
		System.out.println("Il rettangolo è "+ area);
		input.close();

	}

}
