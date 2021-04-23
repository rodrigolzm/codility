package challenge.introhive;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task3Test {

	@Test
	public void initial() {
		assertEquals("C", new Task3().solution("CBACD"));
		assertEquals("", new Task3().solution("CABABD"));
		assertEquals("ACBDACBD", new Task3().solution("ACBDACBD"));
	}
	
	@Test
	public void simples() {
		assertEquals("", new Task3().solution(""));
		assertEquals("A", new Task3().solution("A"));
		assertEquals("B", new Task3().solution("B"));
		assertEquals("C", new Task3().solution("C"));
		assertEquals("D", new Task3().solution("D"));
	}

	@Test
	public void doubles() {
		assertEquals("AA", new Task3().solution("AA"));
		assertEquals("BB", new Task3().solution("BB"));
		assertEquals("CC", new Task3().solution("CC"));
		assertEquals("DD", new Task3().solution("DD"));
		assertEquals("AC", new Task3().solution("AC"));
		assertEquals("BD", new Task3().solution("BD"));
		assertEquals("", new Task3().solution("AB"));
		assertEquals("", new Task3().solution("CD"));
	}
	
	@Test
	public void fourLetters() {
		assertEquals("", new Task3().solution("ABAB"));
		assertEquals("", new Task3().solution("CDCD"));
		assertEquals("", new Task3().solution("ABCD"));
		assertEquals("", new Task3().solution("CDAB"));
		assertEquals("", new Task3().solution("CABD"));
		assertEquals("", new Task3().solution("ACDB"));
	}

}
