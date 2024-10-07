package leetCode.easy;

public class E367 {
    public boolean isPerfectSquare(int num) {
        if ( num == 1 ) return true;
        int first = 0;
        int last = num / 2;
        while ( first <= last ) {
            int mid = first + ( last - first ) / 2;
            double pow = Math.pow( mid, 2 );
            if ( pow == num ) {
                return true;
            } else if ( pow < num ) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println( new E367().isPerfectSquare( 26 ) );
    }
}
