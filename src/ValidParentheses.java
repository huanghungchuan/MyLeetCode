
public class ValidParentheses {
	public boolean isValid(String s) {
		char[] charArray = new char[s.length()];
		int count = 0;
		for (char c : s.toCharArray()) {
			switch (c) {
			case '(':
				charArray[count] = ')';
				count++;
				break;
			case '[':
				charArray[count] = ']';
				count++;
				break;
			case '{':
				charArray[count] = '}';
				count++;
				break;
			default:
				if (count == 0 || charArray[--count] != c)
					return false;
			}
		}
		return count == 0;
	}
}
