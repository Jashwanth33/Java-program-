# Java Programming

[![Java](https://img.shields.io/badge/Java-17+-007396?style=for-the-badge&logo=openjdk&logoColor=white)](https://oracle.com/java)
[![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)](LICENSE)

> Java programming exercises, data structures, algorithm implementations, and object-oriented design examples.

## OOP Concepts

`mermaid
classDiagram
    class Animal {
        +String name
        +int age
        +makeSound()
        +eat()
    }
    
    class Dog {
        +String breed
        +fetch()
        +bark()
    }
    
    class Cat {
        +String color
        +purr()
        +scratch()
    }
    
    class Person {
        +String name
        +Animal pet
        +adoptPet()
    }
    
    Animal <|-- Dog
    Animal <|-- Cat
    Person --> Animal
`

## Data Structures Hierarchy

`mermaid
graph TD
    A[Data Structures] --> B[Linear]
    A --> C[Non-Linear]
    
    B --> D[Array]
    B --> E[Linked List]
    B --> F[Stack]
    B --> G[Queue]
    
    C --> H[Tree]
    C --> I[Graph]
    C --> J[Hash Table]
    
    H --> H1[Binary Tree]
    H --> H2[BST]
    H --> H3[AVL Tree]
    
    I --> I1[Directed]
    I --> I2[Undirected]
    I --> I3[Weighted]
`

## Algorithm Complexity

`mermaid
pie title Algorithm Time Complexity Distribution
    "O(1) - Constant" : 10
    "O(log n) - Logarithmic" : 20
    "O(n) - Linear" : 30
    "O(n log n) - Linearithmic" : 25
    "O(n²) - Quadratic" : 15
`

## Sorting Algorithm Flow

`mermaid
flowchart TD
    A[Input Array] --> B{Algorithm Selection}
    
    B -->|Bubble Sort| C[Bubble Sort]
    B -->|Selection Sort| D[Selection Sort]
    B -->|Insertion Sort| E[Insertion Sort]
    B -->|Merge Sort| F[Merge Sort]
    B -->|Quick Sort| G[Quick Sort]
    
    C --> H[Compare Adjacent]
    D --> I[Find Minimum]
    E --> J[Insert in Place]
    F --> K[Divide and Conquer]
    G --> L[Partition and Recurse]
    
    H --> M[Sorted Array]
    I --> M
    J --> M
    K --> M
    L --> M
`

## Project Structure

`
Java-program-/
│
├── src/
│   ├── main/java/com/jashwanth/
│   │   ├── Main.java                   # Main entry point
│   │   │
│   │   ├── datastructures/
│   │   │   ├── arrays/
│   │   │   │   ├── DynamicArray.java
│   │   │   │   └── TwoDArray.java
│   │   │   ├── linkedlist/
│   │   │   │   ├── SinglyLinkedList.java
│   │   │   │   ├── DoublyLinkedList.java
│   │   │   │   └── CircularLinkedList.java
│   │   │   ├── stack/
│   │   │   │   ├── Stack.java
│   │   │   │   └── StackUsingArray.java
│   │   │   ├── queue/
│   │   │   │   ├── Queue.java
│   │   │   │   ├── PriorityQueue.java
│   │   │   │   └── Deque.java
│   │   │   ├── tree/
│   │   │   │   ├── BinarySearchTree.java
│   │   │   │   ├── AVLTree.java
│   │   │   │   └── RedBlackTree.java
│   │   │   ├── graph/
│   │   │   │   ├── Graph.java
│   │   │   │   ├── DirectedGraph.java
│   │   │   │   └── WeightedGraph.java
│   │   │   └── hashtable/
│   │   │       ├── HashMap.java
│   │   │       └── ConcurrentHashMap.java
│   │   │
│   │   ├── algorithms/
│   │   │   ├── sorting/
│   │   │   │   ├── BubbleSort.java
│   │   │   │   ├── SelectionSort.java
│   │   │   │   ├── InsertionSort.java
│   │   │   │   ├── MergeSort.java
│   │   │   │   ├── QuickSort.java
│   │   │   │   └── HeapSort.java
│   │   │   ├── searching/
│   │   │   │   ├── LinearSearch.java
│   │   │   │   ├── BinarySearch.java
│   │   │   │   └── DepthLimitedSearch.java
│   │   │   └── graph/
│   │   │       ├── BFS.java
│   │   │       ├── DFS.java
│   │   │       ├── Dijkstra.java
│   │   │       └── Prim.java
│   │   │
│   │   ├── designpatterns/
│   │   │   ├── creational/
│   │   │   │   ├── Singleton.java
│   │   │   │   ├── Factory.java
│   │   │   │   └── Builder.java
│   │   │   ├── structural/
│   │   │   │   ├── Adapter.java
│   │   │   │   └── Decorator.java
│   │   │   └── behavioral/
│   │   │       ├── Observer.java
│   │   │       └── Strategy.java
│   │   │
│   │   └── oop/
│   │       ├── inheritance/
│   │       ├── polymorphism/
│   │       ├── encapsulation/
│   │       └── abstraction/
│   │
│   └── test/java/com/jashwanth/
│       ├── datastructures/
│       ├── algorithms/
│       └── designpatterns/
│
├── docs/
│   ├── DATA_STRUCTURES.md
│   ├── ALGORITHMS.md
│   ├── DESIGN_PATTERNS.md
│   └── OOP_CONCEPTS.md
│
├── resources/
│   └── samples/
│
├── pom.xml
└── README.md
`

## Topics Covered

| Category | Topics |
|----------|--------|
| **Data Structures** | Arrays, Linked Lists, Stacks, Queues, Trees, Graphs, Hash Tables |
| **Algorithms** | Sorting, Searching, Graph Traversal, Path Finding |
| **Design Patterns** | Singleton, Factory, Builder, Adapter, Observer, Strategy |
| **OOP Concepts** | Inheritance, Polymorphism, Encapsulation, Abstraction |

## Building & Running

`ash
# Using Maven
mvn clean install

# Run main class
mvn exec:java -Dexec.mainClass="com.jashwanth.Main"

# Run tests
mvn test
`

## Usage Examples

`java
// Create and use a Binary Search Tree
BinarySearchTree<Integer> bst = new BinarySearchTree<>();
bst.insert(50);
bst.insert(30);
bst.insert(70);
bst.inorderTraversal(); // 30, 50, 70

// Use sorting algorithm
int[] arr = {64, 34, 25, 12, 22, 11, 90};
QuickSort.sort(arr);
System.out.println(Arrays.toString(arr)); // [11, 12, 22, 25, 34, 64, 90]
`

## Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License

MIT License

## Author

**Jashwanth** - [GitHub](https://github.com/Jashwanth33)