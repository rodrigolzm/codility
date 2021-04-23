package lesson2.arrays;

import java.util.Arrays;

/**
 * A non-empty array A consisting of N integers is given. The array contains an
 * odd number of elements, and each element of the array can be paired with
 * another element that has the same value, except for one element that is left
 * unpaired.
 * <p>
 * For example, in array A such that:
 * <p>
 * A[0] = 9 A[1] = 3 A[2] = 9<br>
 * A[3] = 3 A[4] = 9 A[5] = 7<br>
 * A[6] = 9
 * <ul>
 * <li>the elements at indexes 0 and 2 have value 9,
 * <li>the elements at indexes 1 and 3 have value 3,
 * <li>the elements at indexes 4 and 6 have value 9,
 * <li>the element at index 5 has value 7 and is unpaired.
 * </ul>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A consisting of N integers fulfilling the above
 * conditions, returns the value of the unpaired element.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 9 A[1] = 3 A[2] = 9<br>
 * A[3] = 3 A[4] = 9 A[5] = 7<br>
 * A[6] = 9
 * <p>
 * the function should return 7, as explained in the example above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <ul>
 * <li>N is an odd integer within the range [1..1,000,000];
 * <li>each element of array A is an integer within the range
 * [1..1,000,000,000];
 * <li>all but one of the values in A occur an even number of times.
 * </ul>
 * 
 * @author rodrigolzm
 */
public class OddOccurrencesInArray {

	public int solution(int[] A) {

		Arrays.sort(A);

		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] == A[i + 1]) {
				i++;
			} else {
				return A[i];
			}
		}

		return A[A.length - 1];
	}

}
