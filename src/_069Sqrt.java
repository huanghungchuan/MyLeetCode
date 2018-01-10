
public class _069Sqrt {
	public int mySqrt(int x) {
		if (x <= 1)
			return x;
		int lo = 0;
		int hi = x;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (mid > x / mid)
				hi = mid - 1;
			else if (mid < x / mid) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return lo - 1;
		
		
	}
}
