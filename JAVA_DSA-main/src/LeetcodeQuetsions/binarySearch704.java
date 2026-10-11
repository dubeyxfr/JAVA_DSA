package LeetcodeQuetsions;

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // Calculate middle index to avoid potential integer overflow
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                start = mid + 1; // Search the right half
            } else {
                end = mid - 1; // Search the left half
            }
        }
        return -1; // Target not found
    }
}