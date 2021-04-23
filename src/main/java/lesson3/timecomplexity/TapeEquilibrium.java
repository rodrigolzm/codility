package lesson3.timecomplexity;

/**
 * A non-empty array A consisting of N integers is given. Array A represents
 * numbers on a tape.
 * <p>
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty
 * parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 * <p>
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... +
 * A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 * <p>
 * In other words, it is the absolute difference between the sum of the first
 * part and the sum of the second part.
 * <p>
 * For example, consider array A such that:
 * <p>
 * A[0] = 3<br>
 * A[1] = 1<br>
 * A[2] = 2<br>
 * A[3] = 4<br>
 * A[4] = 3
 * <p>
 * We can split this tape in four places:
 * <p>
 * P = 1, difference = |3 − 10| = 7 <br>
 * P = 2, difference = |4 − 9| = 5 <br>
 * P = 3, difference = |6 − 7| = 1 <br>
 * P = 4, difference = |10 − 3| = 7
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given a non-empty array A of N integers, returns the minimal difference
 * that can be achieved.
 * <p>
 * For example, given:
 * <p>
 * A[0] = 3<br>
 * A[1] = 1<br>
 * A[2] = 2<br>
 * A[3] = 4<br>
 * A[4] = 3<br>
 * the function should return 1, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <ul>
 * <li>N is an integer within the range [2..100,000];
 * <li>each element of array A is an integer within the range [−1,000..1,000].
 * </ul>
 * 
 * @author rodrigolzm
 */
public class TapeEquilibrium {

	public int solution(int[] A) {
		
		int sum1 = 0;
		
		int sum2 = 0;
		
		int[] side1 = new int[A.length - 1];

		int[] side2 = new int[A.length - 1];
		
		for (int i = 0; i < A.length - 1; i++) {
			sum1 += A[i];
			side1[i] = sum1;

			sum2 += A[(A.length - 1) - i];
			side2[(A.length - 2) - i] = sum2;
		}
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < A.length - 1; i++) {
			if (Math.abs(side1[i] - side2[i]) < min) {
				 min = Math.abs(side1[i] - side2[i]);
			}
		}

		return min;
	}
	
}
