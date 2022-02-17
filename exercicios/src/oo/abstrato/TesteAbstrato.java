package oo.abstrato;

public class TesteAbstrato {

	public static void main(String[] args) {
		
		Animal a = new Cachorro();
		Mamifero b = new Cachorro();
		Cachorro c = new Cachorro();
		
		System.out.println(a.respirar());
		System.out.println(b.mover());
		System.out.println(c.mamar());
		
		/*
		 * Ao instanciar um cachorro armazenando num tipo Animal, só tenho acesso ao metodo respirar e mover pq o método mamar nao foi implementado
		 * Ao instanciar um cachorro armazenando num tipo Mamifero, consigo ter acesso aos métodos da classe Animal e ao método mamar da classe Mamífero
		 * Caso eu instancie um cachorro e armazene numa variável do tipo cachorro, terei acesso a todos os métodos das classes superiores (Animal e mamífero)
		 */

	}

}
