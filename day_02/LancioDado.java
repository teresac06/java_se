package day_02;

import java.util.Random;

/*
 * Gioco del lancio del dado
 * Traccia: Scrivi un programma Java che simuli il lancio di un dado a sei facce. 
 * Il programma dovrà generare casualmente un numero compreso tra 1 e 6 e stamparlo a schermo.
 */

public class LancioDado {

	public static void main(String[] args) {
		Random random = new Random(); //genera oggetto di tipo random
		int risultato = random.nextInt(6) + 1; //genera un numero tra 1 e 6
		System.out.println("risultato del dado: " + risultato);

	}

}
