package lesson4.countingelements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MissingIntegerTest {

	@Test
	public void initial() {
		assertEquals(5, new MissingInteger().solution(new int[] { 1, 3, 6, 4, 1, 2 }));
		assertEquals(4, new MissingInteger().solution(new int[] { 1, 2, 3 }));
		assertEquals(1, new MissingInteger().solution(new int[] { -1, -3 }));
	}

	@Test
	public void largeNumbers() {
		int[] numbers = new int[1000000];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		assertEquals(1000001, new MissingInteger().solution(numbers));
	}

}
