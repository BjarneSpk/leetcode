package leetCode.easy;

public class E2011 {
	
	/*
	 * This method returns the final value after the operations.
	 */
    public int finalValueAfterOperations(String[] operations) {
    	
    	int res = 0;
    	String dec = "--X", decr = "X--";

		for (String operation : operations) {

			if (operation.contentEquals(decr) || operation.contentEquals(dec)) {
				res--;
			} else {
				res++;
			}
		}
        return res;
    }
}
