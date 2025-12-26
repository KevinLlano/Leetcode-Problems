


class Solution {
    // Groups anagrams from the input array of strings
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to store sorted string as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();
        // Iterate through each string in the input array
        for (String s : strs) {
            // Convert string to character array for sorting
            char[] chars = s.toCharArray();
            // Sort the characters to form the key
            Arrays.sort(chars);
            // Create a string from the sorted characters
            String key = new String(chars);
            // Add the original string to the correct anagram group in the map
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        // Return all groups of anagrams as a list
        return new ArrayList<>(map.values());
    }
}
