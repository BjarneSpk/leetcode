package leetCode.easy;

import java.util.Arrays;

public class E14 {

	public String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
		StringBuilder ans = new StringBuilder();
		String first = strs[0];
		
		outerLoop:
		for ( int i = 0; i < first.length(); i++ ) {
			char firstChar = first.charAt(i);
			for ( String s : strs) {
				if ( s.charAt(i) != firstChar) {
					break outerLoop; 
				}
			}
			ans.append(firstChar);
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		System.out.println(new E14().longestCommonPrefix(new String[] {"ab", "ab", "abc"}));
	}
}
