package lesson3.timecomplexity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TapeEquilibriumTest {

	@Test
	public void initial() {
		assertEquals(1, new TapeEquilibrium().solution(new int[] { 3, 1, 2, 4, 3 }));
	}
	
}
