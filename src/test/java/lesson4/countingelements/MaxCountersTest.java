package lesson4.countingelements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxCountersTest {

	@Test
	public void initial() {
		assertEquals("3, 2, 2, 4, 2", convert(new MaxCounters().solution(5, new int[] {3, 4, 4, 6, 1, 4, 4})));
	}
	
	private String convert(int[] A) {
		String s = "";
		for (int i = 0; i < A.length; i++) {
			s += A[i] + ", ";
		}
		return s.substring(0, s.length() - 2);
	}
}
