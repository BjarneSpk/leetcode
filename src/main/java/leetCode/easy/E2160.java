package leetCode.easy;

import java.util.Arrays;

public class E2160 {
    /*
     * This method returns the sum of the minimum and maximum numbers.
     */
    public int minimumSum(int num) {
        String nums = Integer.toString(num);
        int[] chars = new int[4];
        for ( int i = 0; i < nums.length(); i++ ) {
            chars[i] = nums.charAt(i) - '0';
        }
        Arrays.sort(chars);
        int sum1 = chars[0] * 10 + chars[2];
        int sum2 = chars[1] * 10 + chars[3];
        return sum1 + sum2;
    }
}
