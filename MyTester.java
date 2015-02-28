import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTester {
	
	
	@Test
	public void testNfactorial() {
		//finding the factorial value of 0,1,2,3,10
		//0 = 1; 1 = 1; 2 = 2; 3 = 6; 10 = 3628800;
		//assertEquals(factorial, MyCalculator.nfactorial(n);
		assertEquals(1, MyCalculator.nfactorial(0));
		assertEquals(1, MyCalculator.nfactorial(1));
		assertEquals(2, MyCalculator.nfactorial(2));
		assertEquals(6, MyCalculator.nfactorial(3));
		assertEquals(3628800, MyCalculator.nfactorial(10));
		
	}

	@Test
	public void testBinarySearch() {
		//integer array = {1, 2, 3}
		//integers to be searched: 1, 2, 4
		//1 is in index 0
		//2 is in index 1
		//4 is not in the integer array
		//assertEquals(index, MyCalculator.binarySearch(array integer, x));
		assertEquals(0, MyCalculator.binarySearch(new int[]{1,2,3}, 1));
		assertEquals(1, MyCalculator.binarySearch(new int[]{1,2,3}, 2));
		assertEquals(-1, MyCalculator.binarySearch(new int[]{1,2,3}, 4));
		
	}

}
