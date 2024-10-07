package leetCode.easy;

public class E1512 {
	
	public int numIdenticalPairs(int[] nums) {
		int count = 0;
		for ( int i = 0; i < nums.length - 1; i++ ) {
			for ( int j = i + 1; j < nums.length; j++ ) {
				if ( nums[i] == nums[j] ) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main( String[] args ) {
		System.out.println( new E1512().numIdenticalPairs( new int[] { 1,1,1,1 } ) );
	}
}
