import static org.junit.Assert.*;
import hu.webler.Poli2;

import org.junit.Test;

public class Poli2Test {
	@Test
	public void testCalculate() {
		Poli2 f1 = new Poli2(2, 2, 2);
		
		assertEquals(f1.calculate(0), 2, 0);
		assertEquals(f1.calculate(1), 6, 0);
	}

	@Test
	public void testArea1() {
		Poli2 f1 = new Poli2(0, 0, 1);
		
		assertEquals(f1.area(0, 1), 1, 0.01);
	}
	
	@Test
	public void testArea2() {
		Poli2 f1 = new Poli2(0, 1, 0);
		
		assertEquals(f1.area(0, 1), 0.5, 0.01);
	}

	@Test
	public void testArea3() {
		Poli2 f1 = new Poli2(1, 0, 0);
		
		assertEquals(f1.area(0, 1), 0.33, 0.01);
	}
}
