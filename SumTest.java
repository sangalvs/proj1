package myPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SumTest {
	int [] a;
	int [] b;
	int [] c;
	@Before
	public void setUp() throws Exception {
		a = new int[]{2,7,11,15};
		b = new int[] {0};
		c = new int[] {2,3,4,5,6,8};
	} 

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public final void testSum() {
		 new Sum().sum(b,  8);
	}
	
	@Test
	public final void testSum1() {
		int [] result = new Sum().sum(a, 9);
		int [] expected = {0,1};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public final void testSum2() {
		int [] result = new Sum().sum(c,  14);
		int [] expected = {4,5};
		assertArrayEquals(expected, result);
	}
	

}
