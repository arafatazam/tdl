package tdl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestPoint1 {
	
	private Point p;
	
	@Before
	public void setUp() throws Exception{
		p = new Point();
	}

	@Test
	public void testSetX() {
		p.setX(32);
		assertEquals(32,p.x);
	}
	
	@Test
	public void testSetY() {
		p.setY(3);
		assertEquals(3,p.y);
	}
	
	@Test
	public void testGetX() {
		p.setX(44);
		assertEquals(44,p.getX());
	}
	
	@Test
	public void testGetY() {
		p.setY(14);
		assertEquals(14,p.getX());
	}

}