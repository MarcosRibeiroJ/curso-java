package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		//(ºF - 32) X 5/9 = ºC
		final int AJUSTE = 32;
		final double FATOR = 5/9.0;
		
		double f = 100;
		double c = (f - AJUSTE) * FATOR;
		
		System.out.println(c);
	}

}
