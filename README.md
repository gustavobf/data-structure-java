# data-structure-java

Implementations of classic data structures in Java, designed for learning and educational purposes.  
Each structure is implemented from scratch — without using Java’s built-in collections — so learners can understand how they work internally.

---

# linked-list

A simple implementation of different types of linked lists in Java.

## 🧠 About

This repository contains simple and educational implementations of multiple linked list structures in Java.  
It is intended for learners who want to understand how linked lists work internally — without using Java's built-in collections.

## 🔗 Types of Linked Lists

This repository includes implementations for:

- **Singly Linked List**  
  Each node points to the next one. Good for simple traversal and basic operations.

- **Doubly Linked List**  
  Each node points to both the next and previous elements, allowing reverse traversal and more efficient deletions.

More types can be added in the future.

## ✅ Features

- Create and manipulate a doubly linked list
- Insert elements at the beginning (`prepend`)
- Insert elements at the end (`append`)
- Insert elements at any position (`insertAt`)
- Remove an element by value (`remove`)
- Remove an element by index (`removeAt`)
- Check whether a value exists in the list (`contains`)
- Get the first element (`getFirst`)
- Get the last element (`getLast`)
- Get an element by index (`get`)
- Retrieve internal node by index (`getAt`)
- Keep track of the current list size (`size`)
- Maintain head, tail, and length for efficient operations

More features can be added in the future.

---

# queue

A simple implementation of a queue data structure in Java.

## 🧠 About

This repository contains an educational implementation of a queue.  
It is intended for learners who want to understand how queues work internally — without relying on Java’s built-in collections.

## 🔗 Features

- Generic node and queue classes
- Core queue operations:
  - `enqueue(element)` — add an element to the end of the queue  
  - `dequeue()` — remove and return the element at the front  
  - `peek()` — get the element at the front without removing it  
  - `size()` — get the current number of elements
- Maintains internal references to **front (head)** and **rear (tail)** for efficient operations
- Works with any data type using Java generics

---

# stack

A simple implementation of a stack data structure in Java.

## 🧠 About

This repository contains a simple and educational implementation of a stack in Java.  
It is intended for learners who want to understand how stacks work internally — without relying on Java's built-in collections.

## 🔗 Stack Structure

This implementation uses a structure in which each node stores a value and a reference to the next node.  
The stack grows and shrinks from the **top**, enabling efficient push and pop operations.

More stack variants or implementations may be added in the future.

## ✅ Features

- Create and manipulate a stack
- Add an element to the top of the stack (`push`)
- Remove and return the top element (`pop`)
- View the top element without removing it (`peek`)
- Keep track of the current stack size (`size`)
- Maintain an internal reference to the **top** for efficient operations

More features can be added in the future.

---

# binary-tree

A simple and educational implementation of a binary tree in Java — built from scratch to help learners understand how binary trees work internally.

## 🧠 About

This repository contains a straightforward implementation of a binary tree data structure using Java.  
It is intended for students and developers who want to learn how binary trees operate internally without relying on Java’s built-in collections.

## 🔗 Features

- Node structure with references to left and right children  
- Insert values into the tree  
- Traversal methods, such as:
  - In-order
  - Pre-order
  - Post-order
  - Level-order (BFS)
- Search for values in the tree  
- Clean and easy-to-read code designed for learning  

More features may be added in the future.

---

## 📄 License

This project is under the MIT License.
