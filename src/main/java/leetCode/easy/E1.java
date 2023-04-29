package leetCode.easy;

import java.util.Arrays;

public class E1 {

	/**
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		
		for ( int i = 0; i < nums.length; i++ ) {
			
			for ( int j = i + 1; j < nums.length; j++ ) {
				
				if ( target == nums[i] + nums[j] ) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException();
	}

	public static void main(String[] args) {
		System.out.println( Arrays.toString( new E1().twoSum( new int[] { -3, 4, 3, 90 }, 0 ) ) );
	}
}
