package leetCode.easy;

public class E1832 {
    public boolean checkIfPangram(String sentence) {
        int count = 0;
        for ( char c = 'a'; c <= 'z'; c++ ) {
            for ( int i = 0; i < sentence.length(); i++ ) {
                if ( sentence.charAt(i) == c ) {
                    count++;
                    break;
                }
            }
        }
        return count == 26;
    }
}
