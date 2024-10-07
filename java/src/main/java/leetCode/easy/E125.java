package leetCode.easy;

/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
public class E125 {
    public static boolean isPalindrome( String s ) {
        if ( s.isBlank() ) return true;

        String str = s.chars()
            .filter( Character::isLetterOrDigit )
            .map( Character::toLowerCase )
            .collect( StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append )
            .toString();

		int length = str.length();

		for ( int i = 0, mid = length >> 1, j = length - 1; i < mid; i++, j-- ) {
            if ( str.charAt( i ) != str.charAt( j ) ) {
            	return false;
            }
		}
		return true;
    }
}
// @lc code=end


