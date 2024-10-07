package leetCode.medium;

public class M7 {

    public int reverse(int x) {
        long num = x;
        long res = 0;
        boolean cond = false;
        if ( num < 0 ) {
            num = -num;
            cond = true;
        }
        while ( num > 0 ) {
            res = ( res * 10 ) + ( num % 10 );
            num /= 10;
        }
        if ( res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ) {
            return 0;
        }
        return (int) ( cond ? -res : res );
    }

    public static void main(String[] args) {
        System.out.println( new M7().reverse( 1234567890 ) );
    }
}
