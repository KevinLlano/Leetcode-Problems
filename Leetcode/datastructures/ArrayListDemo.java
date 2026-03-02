// # Python implementation of array operations
// arr = [3, 1, 4, 1, 5, 9, 2, 6]

// # Adding elements
// arr.append(7)          # O(1) amortized - add to end
// arr.insert(0, 0)       # O(n) - add at index
// arr.extend([8, 9])     # O(k) - add multiple

// # Removing elements
// arr.pop()              # O(1) - remove from end
// arr.pop(0)             # O(n) - remove at index
// arr.remove(1)          # O(n) - remove first occurrence

// # Searching
// idx = arr.index(5)     # O(n) - find index
// count = arr.count(1)   # O(n) - count occurrences
// exists = 5 in arr      # O(n) - check existence

// # Sorting
// arr.sort()             # O(n log n) - in-place sort
// arr.sort(reverse=True) # O(n log n) - reverse sort
// sorted_arr = sorted(arr)  # O(n log n) - returns new list

// # Other useful methods
// arr.reverse()          # O(n) - in-place reverse
// arr_copy = arr.copy()  # O(n) - shallow copy
// arr.clear()            # O(n) - remove all elements




// Java implementation of ArrayList operations
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6));

        // Adding elements
        arr.add(7);                // O(1) amortized - add to end
        arr.add(0, 0);             // O(n) - add at index
        arr.addAll(Arrays.asList(8, 9)); // O(k) - add multiple

        // Removing elements
        arr.remove(arr.size() - 1); // O(1) - remove from end
        arr.remove(0);              // O(n) - remove at index
        arr.remove(Integer.valueOf(1)); // O(n) - remove first occurrence

        // Searching
        int idx = arr.indexOf(5);   // O(n) - find index
        long count = arr.stream().filter(x -> x == 1).count(); // O(n) - count occurrences
        boolean exists = arr.contains(5); // O(n) - check existence

        // Sorting
        Collections.sort(arr);      // O(n log n) - in-place sort
        arr.sort(Collections.reverseOrder()); // O(n log n) - reverse sort
        List<Integer> sortedArr = new ArrayList<>(arr);
        Collections.sort(sortedArr); // O(n log n) - returns new list

        // Other useful methods
        Collections.reverse(arr);   // O(n) - in-place reverse
        List<Integer> arrCopy = new ArrayList<>(arr); // O(n) - shallow copy
        arr.clear();                // O(n) - remove all elements
    }
}