
public class _013RomanToInteger {
	public int romanToInt(String s) {
		int ans = 0;
		LOOP: for (int i = 0; i < s.length(); i++) {
			if (i < s.length() - 1) {
				switch (s.substring(i, i + 2)) {
				case "IV":
					i++;
					ans += 4;
					continue LOOP;
				case "IX":
					i++;
					ans += 9;
					continue LOOP;
				case "XL":
					i++;
					ans += 40;
					continue LOOP;
				case "XC":
					i++;
					ans += 90;
					continue LOOP;
				case "CD":
					i++;
					ans += 400;
					continue LOOP;
				case "CM":
					i++;
					ans += 900;
					continue LOOP;
				}
			}
			switch(s.charAt(i)) {
			case'I':
				ans += 1;
				break;
			case'V':
				ans += 5;
				break;
			case'X':
				ans += 10;
				break;
			case'L':
				ans += 50;
				break;
			case'C':
				ans += 100;
				break;
			case'D':
				ans += 500;
				break;
			case'M':
				ans += 1000;
				break;
			}
		}
		return ans;
	}
}
