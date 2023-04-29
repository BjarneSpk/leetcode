package leetCode.easy;

import java.util.LinkedList;
import java.util.List;

public class E1431 {

	/**
	 * Receives an array with the amount of candy the i'th child owns. 
	 * Return whether each child would have the maximum amount of candy, if handed extraCandies candies.
	 * @param candies
	 * @param extraCandies
	 * @return
	 */
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = 0;
		for ( int i : candies ) {
			if ( i > max ) {
				max = i;
			}
		}
		List<Boolean> result = new LinkedList<Boolean>();
		for ( int i : candies ) {
			if ( i + extraCandies >= max ) {
				result.add(true);
			} else {
				result.add(false);
			}
		}
		return result;
	}
}
