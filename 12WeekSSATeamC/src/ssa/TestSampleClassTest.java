package ssa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestSampleClassTest {

	SampleClass sc = null;
	
	@Before
	public void setUp() throws Exception {
		sc = new SampleClass();
	}
	@After
	public void tearDown() throws Exception {
		sc = null;
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testIEqualsOne() {
		assertEquals(sc.i, 1);
	}

}
