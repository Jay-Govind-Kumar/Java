<h1 align="center">Day 10</h1>

## Introduction

- Sorting is a technique used to sort the elements in a list or array in either ascending or descending order.
- It is an important part of many data structures such as linked lists, arrays, and trees.

# Sorting Algorithms

## Bubble Sort

- In this algoriths, we compare the adjacent elements and swap them if they are in wrong order.
- time complexity - O(n^2)
- total turns = (n-1)

  ### Algorithm :

  ```
  1. Start with the first element and compare it with the next element.
  2. If the element is greater than the next element, swap them.
  3. Continue this process until the last element is reached.
  4. Repeat the process for the remaining elements.
  ```

  ### Example - (5, 1, 4, 3, 2)

  ```
  1st iteration - (from index 0 to n-2)
      Step 1: (5, 1, 4, 3, 2)  --> compare (1, 5) and swap
      Step 2: (1, 5, 4, 3, 2)  --> compare (5, 4) and swap
      Step 3: (1, 4, 5, 3, 2)  --> compare (5, 3) and swap
      Step 4: (1, 4, 3, 5, 2)  --> compare (5, 2) and swap
      Step 5: (1, 4, 3, 2, 5)  --> 5 is in correct position.
      So, no swap.

  2nd iteration - (from index 0 to n-3)
      Step 1: (1, 4, 3, 2, 5)  --> compare (4, 1) and do not swap
      Step 2: (1, 4, 3, 2, 5)  --> compare (4, 3) and swap
      Step 3: (1, 3, 4, 2, 5)  --> compare (4, 2) and swap
      Step 4: (1, 3, 2, 4, 5)  --> stop here. 4 is in correct position.
      So, no swap. and 5 is already in correct position.

  3rd iteration - (from index 0 to n-4)
      Step 1: (1, 3, 2, 4, 5)  --> compare (3, 1) and do not swap
      Step 2: (1, 3, 2, 4, 5)  --> compare (3, 2) and swap
      Step 3: (1, 2, 3, 4, 5)  --> stop here. 3 is in correct position.
      So, no swap. and 4 & 5 are already in correct position.

  4th iteration - (from index 0 to n-5)
      Step 1: (1, 2, 3, 4, 5)  --> compare (2, 1) and do not swap
      Step 2: (1, 2, 3, 4, 5) --> stop here. 2 is in correct position.
      So, no swap. and 3, 4 & 5 are already in correct position.

  iteration stops here. Because all elements are in correct position.

  ```

## Selection Sort
- In this algorithms, we find the minimum element and swap it with the first element.
- time complexity - O(n^2)

## Insertion Sort
- In this algorithm, we insert the element in correct position.
- time complexity - O(n^2)

## Counting Sort (Advance)
- In this algorithm, we count the number of occurance of each element and insert it in correct position. It is used only for positive integer.
- time complexity - O(n+k)
