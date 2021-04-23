package lesson3.timecomplexity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PermMissingElemTest {

	@Test
	public void initial() {
		assertEquals(4, new PermMissingElem().solution(new int[] { 2, 3, 1, 5 }));
	}

	@Test
	public void singles() {
		assertEquals(1, new PermMissingElem().solution(new int[] {}));
		assertEquals(2, new PermMissingElem().solution(new int[] { 1 }));
		assertEquals(1, new PermMissingElem().solution(new int[] { 2 }));
	}

	@Test
	public void longs() {
		assertEquals(7, new PermMissingElem().solution(new int[] { 4, 2, 3, 5, 1, 6, 8, 9}));
	}
}
