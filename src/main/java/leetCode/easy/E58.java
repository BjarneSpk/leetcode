package leetCode.easy;

public class E58 {
    public int lengthOfLastWord(String s) {
        char[] chars = s.strip().toCharArray();
        int last = chars.length - 1;
        for ( int i = last; i > 0; i-- ) {
            if ( chars[i] == ' ' ) {
                return last - i;
            }
        }
        return last + 1;
    }
}
