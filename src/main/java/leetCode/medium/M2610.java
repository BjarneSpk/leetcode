package leetCode.medium;

import java.util.LinkedList;
import java.util.List;

public class M2610 {
    public List<List<Integer>> findMatrix(int[] nums) {

        List<List<Integer>> result = new LinkedList<>();
        result.add( new LinkedList<>() );
        outerLoop:
        for (int i = 0; i < nums.length; i++) {
            for ( List<Integer> l : result ) {
                if ( !l.contains( nums[i] ) ) {
                    l.add( nums[i] );
                    continue outerLoop;
                }
            }
            List<Integer> temp = new LinkedList<>();
            temp.add( nums[i] );
            result.add( temp );
        }
        return result;
    }
}
