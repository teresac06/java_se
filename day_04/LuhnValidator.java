package day_04;

public class LuhnValidator {
	
    public static boolean isValid(String input) {
        if (input == null) return false;

        // Rimuovi tutti gli spazi
        String sanitized = input.replaceAll(" ", "");

        // Deve essere lungo almeno 2 e contenere solo numeri
        if (sanitized.length() <= 1 || !sanitized.matches("\\d+")) {
            return false;
        }

        int sum = 0;
        boolean doubleDigit = false;

        // Scorri le cifre da destra a sinistra
        for (int i = sanitized.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(sanitized.charAt(i));

            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) digit -= 9;
            }

            sum += digit;
            doubleDigit = !doubleDigit;
        }

        return sum % 10 == 0;
    }

    public static void main(String[] args) {
        String numero = "8273 1232 7352 0569";  // carta di credito valida
        System.out.println("È valido secondo Luhn? " + isValid(numero));

	}

}
