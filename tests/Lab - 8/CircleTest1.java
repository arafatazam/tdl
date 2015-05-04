package tdl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CircleTest1{
	
	private Circle c;

	@Before
	public void setUp() throws Exception{
		c = new Circle();
		c.setRadius(5);
	}
	
	@Test(expected = IllegalAccessException.class)
	public void testPrivateVariableRadius() {
		c.radius = 4;
	}
	
	@Test
	public void testGetArea() {
		int area = c.getArea();
		assertEquals(78.5398163397, area, 0.00001);
	}
	
	@Test
	public void testGetCircumference() {
		int circumference = c.geCircumference();
		assertEquals(31.4159265359, circumference, 0.00001);
	}

}
