public class Solution {
    // Finds the maximum sum of a contiguous subarray
    public int maxSubArray(int[] nums) {
        // Initialize currentSum and maxSum with the first element of the array
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update currentSum to be either the current element or currentSum + current element
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update maxSum if currentSum is greater than maxSum
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return the maximum sum found
        return maxSum;
    }
}




