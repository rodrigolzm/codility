
import java.awt.Point;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class solution {

	@Test
	public void test() {

		//System.out.println(this.solution("CABABD"));
		// System.out.println(this.solution(new int[] { 1}));

	}

	
	

	public String solution_3(String S) {
		// write your code in Java SE 8

		char[] str = S.toCharArray();

		char[] resultA = transform(str, 'A', 'B');

		char[] result = transform(resultA, 'C', 'D');

		return new String(result);
	}

	public char[] transform(char[] str, char c, char a) {

		char[] result = new char[str.length];

		int index = 0;

		for (int i = 0; i < str.length; i++) {
			if (str[i] == c) {
				if (i > 0 && str[i - 1] == a) {
					index--;
					result[index] = '\u0000';
				} else if (i < str.length && str[i + 1] == a) {
					i++;
				} else {
					result[index] = str[i];
					index++;
				}
			} else {
				result[index] = str[i];
				index++;
			}
		}
		return result;
	}

	public int solution(int K, int[] A) {

		int e = 0;

		for (int i = 0; i < A.length; i++) {

			int x = this.greedy(A, i, K);

			if (e == 0) {
				e = x;
			} else if (x != 0 && x > e) {
				e = x;
				if (e == K) {
					break;
				}
			}
		}

		return e;
	}

	public int greedy(int[] A, int beg, int K) {
		int s = 0;
		int e = 0;
		for (int i = beg; i < A.length; i++) {
			e++;
			s += A[i];
			if (s >= K) {
				break;
			}
		}
		if (e == 1 || s < K) {
			e = 0;
		}
		return e;
	}

	// Nailing Planks
	public int solution12(int[] A, int[] B, int[] C) {

		Set<Point> s = new HashSet<Point>();

		for (int i = 0; i < A.length; i++) {
			s.add(new Point(A[i], B[i]));
		}

		boolean[] p = new boolean[s.size()];

		for (int i = 0; i < C.length; i++) {

			int c = 0;

			for (Point point : s) {
				if (point.x <= C[i] && point.y >= C[i]) {
					p[c] = true;

					boolean a = true;
					for (int j = 0; j < p.length; j++) {
						if (!p[j]) {
							a = false;
						}
					}

					if (a) {
						return i + 1;
					}
				}
				c++;
			}
		}

		return -1;
	}

	public int[] solution3(String S, int[] P, int[] Q) {
		// write your code in Java SE 8

		int[] r = new int[P.length];

		String s = null;

		for (int i = 0; i < P.length; i++) {

			s = S.substring(P[i], Q[i] + 1);

			if (s.contains("A")) {
				r[i] = 1;
			} else if (s.contains("C")) {
				r[i] = 2;
			} else if (s.contains("G")) {
				r[i] = 3;
			} else if (s.contains("T")) {
				r[i] = 4;
			}
		}

		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i] + ", ");
		}

		return r;
	}

	// PassingCars
	public int solution89(int[] A) {

		int c0 = 0;
		int c1 = 0;
		int c = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				c += c0 * c1;
				c0++;
				c1 = 0;
			} else {
				c1++;
			}
		}

		if (c1 != 0) {
			c += c0 * c1;
		}

		if (c > 1_000_000_000 || c < 0) {
			return -1;
		}

		return c;
	}

	public int solution8(int A, int B, int K) {

		int a = (int) Math.floor(A / K);

		int b = (int) Math.floor(B / K);

		int d = b - a;

		if (A % K == 0) {
			d++;
		}

		return d;
	}

	// MaxCounters
	public int[] solution7(int N, int[] A) {

		int[] r = new int[N];

		int max = 0;

		int min = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > N) {
				min = max;
			} else {

				if (r[A[i] - 1] < min) {
					r[A[i] - 1] = min;
				}

				r[A[i] - 1]++;

				if (r[A[i] - 1] > max) {
					max = r[A[i] - 1];
				}
			}
		}

		for (int i = 0; i < r.length; i++) {
			if (r[i] < min) {
				r[i] = min;
			}
		}

		return r;
	}

	public int solution6(int[] A) {

		int[] a = new int[A.length - 1];

		int sum = 0;

		for (int i = 0; i < A.length - 1; i++) {
			sum += A[i];
			a[i] = sum;
		}

		int[] b = new int[A.length - 1];

		sum = 0;

		int j = b.length - 1;

		for (int i = A.length - 1; i > 0; i--) {
			sum += A[i];
			b[j--] = sum;
		}

		Integer min = null;

		for (int i = 0; i < a.length; i++) {
			if (min == null || min > Math.abs(a[i] - b[i])) {
				min = Math.abs(a[i] - b[i]);
			}
		}

		return min;
	}

	public int solution5(int[] A) {

		if (A.length == 0) {
			return 1;
		}

		if (A.length == 1 && A[0] == 1) {
			return 2;
		}

		Arrays.sort(A);

		for (int i = 0; i < A.length; i++) {
			if (A[i] != i + 1) {
				return i + 1;
			}
		}

		return A[A.length - 1] + 1;
	}

	public int solution4(int X, int Y, int D) {
		// write your code in Java SE 8
		if (X == Y) {
			return 0;
		}

		int r = (Y - X) / D;

		if (r * D < (Y - X)) {
			r++;
		}

		return r;
	}

	public int solution3(int[] A) {

		if (A.length == 1) {
			return A[0];
		}

		Arrays.sort(A);

		if (A[0] != A[1]) {
			return A[0];
		}

		if (A[A.length - 2] != A[A.length - 1]) {
			return A[A.length - 1];
		}

		Integer p = null;

		for (int i = 0; i < A.length; i++) {
			if (p == null) {
				p = A[i];
			} else {
				if (p == A[i]) {
					p = null;
				} else {
					return p;
				}
			}
		}

		return A[A.length - 1];
	}

	public int[] solution(int[] A, int K) {

		if (A.length == 0) {
			return A;
		}

		int k = K / A.length;
		if (K >= A.length) {
			k = K / A.length;
		}

		if (k > 0) {
			k = K - (A.length * k);
		}

		if (K >= A.length && k == 0) {
			return A;
		}

		if (k == 0) {
			k = K;
		}

		int[] n = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			int b = 0;
			if (i + k < A.length) {
				b = i + k;
			} else {
				b = (i + k) - A.length;
			}
			n[b] = A[i];
		}
		return n;
	}

	public void solution1(int N) {

		String b = Integer.toBinaryString(N);

		while (b.endsWith("0")) {
			b = b.substring(0, b.length() - 1);
		}

		String[] p = b.split("1");

		int n = 0;

		for (int i = 0; i < p.length; i++) {
			if (p[i].length() > n) {
				n = p[i].length();
			}
		}

		System.out.println("result:" + n);
	}

}
