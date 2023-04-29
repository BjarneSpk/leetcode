package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

public class E1389 {
    public int[] createTargetArray( int[] nums, int[] index ) {
        int[] target = new int[ nums.length ];
        List<Integer> temp = new ArrayList<>( nums.length );
        for ( int i = 0; i < nums.length; i++ ) {
            temp.add( index[i], nums[i] );
        }
        for ( int i = 0; i < target.length; i++)  {
            target[i] = temp.get(i);
        }
        return target;
    }
}
