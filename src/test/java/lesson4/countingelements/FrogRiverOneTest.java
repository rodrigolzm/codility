package lesson4.countingelements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrogRiverOneTest {

	@Test
	public void initial() {
		assertEquals(6, new FrogRiverOne().solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4}));
	}

}
