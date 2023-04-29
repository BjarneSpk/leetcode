package leetCode.easy;

import java.util.Arrays;

public class E1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort( arr2 );
        int counter = 0;
        for ( int i = 0; i < arr1.length; i++ ) {
            int temp = arr1[i];
            for ( int j = 0; j < arr2.length; j++ ) {
                if ( Math.abs( temp - arr2[j] ) <= d ) {
                    counter++;
                    break;
                }
            }
        }
        return arr1.length - counter;
    }
}
