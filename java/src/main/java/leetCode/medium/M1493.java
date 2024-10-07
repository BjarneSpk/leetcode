package leetCode.medium;

public class M1493 {

    public int longestSubarray(int[] nums) {
        int max = 0, first = -1, last = 0;
        boolean containsZero = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (containsZero) {
                    int j = first + 1;
                    do {
                        j++;
                    } while (nums[j] == 1);
                    first = j;
                } else {
                    containsZero = true;
                }
            }
            max = Math.max(max, i - first);
        }
        return max - 1;
    }

    public static void main(String[] args) {
        System.out.println(new M1493().longestSubarray(new int[] {1,1,0,1}));
    }
}
