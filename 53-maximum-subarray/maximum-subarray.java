class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];      // Holds the max sum found so far
        int currentSum = nums[0];  // Holds the current running sum

        for (int i = 1; i < nums.length; i++) {
            // If currentSum is negative, start new subarray from current number
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum); // Update maxSum if needed
        }

        return maxSum;
    }
}
