



public class Solution {
    // Checks if the array contains any duplicates
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store unique elements
        Set<Integer> set = new HashSet<>();
        // Iterate through each number in the array
        for (int num : nums) {
            // If the number is already in the set, a duplicate is found
            if (set.contains(num)) {
                return true;
            }
            // Add the number to the set
            set.add(num);
        }
        // If no duplicates were found, return false
        return false;
    }
}