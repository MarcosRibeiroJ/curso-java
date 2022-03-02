package br.com.cod3r.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void testarIgualDois() {
		int a = 1 + 1;
		
		assertEquals(2, a);
	}

	@Test
	void testarIgualTres() {
		int a = 2 + 1;
		
		assertEquals(3, a);
	}
}
