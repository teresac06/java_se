package day_04;

public class ProdottoDiSerie {

	 public static int prodottoSerieMassimo(String input, int span) {
	        if (input == null || input.length() < span || span <= 0) {
	            throw new IllegalArgumentException("Input non valido o span troppo lungo.");
	        }

	        int maxProdotto = 0;

	        for (int i = 0; i <= input.length() - span; i++) {
	            int prodotto = 1;

	            for (int j = i; j < i + span; j++) {
	                char c = input.charAt(j);
	                if (!Character.isDigit(c)) {
	                    throw new IllegalArgumentException("Il segnale contiene caratteri non numerici.");
	                }

	                prodotto *= Character.getNumericValue(c);
	            }

	            if (prodotto > maxProdotto) {
	                maxProdotto = prodotto;
	            }
	        }

	        return maxProdotto;
	    }

	    public static void main(String[] args) {
	        String segnale = "63915";
	        int span = 3;

	        int risultato = prodottoSerieMassimo(segnale, span);
	        System.out.println("Il prodotto massimo per span " + span + " è: " + risultato);
	    }
	}

