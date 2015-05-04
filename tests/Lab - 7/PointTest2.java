package tdl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestPoint2 {
	
	private Point p;
	
	@Before
	public void setUp() throws Exception{
		p = new Point(11,12);
	}
	
	@Test
	public void testXSetCorrectly() {
		assertEquals(11,p.getX());
	}
	@Test
	public void testYSetCorrectly() {
		assertEquals(12,p.getY());
	}
}