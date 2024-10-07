package leetCode.easy;

public class E1672 {
	
    public int maximumWealth(int[][] accounts) {
    	int max = Integer.MIN_VALUE;
		for (int[] account : accounts) {
			int sum = 0;
			for (int j = 0; j < account.length; j++) {
				sum += account[j];
			}
			if (sum > max) {
				max = sum;
			}
		}
        return max;
    }
}
