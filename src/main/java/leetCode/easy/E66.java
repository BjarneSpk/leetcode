package leetCode.easy;

import java.util.Arrays;

public class E66 {

    public int[] plusOne(int[] digits) {
        for ( int i = digits.length - 1; i >= 0; i-- ) {
            if ( digits[i] == 9 ) {
                digits[i] = 0;
                if ( i == 0 ) {
                    digits = new int[ digits.length + 1 ];
                    digits[0] = 1;
                    return digits;
                }
            } else {
                digits[i]++;
                return digits;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println( Arrays.toString( new E66().plusOne( new int[] { 9, 9 } ) ) );
    }
}
