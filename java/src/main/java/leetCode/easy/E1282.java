package leetCode.easy;

public class E1282 {
    public int subtractProductAndSum(int n) {
        String str = String.valueOf(n);
        char[] chars = new char[str.length()];
        str.getChars(0, str.length(), chars, 0);
        int sum = 0;
        int product = 1;
        for ( char c : chars ) {
            product *= (c - '0');
            sum += (c - '0');
        }
        return product - sum;
    }
    public static void main(String[] args) {
        System.out.println( new E1282().subtractProductAndSum(383));
    }
}