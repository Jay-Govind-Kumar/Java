<h1 align="center">Day 20</h1>

- Learned about `ArrayList` in Java.

# Introduction

- An ArrayList is a dynamic array that can grow and shrink as needed.
- It is a part of the Java Collections Framework.
- It can only store objects, not primitive data types.

## Creating an ArrayList

- To create an ArrayList, we can use the `ArrayList()` constructor.

  ```java
  ArrayList<String> list = new ArrayList<>();
  ```

## Operations on ArrayList

- add : adds an element to the end of the ArrayList or at a specific index.

  syntax

  ```java
  list.add(element);
  list.add(index, element);
  ```

- get : returns the element at a specific index.

  syntax

  ```java
  element = list.get(index);
  ```

- size : returns the number of elements in the ArrayList.

  syntax

  ```java
  int size = list.size();
  ```

- remove : removes an element from the ArrayList.

  syntax

  ```java
  list.remove(index);
  ```

- set : replaces the element at a specific index with a new element.

  syntax

  ```java
  list.set(index, element);
  ```

- contains : checks if the ArrayList contains a specific element.

  syntax

  ```java
  boolean contains = list.contains(element);
  ```
