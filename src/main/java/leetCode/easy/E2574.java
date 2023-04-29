package leetCode.easy;

import java.util.Arrays;

public class E2574 {
	
	/*
	 * This method returns the difference between the sum of the left and right side of the array.
	 */
	public int[] leftRigthDifference( int[] nums ) {
		int[] ans = new int[ nums.length ];
		int[] leftSum = leftSum( nums) ;
		int[] rightSum = rightSum( nums );
		
		for ( int i = 0; i < nums.length; i++ ) {
			ans[i] = Math.abs( leftSum[ i ] - rightSum[ i ] );
		}
		return ans;
	}
	
	static int[] leftSum( int[] nums ) {
		int length = nums.length;
		int[] ans = new int[ length ];
		ans[ 0 ] = 0;
		
		for ( int i = 1; i < length; i++ ) {
			int num = 0;
			
			for ( int j = 0; j < i; j++ ) {
				num += nums[ j ];
			}
			ans[ i ] = num;
		}
		return ans;
	}
	
	static int[] rightSum( int[] nums ) {
		int length = nums.length;
		int[] ans = new int[ length ];
		ans[ length - 1 ] = 0;

		for ( int i = 0; i < length - 1 ; i++ ) {
			int num = 0;
			
			for ( int j = i + 1; j < length; j++ ) {
				num += nums[ j ];
			}
			ans[ i ] = num;
		}
		return ans;
	}

	public static void main(String[] args) {
		
		System.out.println( Arrays.toString( new E2574().leftRigthDifference( new int[] { 10, 4, 8, 3, 7, 9 } ) ) );
	}
}
