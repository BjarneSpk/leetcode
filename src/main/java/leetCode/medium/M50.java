package leetCode.medium;

public class M50 {
    public double myPow(double x, int n) {
        if ( x == 1 ) return 1;
        if ( x == 0 ) return 0;
        if ( n < 0 ) {
            n = -n;
            x = 1 / x;
        }
        double res = 1;
        while( n != 0 ) {
            if( ( n & 1 ) != 0 ) {
                res *= x;
            } 
            x *= x;
            n >>>= 1; 
        }
        return res;
    }
}
