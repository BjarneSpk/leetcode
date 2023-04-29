package leetCode.easy;

public class E1603 {
	
	private int big;
	private int medium;
	private int small;
	
    public E1603(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        switch (carType) {
		case 1:
			if (big > 0) {
				big--;
				return true;
			}
			break;
		case 2:
			if (medium > 0) {
				medium--;
				return true;
			}
			break;
		case 3:
			if (small > 0) {
				small--;
				return true;
			}
			break;
		default:
			break;
		}
        return false;
    }

	public static void main(String[] args) {
		E1603 test = new E1603( 1, 1, 0 );
		System.out.println( test.addCar(1) );
		System.out.println( test.addCar(1) );
		System.out.println( test.addCar(3) );
	}

}
