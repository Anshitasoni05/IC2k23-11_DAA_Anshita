# Complexity Analysis Reference

| Algorithm / operation | Best | Average | Worst | Auxiliary space |
|---|---:|---:|---:|---:|
| Array access | O(1) | O(1) | O(1) | O(1) |
| Array insert/delete (middle) | O(n) | O(n) | O(n) | O(n) for copied array |
| Sparse triplet conversion | O(r·c) | O(r·c) | O(r·c) | O(k) non-zero entries |
| Bubble sort (optimized variant not used) | O(n²) | O(n²) | O(n²) | O(1) |
| Selection sort | O(n²) | O(n²) | O(n²) | O(1) |
| Insertion sort | O(n) | O(n²) | O(n²) | O(1) |
| Merge sort | O(n log n) | O(n log n) | O(n log n) | O(n) |
| Quick sort | O(n log n) | O(n log n) | O(n²) | O(log n) average recursion |
| Heap sort | O(n log n) | O(n log n) | O(n log n) | O(1) iterative heap |
| LSD radix sort | O(d(n+b)) | O(d(n+b)) | O(d(n+b)) | O(n+b) |
| Binary search | O(1) | O(log n) | O(log n) | O(1) |
| Linked-list search | O(1) | O(n) | O(n) | O(1) |
| Stack push/pop | O(1) | O(1) | O(1) | O(1) per operation |
| Queue enqueue/dequeue | O(1) | O(1) | O(1) | O(1) per operation |
| BST search/insert/delete | O(log n) balanced | O(log n) expected | O(n) skewed | O(h) recursion |
| AVL search/insert | O(log n) | O(log n) | O(log n) | O(log n) recursion |
| BFS / DFS | O(V+E) | O(V+E) | O(V+E) | O(V) |
| Dijkstra (matrix implementation) | O(V²) | O(V²) | O(V²) | O(V²) |

Symbols: n = number of elements, r/c = matrix dimensions, k = non-zero entries, d = number of radix digits, b = radix base, V = vertices, E = edges, h = tree height.

Actual runtime depends on machine, JVM warm-up, input distribution, and implementation details. The benchmark in Unit 2 reports nanoseconds for one run and is illustrative, not a statistically rigorous benchmark.
