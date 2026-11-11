# IC-307D — Data Structures and Algorithms Lab (Java)

A Java implementation of the practical topics listed in the supplied IC-307D lab syllabus (Units 1–7), with runnable examples, documentation, sample I/O, and complexity notes.

## Requirements
- JDK 17 or later
- Terminal / command prompt

## Run any program
From the repository root:
```bash
javac -d out Unit1-Arrays/Program01-ArrayOperations/Main.java
java -cp out Main
```
Each program is self-contained and uses only the Java standard library. Compile each `Main.java` separately because several exercises intentionally use the same entry-point class name.

## Repository map
- `Unit1-Arrays`: 1D/2D arrays, sparse matrices, matrix calculator
- `Unit2-Sorting-Searching`: sorting, binary search, benchmarking, student records, dictionary + hashing
- `Unit3-Linked-Lists`: singly/doubly/circular lists, polynomial addition, text buffer, playlist
- `Unit4-Stacks`: array/linked stacks, expression conversion/evaluation, undo/redo
- `Unit5-Queues`: queue variants, priority queue, scheduling simulation
- `Unit6-Trees`: traversals, BST, AVL, expression tree, file-system simulator, symbol table
- `Unit7-Graphs`: graph representations, BFS/DFS, Dijkstra, social graph, maze, prerequisites
- `docs`: diagrams, complexity guide, final-report outline, presentation outline

## Notes
1. Enter positions as **zero-based indices** unless a program explicitly says otherwise.
2. Invalid input and empty/full data structures are handled with clear messages.
3. These are educational reference implementations. Review the algorithm and adapt naming/formatting to your instructor's requirements before submission.
4. The syllabus marks Dijkstra, threaded trees, and topological sort as optional/bonus; optional examples are included where practical.
5. Screenshots are not fabricated. Capture your own terminal screenshots after running programs and place them in the relevant `screenshots/` folders.

## Syllabus coverage
The folders cover the basic and application topics listed on pages 3–5 of the supplied lab document. Each unit has a README and reflection.
