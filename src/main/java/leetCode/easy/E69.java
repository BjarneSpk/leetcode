package leetCode.easy;

public class E69 {
    /*
     * This method returns the square root of x.
     */
    public int mySqrt(int x) {
        if ( x == 0 ) return 0;
        for ( long i = 0; i < x; i++ ) {
            if ( (i + 1) * (i + 1) > x ) {
                return (int) i;
            }
        }
        return 1;
    }
}
