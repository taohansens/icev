package Lista03.q03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestaQuadrado {

	@Test
	void Teste1() {
		Quadrado q1 = new Quadrado(5);
		Quadrado q2 = new Quadrado(7);
		
		assertEquals(25, q1.area());
		assertEquals(20, q1.perimetro());
		assertEquals(49, q2.area());
		assertEquals(28, q2.perimetro());

	}
}
