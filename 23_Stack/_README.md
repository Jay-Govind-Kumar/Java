<h1 align="center">Day 23</h1>

- Learned about `Stack` in Java.

## Introduction

- Stack is a linear data structure in which data are stored in a `Last In First Out` (LIFO) manner.
- In a stack, the last element that is inserted into the stack is the first one to be removed.

### Implementation

- In Java, Stack is implemented using `java.util.Stack` class.
- It is a part of the Java Collections Framework.

## Operations on Stack

- `push` : adds an element to the top of the stack.
- `pop` : removes the top element from the stack.
- `peek` : returns the top element from the stack.
- `isEmpty` : checks if the stack is empty.

### Code Example

```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // Pop elements from the stack
        System.out.println(stack.pop()); // Output: C
        System.out.println(stack.pop()); // Output: B
        System.out.println(stack.pop()); // Output: A

        // Check if the stack is empty
        System.out.println(stack.isEmpty()); // Output: true
    }
}
```
