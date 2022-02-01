package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		//Classes wrapper associadas aos tipos primitivos
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l * 2);
		
		Float f = 123.3F;
		System.out.println(f.toString());
		
		Double d = 123.456;
		System.out.println(d.toString());
		
		Boolean boo = Boolean.parseBoolean("true");
		System.out.println(boo);
		System.out.println(boo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c.toString());

	}

}
