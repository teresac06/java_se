package day_03;

public class InizialiNome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Iniziali hardcoded: T e R
		   String[] t = {
		            "   TTTTT  ",
		            "     T    ",
		            "     T    ",
		            "     T    ",
		            "     T    ",
		        };

		        String[] c = {
		            "  CCC     ",
		            " C   C    ",
		            " C        ",
		            " C   C    ",
		            "  CCC     ",
		        };

		        System.out.println("Iniziali di Teresa Cariello:\n");

		        for (int i = 0; i < t.length; i++) {
		            System.out.println(t[i] + "   " + c[i]);
		        }
	}

}
