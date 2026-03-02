# Data Structures Fundamentals

## 1. Lists (Arrays)
**What:** Ordered collection of elements, dynamic size.

**When to use:**
- When you need fast access by index
- When the number of elements can change

**Python Example:**
```python
# List
arr = [1, 2, 3, 4]
print(arr[2])  # 3

# Adding elements
arr.append(5)
arr.insert(1, 10)

# Removing elements
arr.pop()      # removes last
arr.remove(1)  # removes first occurrence of 1
```

---

## 2. Dictionary (HashMap)
**What:** Key-value pairs for fast lookup, insertion, and deletion.

**When to use:**
- When you need to associate values with unique keys
- When you need fast search, insert, or delete by key

**Python Example:**
```python
d = {'apple': 3, 'banana': 5}
print(d['apple'])  # 3
d['orange'] = 7
```

---

## 3. Set
**What:** Collection of unique elements, no duplicates allowed.

**When to use:**
- When you need to check for existence or uniqueness
- When you want to remove duplicates

**Python Example:**
```python
s = set()
s.add(1)
s.add(2)
s.add(1)  # Duplicate, will not be added
print(2 in s)  # True
```

---

## 4. Stack
**What:** Last-In-First-Out (LIFO) structure. Add/remove from the top.

**When to use:**
- Undo operations
- Parsing expressions (parentheses matching)
- Depth-first search

**Python Example:**
```python
stack = []
stack.append(10)
stack.append(20)
print(stack.pop())  # 20
```

---

## 5. Queue
**What:** First-In-First-Out (FIFO) structure. Add at end, remove from front.

**When to use:**
- Scheduling tasks
- Breadth-first search
- Order processing

**Python Example:**
```python
from collections import deque
queue = deque()
queue.append(1)
queue.append(2)
print(queue.popleft())  # 1
```

---

## 6. Linked List
**What:** Sequence of nodes, each pointing to the next. Efficient insert/delete at ends or middle.

**When to use:**
- When you need frequent insertions/deletions
- When array resizing is costly

**Python Example:**
```python
class Node:
    def __init__(self, val):
        self.val = val
        self.next = None

# Usage
head = Node(1)
head.next = Node(2)
```

---

## 7. Tree (Binary Tree)
**What:** Hierarchical structure with nodes, each having up to two children.

**When to use:**
- Hierarchical data (file systems, org charts)
- Fast searching/sorting (binary search tree)

**Python Example:**
```python
class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None
# Usage: root = TreeNode(5)
```

---

## 8. Graph
**What:** Set of nodes (vertices) connected by edges. Can be directed/undirected.

**When to use:**
- Networks (social, computer)
- Pathfinding (maps, games)

**Python Example (Adjacency List):**
```python
graph = {
    0: [1, 2],
    1: [0, 3]
}
```

---

## Interview Tips
- Know when to use each structure and their time/space complexities.
- Be ready to explain your choice.
- Practice basic operations: insert, delete, search, traverse.
- Write clear, simple code and explain your logic.
