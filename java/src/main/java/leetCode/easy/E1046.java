package leetCode.easy;

import java.util.Arrays;

public class E1046 {

    public int lastStoneWeight(int[] stones) {
        Arrays.sort( stones );
        int i = stones.length - 1;
        int j = stones.length - 1;
        while ( i >= 1 ) {
            int last = stones[j];
            int secondLast = stones[j - 1];
            if ( last == secondLast ) {
                stones[j] = 0;
                stones[j - 1] = 0;
                i -= 2;
            } else {
                stones[j - 1] = last - secondLast;
                stones[j] = 0;
                i--;
            }
            Arrays.sort( stones );
        }
        return stones[stones.length - 1];
    }
}
