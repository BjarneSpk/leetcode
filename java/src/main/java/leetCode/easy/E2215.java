package leetCode.easy;

import java.util.LinkedList;
import java.util.List;

public class E2215 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        List<List<Integer>> list = List.of(list1, list2);
        for (int i = 0; i < nums1.length; i++) {
            boolean b = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    b = true;
                    break;
                }
            }
            if (!b && !list1.contains(nums1[i])) {
                list1.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            boolean b = false;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    b = true;
                    break;
                }
            }
            if (!b && !list2.contains(nums2[i])) {
                list2.add(nums2[i]);
            }
        }
        return list;
    }
}
