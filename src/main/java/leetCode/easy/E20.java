package leetCode.easy;

public class E20 {
	
	public boolean isValid(String s) {
		
		StringBuilder sb = new StringBuilder(s);
		String one = "()", two = "[]", three = "{}";
		
		while (true) {
			if ( sb.indexOf(one) >= 0) {
				sb.delete(sb.indexOf(one), sb.indexOf(one) + 2);
			} else if ( sb.indexOf(two) >= 0) {
				sb.delete(sb.indexOf(two), sb.indexOf(two) + 2);
			} else if ( sb.indexOf(three) >= 0) {
				sb.delete(sb.indexOf(three), sb.indexOf(three) + 2);
			} else {
				break;
			}
		}
		return sb.length() == 0;
	}

	public static void main(String[] args) {
		System.out.println( new E20().isValid("{(()[])}"));
	}
}
