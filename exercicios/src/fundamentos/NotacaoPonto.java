package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom Dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);
		
		System.out.println("Marcos".toUpperCase());
		
		String y = "Bom Dia X"
				.replace("X", "Senhora")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);

	}

}
