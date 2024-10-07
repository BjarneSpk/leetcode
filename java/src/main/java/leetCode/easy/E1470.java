package leetCode.easy;

import java.util.Arrays;

public class E1470 {
	
	public int[] shuffle(int[] nums, int n) {
		
		int[] ans = new int[n << 1];
		for ( int i = 0; i < n; i++ ) {
			int j = i << 1;
			ans[j++] = nums[i];
			ans[j] = nums[i + n];
		}
		return ans;
	}
	public static void main (String[] args) {
		
		System.out.println( Arrays.toString( new E1470().shuffle( new int[] { 2, 5, 1, 3, 4, 7 } , 3 ) ) );
	}
}
