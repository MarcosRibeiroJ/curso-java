package classe.exercicios;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Marcos", 76);
		System.out.println(p1.apresentar());
		
		Comida c1 = new Comida("Arroz", 0.500);
		Comida c2 = new Comida("Feijão", 0.200);
		Comida c3 = new Comida("Frango Frito", 0.800);
		
		p1.comer(c1);
		p1.comer(c2);
		p1.comer(c3);
		
		System.out.println(p1.apresentar());

	}
}
