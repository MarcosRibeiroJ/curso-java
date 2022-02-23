package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	static final public UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	static final public UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		
	static final public String grito(String n) {
		return n + "!!! ";
	}

}
