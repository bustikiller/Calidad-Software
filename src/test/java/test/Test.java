package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.github.davidmoten.spaceinvaders.Coords;

public class Test {

	@org.junit.Test
	public void test() {

		Coords coord1 = new Coords(0, 0);
		Coords coord2 = new Coords(-1, 0);
		Coords coord3 = new Coords(0, -1);
		Coords coord4 = new Coords(-1, -1);
		Coords coord5 = new Coords(800, 600);
		Coords coord6 = new Coords(801, 600);
		Coords coord7 = new Coords(800, 601);
		Coords coord8 = new Coords(801, 601);

		assertTrue(coord1.isValid());
		assertFalse(coord2.isValid());
		assertFalse(coord3.isValid());
		assertFalse(coord4.isValid());
		assertTrue(coord5.isValid());
		assertFalse(coord6.isValid());
		assertFalse(coord7.isValid());
		assertFalse(coord8.isValid());
	}

	@org.junit.Test
	public void test2() {

		Coords coord1 = new Coords(0, 50);
		Coords coord2 = new Coords(50, 0);
		Coords coord3 = new Coords(750, 0);
		Coords coord4 = new Coords(0, 550);

		coord1.sum(coord4);
		coord2.sum(coord3);

		assertEquals(coord1.getX(), 0);
		assertEquals(coord1.getY(), 600);
		assertEquals(coord2.getX(), 800);
		assertEquals(coord2.getY(), 0);
	}
}
