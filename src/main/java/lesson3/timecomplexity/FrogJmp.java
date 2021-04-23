package lesson3.timecomplexity;

/**
 * A small frog wants to get to the other side of the road. The frog is
 * currently located at position X and wants to get to a position greater than
 * or equal to Y. The small frog always jumps a fixed distance, D.
 * <p>
 * Count the minimal number of jumps that the small frog must perform to reach
 * its target.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int X, int Y, int D); }
 * <p>
 * that, given three integers X, Y and D, returns the minimal number of jumps
 * from position X to a position equal to or greater than Y.
 * <p>
 * For example, given:
 * <p>
 * X = 10<br>
 * Y = 85<br>
 * D = 30
 * <p>
 * the function should return 3, because the frog will be positioned as follows:
 * <ul>
 * <li>after the first jump, at position 10 + 30 = 40
 * <li>after the second jump, at position 10 + 30 + 30 = 70
 * <li>after the third jump, at position 10 + 30 + 30 + 30 = 100
 * </ul>
 * Write an efficient algorithm for the following assumptions:
 * <ul>
 * <li>X, Y and D are integers within the range [1..1,000,000,000];
 * <li>X ≤ Y.
 * </ul>
 * 
 * @author rodrigolzm
 */
public class FrogJmp {

	public int solution(int X, int Y, int D) {

		int distance = Y - X;
		
		int counter = distance / D;
		
		if (distance % D != 0) {
			counter += 1;
		}
		
		return counter;
	}

}
