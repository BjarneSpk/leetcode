package leetCode.medium;

import java.util.HashSet;
import java.util.Set;

public class M3 {
    public int lengthOfLongestSubstring(String s) {
        if ( s.isEmpty() ) return 0;
        Set<Character> set = new HashSet<>();
        int max = 1;
        for ( int i = 0; i < s.length(); i++ ) {
            for ( int j = i; j < s.length(); j++ ) {
                if ( set.add( s.charAt(j) ) ) {
                } else {
                    max = Math.max( max, set.size() );
                    set.clear();
                    break;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println( new M3().lengthOfLongestSubstring( "abcjlnwdcukbrdrbuda"));
    }
}
