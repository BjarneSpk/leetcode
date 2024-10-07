package leetCode.medium;

public class M1689 {
    public int minPartitions(String n) {
    	int count = 0;
    	
        for ( int i = 0; i < n.length(); i++ ) {
        	
        	if ( Character.getNumericValue( n.charAt( i ) ) > count ) {
        		count = Character.getNumericValue( n.charAt( i ) );
        	}
        }
        return count;
    }

	public static void main(String[] args) {
		
		System.out.println( new M1689().minPartitions("27346209830709182346"));
	}

}
