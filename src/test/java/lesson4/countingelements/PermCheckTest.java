package lesson4.countingelements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PermCheckTest {

	@Test
	public void initial() {
		assertEquals(1, new PermCheck().solution(new int[] { 4, 1, 3, 2 }));
		assertEquals(0, new PermCheck().solution(new int[] { 4, 1, 3 }));
	}

}
