package leetCode.easy;

import java.util.Arrays;

public class E1929 {
	
    /*
     * This method returns the concatenation of the array.
     */
    public int[] getConcatenation( int[] nums ) {
    	
    	int n = nums.length;
        int[] ans = new int[ n << 1 ];
        
        for ( int i = 0; i < n; i++ ) {
        	
        	ans[ i ] = nums[ i ];
        	ans[ i+n ] = nums[ i ];
        }
        return ans;
    }
    
    public static void main(String... args) {
    	int[] nums = {1,2,1,4};
    	System.out.println( Arrays.toString( new E1929().getConcatenation( nums ) ) );
    }
}
