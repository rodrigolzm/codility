package lesson2.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OddOccurrencesInArrayTest {

	@Test
	public void initial() {
		assertEquals(7, new OddOccurrencesInArray().solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));
	}
	
	
}
