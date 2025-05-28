package day_04;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GiardinoAsilo {
    static final String[] bambini = {
            "Alice", "Bob", "Charlie", "David",
            "Eve", "Fred", "Ginny", "Harriet",
            "Ileana", "Joseph", "Kincaid", "Larry"
        };

        static final Map<Character, String> piantaMap = Map.of(
            'G', "Erba",
            'C', "Trifoglio",
            'R', "Ravanello",
            'E', "Viola"
        );

        public static Map<String, List<String>> assegnaPiante(String riga1, String riga2) {
            Map<String, List<String>> mappa = new LinkedHashMap<>();

            for (int i = 0; i < bambini.length; i++) {
                List<String> piante = new ArrayList<>();
                // Ogni bambino ha due tazze per riga → 2 tazze * 2 righe = 4 piante
                int indice = i * 2;
                piante.add(piantaMap.get(riga1.charAt(indice)));
                piante.add(piantaMap.get(riga1.charAt(indice + 1)));
                piante.add(piantaMap.get(riga2.charAt(indice)));
                piante.add(piantaMap.get(riga2.charAt(indice + 1)));

                mappa.put(bambini[i], piante);
            }

            return mappa;
        }

        public static void main(String[] args) {
            String riga1 = "VRCGVVRVCGGCCGVRGCVCGCGV";
            String riga2 = "VRCCCGCRRGVCGCRVVCVGCGCV";

            Map<String, List<String>> risultato = assegnaPiante(riga1, riga2);

            // Esempio: stampa le piante di Alice e Bob
            System.out.println("Piante di Alice: " + risultato.get("Alice"));
            System.out.println("Piante di Bob: " + risultato.get("Bob"));
        }
}
