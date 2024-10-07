package leetCode.easy;

import java.util.Arrays;

public class E88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n != 0) {
            int place = m + n - 1;
            m--;
            n--;
            while (m >= 0 || n >= 0) {
                int i = Integer.MIN_VALUE, j = Integer.MIN_VALUE;
                if ( m >= 0 ) {
                    i = nums1[m];
                }
                if ( n >= 0 ) {
                    j = nums2[n];
                }
                if ( i >= j ) {
                    nums1[place--] = nums1[m--];
                } else if ( i < j ) {
                    nums1[place--] = nums2[n--];
                } else {
                    break;
                }
            }
        }
        System.out.println( Arrays.toString( nums1 ) );
    }

    public static void main(String[] args) {
        new E88().merge( new int[] { -1, 0, 0, 3, 3, 3, 0, 0, 0 }, 6, new int[] { 1, 2, 2 }, 3);
    }
}
