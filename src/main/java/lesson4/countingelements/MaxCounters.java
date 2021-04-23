package lesson4.countingelements;

/**
 * You are given N counters, initially set to 0, and you have two possible
 * operations on them:
 * <ul>
 * <li>increase(X) − counter X is increased by 1,
 * <li>max counter − all counters are set to the maximum value of any counter.
 * </ul>
 * A non-empty array A of M integers is given. This array represents consecutive
 * operations:
 * <ul>
 * <li>if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
 * <li>if A[K] = N + 1 then operation K is max counter.
 * </ul>
 * For example, given integer N = 5 and array A such that:
 * <p>
 * A[0] = 3<br>
 * A[1] = 4<br>
 * A[2] = 4<br>
 * A[3] = 6<br>
 * A[4] = 1<br>
 * A[5] = 4<br>
 * A[6] = 4<br>
 * the values of the counters after each consecutive operation will be:
 * <p>
 * (0, 0, 1, 0, 0)<br>
 * (0, 0, 1, 1, 0)<br>
 * (0, 0, 1, 2, 0)<br>
 * (2, 2, 2, 2, 2)<br>
 * (3, 2, 2, 2, 2)<br>
 * (3, 2, 2, 3, 2)<br>
 * (3, 2, 2, 4, 2)<br>
 * The goal is to calculate the value of every counter after all operations.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int[] solution(int N, int[] A); }<br>
 * that, given an integer N and a non-empty array A consisting of M integers,
 * returns a sequence of integers representing the values of the counters.
 * <p>
 * Result array should be returned as an array of integers.
 * <p>
 * For example, given:
 * <p>
 * A[0] = 3<br>
 * A[1] = 4<br>
 * A[2] = 4<br>
 * A[3] = 6<br>
 * A[4] = 1<br>
 * A[5] = 4<br>
 * A[6] = 4<br>
 * the function should return [3, 2, 2, 4, 2], as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <ul>
 * <li>N and M are integers within the range [1..100,000];
 * <li>each element of array A is an integer within the range [1..N + 1].
 * </ul>
 * 
 * @author rodrigolzm
 */
public class MaxCounters {

	public int[] solution(int N, int[] A) {
		
		int[] counters = new int[N];
		
		int min = 0;
		
		int max = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= N) {
				
				if (counters[A[i] - 1] < min) {
					counters[A[i] - 1] = min;
				}
				
				counters[A[i] - 1]++;
				
				if (counters[A[i] - 1] > max) {
					max = counters[A[i] - 1];
				}
			} else {
				min = max;
			}
		}
		
		for (int i = 0; i < counters.length; i++) {
			if (counters[i] < min) {
				counters[i] = min;
			}
		}
		
		return counters;
	}
	
}
