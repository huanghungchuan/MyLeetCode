
public class _067AddBinary {
	public String addBinary(String a, String b) {
		int num1count = a.length() - 1;
		int num2count = b.length() - 1;
		int remainder = 0;

		StringBuilder sb = new StringBuilder();
		while (num1count >= 0 || num2count >= 0 || remainder != 0) {
			int currentSum = remainder;

			/*
			 * Version 1 if (num1count >= 0 && num2count >= 0) { currentSum +=
			 * (Character.getNumericValue(a.charAt(num1count)) +
			 * Character.getNumericValue(b.charAt(num2count))); sb.insert(0,
			 * String.valueOf((currentSum % 2))); } else if (num1count < 0 && num2count < 0)
			 * { sb.insert(0, "1"); remainder = 0; } else if (num1count < 0) { currentSum +=
			 * (Character.getNumericValue(b.charAt(num2count))); sb.insert(0,
			 * String.valueOf((currentSum % 2))); } else { currentSum +=
			 * (Character.getNumericValue(a.charAt(num1count))); sb.insert(0,
			 * String.valueOf((currentSum % 2))); }
			 * 
			 * if (currentSum > 1) remainder = 1; else remainder = 0; num1count--;
			 * num2count--;
			 * 
			 * }
			 */

			// Version 2
			if (num1count >= 0)
				currentSum += a.charAt(num1count) - '0';
			if (num2count >= 0)
				currentSum += b.charAt(num2count) - '0';
			sb.insert(0, (currentSum % 2));
			remainder = currentSum / 2;
			num1count--;
			num2count--;
		}
		return sb.toString();

	}
}
