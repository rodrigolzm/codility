package challenge.introhive;

import java.util.Arrays;

/**
 * An online shop sells T-shirts of three sizes: S (small), M (medium) and L
 * (large).
 * <p>
 * Write a function solution that, given a string T of length N containing
 * letters S, M and L, returns a sorted string T by T-shirt sizes from the
 * smallest to the largest.
 * <p>
 * Examples:
 * <ol>
 * <li>Given T = "MSSLS", the function should return "SSSML".
 * <li>Given T = "LLMS", the function should return "SMLL".
 * <li>Given T = "SMS", the function should return "SSM".
 * </ol>
 * Write an efficient algorithm for the following assumptions:
 * <ul>
 * <li>N is an integer within the range (1..200,000);
 * <li>string T consists only of the following characters: "s", "M" and/or "L".
 * </ul>
 * 
 * @author rodrigolzm
 */
public class Task1 {

	public String solution(String T) {

		char[] str = T.toCharArray();

		Arrays.sort(str);

		char[] result = new char[str.length];

		for (int i = 0; i < str.length; i++) {
			result[str.length - (i + 1)] = str[i];
		}

		return new String(result);
	}

}
