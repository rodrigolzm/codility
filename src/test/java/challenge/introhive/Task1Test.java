package challenge.introhive;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task1Test {

	@Test
	public void initial() {
		assertEquals("SSSML", new Task1().solution("MSSLS"));
		assertEquals("SMLL", new Task1().solution("LLMS"));
		assertEquals("SSM", new Task1().solution("SMS"));
	}
	
}
