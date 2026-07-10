class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        int left = 0;

        // Find first occurrence
        while (left < nums.length && nums[left] != target) {
            left++;
        }

        if (left == nums.length) {
            return ans; // target not found
        }

        int right = left;

        // Find last occurrence
        while (right < nums.length && nums[right] == target) {
            right++;
        }

        for (int i = left; i < right; i++) {
            ans.add(i);
        }

        return ans;
    }
}