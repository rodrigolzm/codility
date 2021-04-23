package lesson3.timecomplexity;

import java.util.Arrays;

/**
 * An array A consisting of N different integers is given. The array contains
 * integers in the range [1..(N + 1)], which means that exactly one element is
 * missing.
 * <p>
 * Your goal is to find that missing element.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A, returns the value of the missing element.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 2<br>
 * A[1] = 3<br>
 * A[2] = 1<br>
 * A[3] = 5
 * <p>
 * the function should return 4, as it is the missing element.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <ul>
 * <li>N is an integer within the range [0..100,000];
 * <li>the elements of A are all distinct;
 * <li>each element of array A is an integer within the range [1..(N + 1)].
 * </ul>
 * 
 * @author rodrigolzm
 */
public class PermMissingElem {

	public int solution(int[] A) {
		if (A.length == 0) {
			return 1;
		}
		
		Arrays.sort(A);
		
		if (A[0] != 1) {
			return 1;
		}
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] != i + 1) {
				return i + 1;
			}
		}
		
		return A[A.length - 1] + 1;
	}
	
}
