<h1 align="center">Day 32</h1>

- Solve Questions on `Priority Queues` & `Heaps` in Java.

<h2>1. Priority Queue </h2>

### Introduction

- A Priority Queue is a queue with the property that the element with the highest priority is at the front of the queue.

### Operations on Priority Queue

- `add` : adds an element to the end of the queue. And also known as 'enqueue'.
  - Time Complexity : `O(log n)`

- `remove` : removes the element with the highest priority from the queue. And also known as 'dequeue'.
  - Time Complexity : `O(log n)`

- `peek` : returns the element with the highest priority from the queue.
  - Time Complexity : `O(1)`


<h2>2. Heaps </h2>

### Introduction

- A Heap is a tree-based data structure that satisfies the following properties:
  i) The tree is a binary tree i.e. it has atmost two children for each node.
  ii) The tree is a complete tree (all levels are completely filled except possibly the last level, which is filled from left to right).
  iii) Each node is greater than or equal to (in a max-heap) or less than or equal to (in a min-heap) its children.
- Heaps are implemeted using an array or a ArrayList.
- Heaps are used to implement Priority Queues.

### Operations on Heaps

- `add` : adds an element to the end of the heap. And also known as 'enqueue'.
  - Time Complexity : `O(log n)`

- `remove` : removes the root element from the heap. And also known as 'dequeue'.
  - Time Complexity : `O(log n)`

- `peek` : returns the root element from the heap.
  - Time Complexity : `O(1)`