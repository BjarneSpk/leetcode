package leetCode.easy;


public class E26 {

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int addIndex = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] < nums[i + 1]) {
				nums[addIndex] = nums[i + 1];
				addIndex++;
			}
		}
		return addIndex;
	}
	
	public static void main( String[] args ) {
		System.out.println( new E26().removeDuplicates( new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 } ) );
	}
}
