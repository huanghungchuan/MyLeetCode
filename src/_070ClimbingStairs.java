
public class _070ClimbingStairs {
	public int climbStairs(int n) {
		/* Version 1
		if (n < 3)
			return n;
		int a[] = new int[n + 1];
		a[1] = 1;
		a[2] = 2;
		for (int i = 3; i <= n; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}
		return a[n];
		*/

		// Version 2
		if (n < 3)
			return n;
		int num1 = 1;
		int current = 2;
		for (int i = 3; i <= n; i++) {
			int temp = num1 + current;
			num1 = current;
			current = temp;
		}
		return current;
	}
}
