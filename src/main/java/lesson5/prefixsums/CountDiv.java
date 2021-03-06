package lesson5.prefixsums;

/**
 * Write a function:
 * <p>
 * class Solution { public int solution(int A, int B, int K); }<br>
 * that, given three integers A, B and K, returns the number of integers within
 * the range [A..B] that are divisible by K, i.e.:
 * <p>
 * { i : A ≤ i ≤ B, i mod K = 0 }<br>
 * For example, for A = 6, B = 11 and K = 2, your function should return 3,
 * because there are three numbers divisible by 2 within the range [6..11],
 * namely 6, 8 and 10.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <ul>
 * <li>A and B are integers within the range [0..2,000,000,000];
 * <li>K is an integer within the range [1..2,000,000,000];
 * <li>A ≤ B.
 * </ul>
 * 
 * @author rodrigolzm
 */
public class CountDiv {

	public int solution(int A, int B, int K) {

		int a = A / K;

		int b = B / K;

		int diff = b - a;

		if (A % K == 0) {
			return diff + 1;
		}

		return diff;
	}

}
