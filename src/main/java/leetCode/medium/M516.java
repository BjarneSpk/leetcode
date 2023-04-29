package leetCode.medium;

public class M516 {
    public int longestPalindromeSubseq(String s) {
        if ( s.isBlank() ) return 0;
        int max = 0;
        for ( int i = 0; i < s.length(); i++ ) {
            for ( int j = i + 1; j < s.length(); j++ ) {
                String str = s.substring( i, j + 1 );
                if ( isPalindrome( str ) ) {
                    max = Math.max( max, j - i + 1 );
                }
            }
        }
        return max;
    }
    private static boolean isPalindrome( String str ) {
        int length = str.length();
        for ( int i = 0, mid = length >> 1, j = length - 1; i < mid; i++, j-- ) {
            if ( str.charAt( i ) != str.charAt( j ) ) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println( new M516().longestPalindromeSubseq( "ioanfibeicnncwenceifbg" ));
    }
}
