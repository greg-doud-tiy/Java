package ssa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestAnimal {

	Animal animal;
	
	@Before
	public void setUp() throws Exception {
		animal = new Animal();
	}

	@Test
	public void testDefaultNbrLegs() {
		assertEquals(4, animal.getNbrLegs());
	}
	@Test
	public void testForAnyNbrOfLegs() {
		animal.setNbrLegs(2);
		assertEquals(2, animal.getNbrLegs());
		animal.setNbrLegs(3);
		assertEquals(6, animal.getNbrLegs());
	}
//	@Test
//	public void testWillAlwaysFail() {
//		fail("The test failed");
//	}

}
