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
		 * Ao instanciar um cachorro armazenando num tipo Animal, s� tenho acesso ao metodo respirar e mover pq o m�todo mamar nao foi implementado
		 * Ao instanciar um cachorro armazenando num tipo Mamifero, consigo ter acesso aos m�todos da classe Animal e ao m�todo mamar da classe Mam�fero
		 * Caso eu instancie um cachorro e armazene numa vari�vel do tipo cachorro, terei acesso a todos os m�todos das classes superiores (Animal e mam�fero)
		 */

	}

}
