package day_04;

public class LuhnDebug {

    public static boolean isValid(String input) {
        if (input == null) return false;

        String sanitized = input.replaceAll(" ", "");

        if (sanitized.length() <= 1 || !sanitized.matches("\\d+")) {
            return false;
        }

        int sum = 0;
        boolean doubleDigit = false;

        System.out.println("Input pulito: " + sanitized);
        System.out.print("Cifre elaborate: ");

        for (int i = sanitized.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(sanitized.charAt(i));
            int original = digit;

            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) digit -= 9;
            }

            sum += digit;

            System.out.print("[" + original + (doubleDigit ? "→" + digit : "") + "] ");
            doubleDigit = !doubleDigit;
        }

        System.out.println("\nSomma totale: " + sum);
        boolean isValid = sum % 10 == 0;
        System.out.println("Il numero è " + (isValid ? "VALIDO ✅" : "NON valido ❌"));

        return isValid;
    }

    public static void main(String[] args) {
        String numero1 = "4539 3195 0343 6467";
        System.out.println("\n--- Verifica 1 ---");
        isValid(numero1);

        String numero2 = "8273 1232 7352 0569";
        System.out.println("\n--- Verifica 2 ---");
        isValid(numero2);
    }
}