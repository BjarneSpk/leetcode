package leetCode.easy;

public class E9 {

	public  boolean isPalindrome(int x) {
		String y = Integer.toString( x );
		int length = y.length();
		
		for ( int i = 0, mid = length >> 1, j = length - 1; i < mid; i++, j-- ) {
            if ( y.charAt( i ) != y.charAt( j ) ) {
            	return false;
            }
		}
		return true;
	}
    
	
	public static void main(String[] args) {
		System.out.println( new E9().isPalindrome( 121218375 ) );
	}
}
