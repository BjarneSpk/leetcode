package leetCode.medium;

public class M852 {
    public int peakIndexInMountainArray(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        while ( first <= last ) {
            int mid = first + ( last - first ) / 2;
            if ( arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1] ) {
                first = mid;
                break;
            } else if ( arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1] ){
                first = mid;
            } else {
                last = mid;
            }
        }
        return first;
    }
}
