import java.lang.reflect.Array;
import java.util.Arrays;

public class _014LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		StringBuilder sb = new StringBuilder();

		// go through every letter of strs[0]
		for (int i = 0; i < strs[0].length(); i++) {
			for (int j = 1; j < strs.length; j++) {
				// check if there is i letters in this string.
				if (strs[j].length() <= i) {
					return sb.toString();
				}
				// compare the letter at index i of both string at index 0 and j
				if (strs[0].charAt(i) != strs[j].charAt(i)) {
					return sb.toString();
				}
			}
			sb.append(strs[0].charAt(i));
		}
		return sb.toString();
	}
}
