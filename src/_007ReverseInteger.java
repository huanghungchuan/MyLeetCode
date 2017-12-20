
public class _007ReverseInteger {
	public int reverse(int x) {
		try {
			String s = new Integer(x).toString();
			String reverse = "";
			if (x < 0) {
				reverse = "-";
				for (int i = s.length() - 1; i > 0; i--) {
					reverse += s.charAt(i);
				}
			} else {
				for (int i = s.length() - 1; i >= 0; i--) {
					reverse += s.charAt(i);
				}
			}
			int result = Integer.parseInt(reverse);
			return result;
		} catch (Exception e) {
			return 0;
		}
	}
}
