# Data Structures Fundamentals

## 1. Arrays / Lists
**What:** Ordered collection of elements, fixed size (arrays) or dynamic (ArrayList).

**When to use:**
- When you need fast access by index
- When the number of elements is known or changes infrequently

**Java Example:**
```java
// Array
int[] arr = {1, 2, 3, 4};
System.out.println(arr[2]); // 3

// ArrayList
import java.util.ArrayList;
ArrayList<Integer> list = new ArrayList<>();
list.add(5);
list.add(10);
System.out.println(list.get(1)); // 10
```

---

## 2. HashMap / Dictionary
**What:** Key-value pairs for fast lookup, insertion, and deletion.

**When to use:**
- When you need to associate values with unique keys
- When you need fast search, insert, or delete by key

**Java Example:**
```java
import java.util.HashMap;
HashMap<String, Integer> map = new HashMap<>();
map.put("apple", 3);
map.put("banana", 5);
System.out.println(map.get("apple")); // 3
```

---

## 3. Set
**What:** Collection of unique elements, no duplicates allowed.

**When to use:**
- When you need to check for existence or uniqueness
- When you want to remove duplicates

**Java Example:**
```java
import java.util.HashSet;
HashSet<Integer> set = new HashSet<>();
set.add(1);
set.add(2);
set.add(1); // Duplicate, will not be added
System.out.println(set.contains(2)); // true
```

---

## 4. Stack
**What:** Last-In-First-Out (LIFO) structure. Add/remove from the top.

**When to use:**
- Undo operations
- Parsing expressions (parentheses matching)
- Depth-first search

**Java Example:**
```java
import java.util.Stack;
Stack<Integer> stack = new Stack<>();
stack.push(10);
stack.push(20);
System.out.println(stack.pop()); // 20
```

---

## 5. Queue
**What:** First-In-First-Out (FIFO) structure. Add at end, remove from front.

**When to use:**
- Scheduling tasks
- Breadth-first search
- Order processing

**Java Example:**
```java
import java.util.LinkedList;
Queue<Integer> queue = new LinkedList<>();
queue.add(1);
queue.add(2);
System.out.println(queue.poll()); // 1
```

---

## 6. Linked List
**What:** Sequence of nodes, each pointing to the next. Efficient insert/delete at ends or middle.

**When to use:**
- When you need frequent insertions/deletions
- When array resizing is costly

**Java Example:**
```java
import java.util.LinkedList;
LinkedList<Integer> ll = new LinkedList<>();
ll.addFirst(1);
ll.addLast(2);
ll.add(1, 99); // Insert at index 1
System.out.println(ll); // [1, 99, 2]
```

---

## 7. Tree (Binary Tree)
**What:** Hierarchical structure with nodes, each having up to two children.

**When to use:**
- Hierarchical data (file systems, org charts)
- Fast searching/sorting (binary search tree)

**Java Example:**
```java
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}
// Usage: TreeNode root = new TreeNode(5);
```

---

## 8. Graph
**What:** Set of nodes (vertices) connected by edges. Can be directed/undirected.

**When to use:**
- Networks (social, computer)
- Pathfinding (maps, games)

**Java Example (Adjacency List):**
```java
import java.util.*;
Map<Integer, List<Integer>> graph = new HashMap<>();
graph.put(0, Arrays.asList(1, 2));
graph.put(1, Arrays.asList(0, 3));
```

---

## Interview Tips
- Know when to use each structure and their time/space complexities.
- Be ready to explain your choice.
- Practice basic operations: insert, delete, search, traverse.
- Write clear, simple code and explain your logic.
