package leetCode.easy;

public class E67 {
    
    /**
     * This method returns the sum of two binary strings.
     * @param a
     * @param b
     * @return
     */
    public String addBinary( String a, String b ) {
        if ( a.length() > b.length() ) {
            return addBinary( b, a );
        }

        int lenA = a.length();
        int lenB = b.length();
        for ( int i = 0; i < lenB - lenA; i++ ) {
            a = 0 + a;
        }

        int temp = 0;
        StringBuilder result = new StringBuilder();

        for ( int i = a.length() - 1; i >= 0; i-- ) {
            int aC = a.charAt( i ) - '0';
            int bC = b.charAt( i ) - '0';
            int sum = aC + bC + temp;

            if ( ( sum & 1 ) == 0 ) {
                result.append( 0 );
            } else {
                result.append( 1 );
            }
            temp = sum > 1 ? 1 : 0;
        }

        if ( temp == 1 ) {
            result.append(1);
        }

        return result.reverse().toString();
    }

    public static void main( String[] args ) {
        System.out.println( new E67().addBinary( "10110101", "10110" ) );
    }
}
