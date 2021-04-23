package lesson1.iterations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryGapTest {

	@Test
	public void initial() {
		assertEquals(2, new BinaryGap().solution(9));
		assertEquals(4, new BinaryGap().solution(529));
		assertEquals(1, new BinaryGap().solution(20));
		assertEquals(0, new BinaryGap().solution(15));
		assertEquals(0, new BinaryGap().solution(32));
		assertEquals(5, new BinaryGap().solution(1041));
	}
	
}
