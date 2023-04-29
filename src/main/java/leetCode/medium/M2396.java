package leetCode.medium;

public class M2396 {

    public boolean isStrictlyPalindromic(int n) {
        for ( int i = 2; i < n - 1; i++ ) {
            String str = Integer.toString(n, i);
            if (!isPalindrome(str) ) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String y) {
		int length = y.length();
		
		for ( int i = 0, mid = length >> 1, j = length - 1; i < mid; i++, j-- ) {
            if ( y.charAt( i ) != y.charAt( j ) ) {
            	return false;
            }
		}
		return true;
	}
}
