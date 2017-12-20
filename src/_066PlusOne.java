
public class _066PlusOne {
	public int[] plusOne(int[] digits) {
		/*Version 1: turn the int array into int, plus one, turn it back to array.
		 * it is too easy to reach the integer max limit.
		int num = 0;
		for (int i = 0; i < digits.length; i++)
			num = num * 10 + digits[i];
		String plusOne = Integer.toString(++num);

		int[] answer = new int[plusOne.length()];
		for (int i = 0; i < plusOne.length(); i++) {
			answer[i] = plusOne.charAt(i) - '0';
		}
        return answer;
		*/
		
		/*Version 2: go through the array from the last value
		 * if the digit is not 9, plus one to that digit and return the result
		 * else, set that index to 0, move on to next index.
		 * at the end, if no answer returns, that means the original array contains all 9 values, which is now turned into all 0s.
		*/
		int length = digits.length;
		for(int i = length-1; i>=0; i--) {
			if(digits[i] != 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] answer = new int[length+1];
		answer[0] = 1;
		return answer;
	}
}
