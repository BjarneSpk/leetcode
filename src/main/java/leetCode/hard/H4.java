package leetCode.hard;

public class H4 {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res;
        int len1 = nums1.length, len2 = nums2.length;
        int concLen = len1 + len2;
        int[] conc = new int[ concLen ];

        // Possibility 1 (slower) ->
        // if ( len1 > len2 ) {
        //     return findMedianSortedArrays( nums2, nums1 );
        // }
        // for ( int i = 0; i < len2; i++ ) {
        //     conc[i] = nums2[i];
        //     if ( i < len1 ) {
        //         conc[ i + len2 ] = nums1[i];
        //     }
        // } 
        // Arrays.sort( conc );
        // <- 1 ends here.

        // This section is interchangeable with Possibility 1. ->
        int i = 0, j = 0, index = 0;
        while ( i < len1 && j < len2 ) {
            if ( nums1[i] < nums2[j] ) {
                conc[index++] = nums1[i++];
            } else {
                conc[index++] = nums2[j++];
            }
        }
        while ( i < len1 ) {
            conc[index++] = nums1[i++];
        }
        while ( j < len2 ) {
            conc[index++] = nums2[j++];
        }
        // <- Section ends here.

        if ( ( concLen & 1 ) != 0 ) {
            concLen /= 2;
            res = conc[ concLen ];
            return res;
        } 
        concLen /= 2;
        res = conc[ concLen-- ] + conc[ concLen ];
        return res / 2;
    }

    public static void main(String[] args) {
        
    }
}
