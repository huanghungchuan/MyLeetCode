
public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		/*Version 1, 6ms
		for (int i = 0; i < nums.length; i++) {
			if (target <= nums[i])
				return i;
		}
		return nums.length;
		*/
		
		//Version 2, using binary search, same runtime as Version 1
		int lo = 0;
		int hi = nums.length-1;
		while(lo <= hi) {
			int mid = lo + (hi - lo)/2;
			if(target < nums[mid])
				hi = mid-1;
			else if(target > nums[mid])
				lo = mid+1;
			else 
				return mid;
		}
		return lo;
	}
}
