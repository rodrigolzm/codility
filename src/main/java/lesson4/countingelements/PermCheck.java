package lesson4.countingelements;

import java.util.Arrays;

/**
 * A non-empty array A consisting of N integers is given.
 * <p>
 * A permutation is a sequence containing each element from 1 to N once, and
 * only once.
 * <p>
 * For example, array A such that:
 * <p>
 * A[0] = 4<br>
 * A[1] = 1<br>
 * A[2] = 3<br>
 * A[3] = 2<br>
 * is a permutation, but array A such that:
 * <p>
 * A[0] = 4<br>
 * A[1] = 1<br>
 * A[2] = 3<br>
 * is not a permutation, because value 2 is missing.
 * <p>
 * The goal is to check whether array A is a permutation.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A, returns 1 if array A is a permutation and 0 if it is
 * not.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 4<br>
 * A[1] = 1<br>
 * A[2] = 3<br>
 * A[3] = 2<br>
 * the function should return 1.
 * <p>
 * Given array A such that:
 * <p>
 * A[0] = 4<br>
 * A[1] = 1<br>
 * A[2] = 3<br>
 * the function should return 0.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <ul>
 * <li>N is an integer within the range [1..100,000];
 * <li>each element of array A is an integer within the range
 * [1..1,000,000,000].
 * </ul>
 * 
 * @author rodrigolzm
 */
public class PermCheck {

	public int solution(int[] A) {
		
		Arrays.sort(A);
		
		for (int i = 0; i < A.length; i++) {
			if (i + 1 != A[i]) {
				return 0;
			}
		}
		
		return 1;
	}
	
}
