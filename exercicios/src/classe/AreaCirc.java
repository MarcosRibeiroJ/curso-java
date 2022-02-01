package classe;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.1415;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * raio * raio;
	}
	
	static double area(double raio) {
		return PI * raio * raio;
	}
}
