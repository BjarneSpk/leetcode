package leetCode.easy;

import java.util.Arrays;

public class E1920 {
	
    public int[] buildArray( int[] nums ) {
    	
        int[] ans = new int[ nums.length ];
        
        for ( int i = 0; i < nums.length; i++ ) {
        	
        	int index = nums[i];
        	ans[i] = nums[index];
        }
        return ans;
    }
    
    public static void main ( String... args ) {
    	int[] nums = { 0, 2, 1, 5, 3, 4 };
    	System.out.println( Arrays.toString( new E1920().buildArray( nums ) ) );
    }
}
