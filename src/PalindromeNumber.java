
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		} else if (x == 0) {
			return true;
		} else {
			if (x % 10 == 0)
				return false;
			int a = 0;
			while (a <= x) {
				a = a * 10 + x % 10;
				if (a == x)
					return true;
				x /= 10;
				if (a == x)
					return true;
			}
			return false;
		}
	}
}
