package myPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBetterSum {
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
	public final void test() {
		 new BetterSum().efficientSum(b,  8);
	}
	
	@Test
	public final void test1() {
		int [] result = new BetterSum().efficientSum(a, 9);
		int [] expected = {0,1};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public final void test2() {
		int [] result = new BetterSum().efficientSum(c,  14);
		int [] expected = {4,5};
		assertArrayEquals(expected, result);
	}

}
