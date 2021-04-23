package lesson2.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CyclicRotationTest {

	@Test
	public void initial() {
		assertEquals("9, 7, 6, 3, 8", convert(new CyclicRotation().solution(new int[] { 3, 8, 9, 7, 6 }, 3)));
		assertEquals("0, 0, 0", convert(new CyclicRotation().solution(new int[] { 0, 0, 0 }, 1)));
		assertEquals("1, 2, 3, 4", convert(new CyclicRotation().solution(new int[] { 1, 2, 3, 4 }, 4)));
	}
	
	@Test
	public void small() {
		assertEquals("3, 5, 1, 1, 2", convert(new CyclicRotation().solution(new int[] { 1, 1, 2, 3, 5 }, 42)));
	}

	private String convert(int[] A) {
		String s = "";
		for (int i = 0; i < A.length; i++) {
			s += A[i] + ", ";
		}
		return s.substring(0, s.length() - 2);
	}
	
}
