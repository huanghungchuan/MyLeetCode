
public class CountAndSay {
	public String countAndSay(int n) {
		if(n == 1)
			return "1";
		else {
			String s = countAndSay(n-1);
			int count = 1;
			StringBuilder sb = new StringBuilder();
			char current = s.charAt(0);
			for(int i = 1; i<s.length();i++) {
				if(current != s.charAt(i)) {
					sb.append(count).append(current);
					count = 1;
					current = s.charAt(i);
				}
				else {
					count++;
				}
			}
			sb.append(count).append(current);
			return sb.toString();
		}
	}
}
