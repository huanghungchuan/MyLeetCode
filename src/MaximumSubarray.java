
public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		/*
		 * Version 1 Go through every number one by one, then in set of two numbers,
		 * then three, and so on no accepted because too slow. if(nums.length == 1)
		 * return nums[0]; int max = nums[0];
		 * 
		 * //the sum of i numbers for(int i = 1; i <= nums.length; i++) { //go through
		 * nums array for(int j = 0; j<=nums.length-i; j++) { int currentSum = 0; //get
		 * the sum from nums[j] to nums[j+k] for(int k = 0; k<i; k++) { currentSum +=
		 * nums[j+k]; } if(currentSum > max) { max = currentSum; } } } return max;
		 */
		
		//Version 2, using Kadane's Algorithm
		int max_so_far, max_ending_here, current;
		max_so_far = max_ending_here = nums[0];
		for (int i = 1; i < nums.length; i++) {
			current = nums[i] + max_ending_here;
			max_ending_here = current >= nums[i] ? current : nums[i];
			if (max_ending_here > max_so_far)
				max_so_far = max_ending_here;
		}
		return max_so_far;

	}
}
