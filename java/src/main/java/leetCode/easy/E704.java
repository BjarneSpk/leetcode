package leetCode.easy;

public class E704 {
    public int search(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        while ( first <= last ) {
            int mid = ( first + last ) / 2 ;
            if ( nums[mid] == target ) {
                return mid;
            } else if ( nums[mid] < target ) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println( new E704().search(new int[] {-1,0,3,5,9,12}, 2));
    }
}
