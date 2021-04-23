package lesson3.timecomplexity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrogJmpTest {

	@Test
	public void initial() {
		assertEquals(3, new FrogJmp().solution(10, 85, 30));
	}

	@Test
	public void singles() {
		assertEquals(0, new FrogJmp().solution(1, 1, 1));
		assertEquals(1, new FrogJmp().solution(1, 2, 1));
		assertEquals(1, new FrogJmp().solution(1, 5, 6));
	}

	
}
