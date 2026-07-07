import java.util.*;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store sums of nums1 and nums2
        for (int a : nums1) {
            for (int b : nums2) {
                int sum = a + b;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int count = 0;

        // Find complements using nums3 and nums4
        for (int c : nums3) {
            for (int d : nums4) {
                int target = -(c + d);

                if (map.containsKey(target)) {
                    count += map.get(target);
                }
            }
        }

        return count;
    }
}