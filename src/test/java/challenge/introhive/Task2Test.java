package challenge.introhive;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task2Test {

	@Test
	public void initial() {
		assertEquals(5268, new Task2().solution(268));
		assertEquals(6750, new Task2().solution(670));
		assertEquals(50, new Task2().solution(0));
		assertEquals(-5999, new Task2().solution(-999));
	}
	
	@Test
	public void boundaries() {
		assertEquals(-58000, new Task2().solution(-8000));
		assertEquals(85000, new Task2().solution(8000));
	}

	@Test
	public void singles() {
		assertEquals(51, new Task2().solution(1));
		assertEquals(-15, new Task2().solution(-1));
	}

	@Test
	public void threeDigitNumber() {
		assertEquals(5111, new Task2().solution(111));
		assertEquals(5333, new Task2().solution(333));
		assertEquals(5555, new Task2().solution(555));
		assertEquals(7775, new Task2().solution(777));
		assertEquals(9995, new Task2().solution(999));
	}
	
}
