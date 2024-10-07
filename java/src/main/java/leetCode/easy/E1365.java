package leetCode.easy;

public class E1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for ( int i = 0; i < nums.length; i++ ) {
            int current = nums[i];
            int count = 0;
            for ( int j = 0; j < nums.length; j++ ) {
                if ( nums[j] < current && i != j ) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
