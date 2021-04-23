package challenge.introhive;

/**
 * Write a function solution that, given an integer N, returns the maximum
 * possible value obtained by inserting one '5' digit inside the decimal
 * representation of integer N.
 * <p>
 * Examples:
 * <ul>
 * <li>Given N = 268, the function should return 5268.
 * <li>Given N = 670, the function should return 6750.
 * <li>Given N = 0, the function should return 50.
 * <li>Given N = -999, the function should return -5999.
 * </ul>
 * Assume that:
 * <ul>
 * <li>N is an integer within the range [-8,000.8,000]​
 * </ul>
 * In your solution, focus on correctness. The performance of your solution will
 * not be the focus of the assessment.
 * 
 * @author rodrigolzm
 */
public class Task2 {

	public int solution(int N) {

		String str = String.valueOf(Math.abs(N));

		StringBuilder sb = new StringBuilder(str);

		Integer max = null;

		for (int i = 0; i < str.length() + 1; i++) {
			sb.insert(i, '5');

			int r = Integer.valueOf(sb.toString());

			if (Math.abs(N) != N) {
				r = r * (-1);
			}

			if (max == null || max < r) {
				max = r;
			}

			sb.deleteCharAt(i);
		}

		return max;
	}

}
