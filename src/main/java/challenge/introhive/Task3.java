package challenge.introhive;

/**
 * A string S consisting of the letters A,B,C and D is given. The string can be
 * transformed either by removing a letter A together with an adjacent letter B,
 * or by removing a letter C together an with adjacent letter D.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public String solution(String S); }
 * <p>
 * that, given a string S consisting of N characters, returns any string that:
 * <ul>
 * <li>can be obtained from S by repeatedly applying the describe
 * transformation, and
 * <li>cannot be further transformed.
 * </ul>
 * If at some there is more than one possible way to transform the string, any
 * of the valid transformations may be chosen.
 * <p>
 * Examples:
 * <ol>
 * <li>Given S = "CBACD", the function may return "C", because one of the
 * possible sequences of operations is as follows:
 * <p>
 * "CBACD" >> "CBA" >> "C"
 * <li>Given S = "CABABD" the function may return an empty string, because one
 * possible sequence of operations is:
 * <p>
 * "CABABD" >> "CABD" >> "CD" >> ""
 * <li>Given string S = "ACBDACBD" the function should return "ACBDACBD",
 * because no operation can be applied to string S.
 * </ol>
 * Write an efficient algorithm for the following assumptions:
 * <ul>
 * <li>the length of S is within the range [0..50,000];
 * <li>string S consists only of the following characters: "A", "B", "C" and/or
 * "D".
 * </ul>
 * 
 * @author rodrigolzm
 */
public class Task3 {

	public String solution(String S) {

		char[] s = S.toCharArray();

		char[] r;

		if (S.indexOf("AB") > -1 || S.indexOf("BA") > -1) {

			r = this.transform(s, 'A', 'B');

			r = this.transform(r, 'C', 'D');

		} else {

			r = this.transform(s, 'C', 'D');

			r = this.transform(r, 'A', 'B');
			
		}

		return new String(r).trim();
	}

	public char[] transform(char[] s, char a, char b) {

		char[] r = new char[s.length];

		int j = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i] == a) {
				if (i - 1 >= 0 && r[i - 1] == b) {
					j--;
					r[j] = ' ';
					continue;
				} else if (i + 1 <= s.length - 1 && s[i + 1] == b) {
					i++;
					continue;
				}
			}
			r[j] = s[i];
			j++;
		}

		return r;
	}

}
