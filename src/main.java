
public class main {
	
	public static void main(String[] args) {
		/*
		 * TwoSum
		 * 
		 * TwoSum ts = new TwoSum(); int nums[] = { 1, 2, 3, 4 }; int answer[] =
		 * ts.twoSum(nums, 4); System.out.println("" + answer[0] + answer[1]);
		 */

		/*
		 * ReverseInteger
		 * 
		 * ReverseInteger ri = new ReverseInteger();
		 * System.out.println(ri.reverse(123));
		 */

		/*
		 * PalindromeNumber
		 * 
		 * PalindromeNumber pn = new PalindromeNumber();
		 * System.out.println(pn.isPalindrome(0));
		 */

		/*
		 * RomanToInteger
		 * 
		 * RomanToInteger rti = new RomanToInteger();
		 * System.out.println(rti.romanToInt("MMMCMXCIX"));
		 */

		/*
		 * LongestCommonPrefix
		 * 
		 * LongestCommonPrefix lcp = new LongestCommonPrefix(); String[] a = {"abc",
		 * "ab"}; String answer = lcp.longestCommonPrefix(a);
		 * System.out.println(answer);
		 */

		/*
		 * ValidParentheses ValidParentheses vp = new ValidParentheses();
		 * System.out.println(vp.isValid("(())"));
		 */

		/*
		 * RemoveDuplicatesFromSortedArray
		 * 
		 * RemoveDuplicates rd = new RemoveDuplicates(); int[] test1 = {4,5,5,6};
		 * System.out.println(rd.removeDuplicates(test1));
		 */

		/*
		 * ImplementStr
		 * 
		 * ImplementStr is = new ImplementStr(); System.out.println(is.strStr("abc",
		 * "ab")); System.out.println(is.strStr("abc", "bc"));
		 * System.out.println(is.strStr("abc", "cd"));
		 * System.out.println(is.strStr("abc", "")); System.out.println(is.strStr("",
		 * ""));
		 */

		/*
		 * SearchInsertPosition
		 * 
		 * SearchInsertPosition sip = new SearchInsertPosition(); int[] nums =
		 * {1,3,5,6}; int[] nums1 = {}; System.out.println(sip.searchInsert(nums, 0));
		 * System.out.println(sip.searchInsert(nums, 2));
		 * System.out.println(sip.searchInsert(nums, 5));
		 * System.out.println(sip.searchInsert(nums, 7));
		 * System.out.println(sip.searchInsert(nums1, 0));
		 */

		/*
		 * CountAndSay
		 * 
		 * CountAndSay cas = new CountAndSay(); System.out.println(cas.countAndSay(1));
		 * System.out.println(cas.countAndSay(2));
		 * System.out.println(cas.countAndSay(3));
		 * System.out.println(cas.countAndSay(4));
		 */
		
		/*MaximumSubarray
		 * 
		MaximumSubarray ms = new MaximumSubarray();
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(ms.maxSubArray(nums));
		int[] nums1 = { -2 };
		System.out.println(ms.maxSubArray(nums1));
		int[] nums2 = { -2, -1 };
		System.out.println(ms.maxSubArray(nums2));
		*/
		
		_058LengthOfLastWord lolw = new _058LengthOfLastWord();
		System.out.println(lolw.lengthOfLastWord(""));
		System.out.println(lolw.lengthOfLastWord("abc"));
		System.out.println(lolw.lengthOfLastWord("abc de"));
		System.out.println(lolw.lengthOfLastWord("abc de  "));

	}
}
