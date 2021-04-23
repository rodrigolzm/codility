package lesson4.countingelements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * This is a demo task.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A of N integers, returns the smallest positive integer
 * (greater than 0) that does not occur in A.
 * <p>
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * <p>
 * Given A = [1, 2, 3], the function should return 4.
 * <p>
 * Given A = [−1, −3], the function should return 1.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <ul>
 * <li>N is an integer within the range [1..100,000];
 * <li>each element of array A is an integer within the range
 * [−1,000,000..1,000,000].
 * </ul>
 * 
 * @author rodrigolzm
 */
public class MissingInteger {

	public int solution(int[] A) {

		Arrays.sort(A);
		
		Set<Integer> a = new HashSet<>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				a.add(A[i]);
			}
		}

		int number = 1;

		for (; number <= a.size(); number++) {
			if (!a.contains(number)) {
				return number;
			}
		}

		return number;
	}

}
