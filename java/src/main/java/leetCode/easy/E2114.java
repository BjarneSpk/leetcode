package leetCode.easy;

public class E2114 {

    /*
     * This method returns the number of words in the longest sentence.
     */
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for (String i : sentences) {
            int current = 1;
            for (int j = 0; j < i.length(); j++) {
                if ( i.charAt(j) == ' ' ) {
                    current++;
                }
            }
            if ( current > count ) {
                count = current;
            }
        }
        
        return count;
    }

}
