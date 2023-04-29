package leetCode.easy;

public class E35 {
    public int searchInsert(int[] nums, int target) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] == target )
                return i;
            if ( target > nums[i] )
                res = i + 1;
        }
        return res;
    }

    public int searchInsert_BinarySearch(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        while ( first <= last ) {
            int mid = first + ( last - first ) / 2;
            if ( nums[mid] == target ) {
                return mid;
            } else if ( nums[mid] < target ) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return first;
    }
}
