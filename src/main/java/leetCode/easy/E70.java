package leetCode.easy;

public class E70 {
    public int climbStairs(int n) {
        int first = 1;
        int second = 1;
        int temp;
        for (int i = 1; i < n; i++) {
            temp = second;
            second = first + second;
            first = temp;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println( new E70().climbStairs( 6 ) );
    }
}
