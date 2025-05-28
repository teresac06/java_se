package day_03;

public class TipiNumerici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte numeroBite = 122; //01111010 quanto occupa di memoria in binario
		short numeroShort = numeroBite; // in binario 0000000 01111010
		int numeroInt = numeroShort;
		long numeroLong = numeroInt;
		float numeroFloat = numeroLong;
		double numeroDouble =numeroFloat;
		System.out.println("numeroDouble: " + numeroDouble);
	}

}
