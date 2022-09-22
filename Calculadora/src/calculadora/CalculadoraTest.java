package calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	Calculadora calc;
	
	@Test
	public void testSuma() {
		calc=new Calculadora();
		assertEquals("7+6",13.0,calc.suma(7, 6),.001);
	}
	
	@Test
	public void testResta() {
		calc=new Calculadora();
		assertEquals("7-6",1,calc.resta(7, 6),0);
	}
	
	@Test
	public void testMultiplica() {
		calc=new Calculadora();
		assertEquals("7*6",42,calc.multiplica(7, 6),0);
	}
	
	@Test
	public void testDivide() {
		calc=new Calculadora();
		assertEquals("7/6",1.16d,calc.divide(7, 6),.1);
	}
	
	@Test
	public void testDivideCero() {
		calc=new Calculadora();
		assertTrue(calc.divide(7, 0)==Double.POSITIVE_INFINITY);
	}
}
