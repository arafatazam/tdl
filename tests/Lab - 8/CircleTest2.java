package tdl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CircleTest2{
	
	private Circle c;

	@Before
	public void setUp() throws Exception{
		c = new Circle();
		c.setX(0);
		c.setY(0);
		c.setRadius(10);
	}
	
	@Test
	public void testSetX() {
		c.setX(12);
		assertEquals(12, c.getX());
	}
	
	@Test
	public void testSetY() {
		c.setY(-2);
		assertEquals(-2,c.getY());
	}
	@Test
	public void testIsInsideCircle() {
		boolean result = c.isInsideCircle(0,5);
		assertFalse(result);
		result = c.isInsideCircle(4,4);
		assertTrue(result);
		result = c.isInsideCircle(-4,-3);
		assertTrue(result);
		result = c.isInsideCircle(-14,-14);
		assertFalse(result);
	}
}
