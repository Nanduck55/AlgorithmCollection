# 🧩 Java Algorithm Collection

A personal repository containing implementations, lab activities, and custom tests for core Data Structures and Algorithms (DSA) built in Java.

## 📂 Included Implementations

| File Name | Description | Key Concepts |
| :--- | :--- | :--- |
| `Bubble.java` / `BubbleSortLab.java` | Bubble Sort algorithm implementation | Adjacent swaps, early-exit optimization |
| `InsertionSortLab.java` | Insertion Sort algorithm implementation | Left-side sorting, element shifts |
| `QuickSortLab.java` | Quick Sort algorithm implementation | Divide-and-conquer, Lomuto partitioning, recursive pivot sorting |
| `MergeSortLab.java` | Merge Sort algorithm implementation | Divide-and-conquer, recursive splitting, array merging |
| `SimpleHashTable.java` | Basic Hash Table implementation | Modulo hashing (`key % size`), collision detection |
| `HashTableChaining.java` | Hash table using separate chaining | Handling collisions via linked structures |
| `SearchComparisonLab.java` | Search comparative testing | Linear probing, range checking, safe boundary assertions |

---

## 🚀 Quick Overview

* **Sorting Algorithms:** Explores the trade-offs between swaps and shifts across different dataset states (e.g., random vs. nearly sorted arrays).
* **Hash Structures:** Implements modulus-based indexing, collision detection handling, and linear probing routines that gracefully return `false` or manage overflows without crashing.

---

## 🛠️ Requirements & Usage

* **Language:** Java (JDK 17+)
* **Execution:** Compile and run any file directly via your terminal or IDE:
  ```bash
  javac QuickSortLab.java
  java QuickSortLab