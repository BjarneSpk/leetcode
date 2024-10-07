package leetCode.easy;

public class E374 {
    public int guessNumber(int n) {
        int first = 0;
        int last = Integer.MAX_VALUE;
        while ( first <= last ) {
            int mid = first + ( last - first ) / 2;
            if ( guess(mid) == 0 ) {
                return mid;
            } else if ( guess(mid) < 0 ) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }
    public int guess( int n ) {
        // Number that should be guessed:
        int pick = 10;

        if ( n == pick ) {
            return 0;
        } else if ( n < pick ) {
            return 1;
        } else {
            return -1;
        }
    }
}
