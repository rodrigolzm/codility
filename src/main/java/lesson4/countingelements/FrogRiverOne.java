package lesson4.countingelements;

/**
 * A small frog wants to get to the other side of a river. The frog is initially
 * located on one bank of the river (position 0) and wants to get to the
 * opposite bank (position X+1). Leaves fall from a tree onto the surface of the
 * river.
 * <p>
 * You are given an array A consisting of N integers representing the falling
 * leaves. A[K] represents the position where one leaf falls at time K, measured
 * in seconds.
 * <p>
 * The goal is to find the earliest time when the frog can jump to the other
 * side of the river. The frog can cross only when leaves appear at every
 * position across the river from 1 to X (that is, we want to find the earliest
 * moment when all the positions from 1 to X are covered by leaves). You may
 * assume that the speed of the current in the river is negligibly small, i.e.
 * the leaves do not change their positions once they fall in the river.
 * <p>
 * For example, you are given integer X = 5 and array A such that:
 * <p>
 * A[0] = 1<br>
 * A[1] = 3<br>
 * A[2] = 1<br>
 * A[3] = 4<br>
 * A[4] = 2<br>
 * A[5] = 3<br>
 * A[6] = 5<br>
 * A[7] = 4<br>
 * In second 6, a leaf falls into position 5. This is the earliest time when
 * leaves appear in every position across the river.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int X, int[] A); }<br>
 * that, given a non-empty array A consisting of N integers and integer X,
 * returns the earliest time when the frog can jump to the other side of the
 * river.
 * <p>
 * If the frog is never able to jump to the other side of the river, the
 * function should return −1.
 * <p>
 * For example, given X = 5 and array A such that:
 * <p>
 * A[0] = 1<br>
 * A[1] = 3<br>
 * A[2] = 1<br>
 * A[3] = 4<br>
 * A[4] = 2<br>
 * A[5] = 3<br>
 * A[6] = 5<br>
 * A[7] = 4<br>
 * the function should return 6, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <ul>
 * <li>N and X are integers within the range [1..100,000];
 * <li>each element of array A is an integer within the range [1..X].
 * </ul>
 * 
 * @author rodrigolzm
 */
public class FrogRiverOne {

	public int solution(int X, int[] A) {

		int[] path = new int[X];
		
		for (int i = 0; i < path.length; i++) {
			path[i] = -1;
		}
		
		for (int i = 0; i < A.length; i++) {
			if (path[A[i] - 1] == -1) {
				path[A[i] - 1] = i;
			}
		}

		int max = 0;
		
		for (int i = 0; i < path.length; i++) {
			if (path[i] == -1) {
				return -1;
			}
			if (max < path[i]) {
				max = path[i];
			}
		}
		
		return max;
	}

}
