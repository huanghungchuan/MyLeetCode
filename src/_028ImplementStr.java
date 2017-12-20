
public class _028ImplementStr {
	public int strStr(String haystack, String needle) {
		/*Version 1
		 * 
		if (haystack.length() < needle.length())
			return -1;
		if (needle.length() == 0)
			return 0;
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			if (haystack.substring(i, i + needle.length()).equals(needle))
				return i;
		}
		return -1;*/
		
		//Version 2, the runtime is same as Version 1
		return haystack.indexOf(needle);
	}
}
