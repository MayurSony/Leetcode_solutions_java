// A tree is an undirected graph in which any two vertices are connected by exactly one path. In other words, any connected graph without simple cycles is a tree.

// Given a tree of n nodes labelled from 0 to n - 1, and an array of n - 1 edges where edges[i] = [ai, bi] indicates that there is an undirected edge between the two nodes ai and bi in the tree, you can choose any node of the tree as the root. When you select a node x as the root, the result tree has height h. Among all possible rooted trees, those with minimum height (i.e. min(h))  are called minimum height trees (MHTs).

// Return a list of all MHTs' root labels. You can return the answer in any order.

// The height of a rooted tree is the number of edges on the longest downward path between the root and a leaf.

//CODE:--->>>

// public class Solution {
//     public List<Integer> findMinHeightTrees(int n, int[][] edges) {
//         // If there is only one node, return it as the root of the minimum height tree
//         if (n == 1) {
//             return Collections.singletonList(0);
//         }

//         // Create an adjacency list to represent the graph
//         List<Integer>[] adjList = new List[n];
//         for (int i = 0; i < n; i++) {
//             adjList[i] = new ArrayList<>();
//         }

//         // Populate the adjacency list based on the edges
//         for (int[] edge : edges) {
//             int u = edge[0];
//             int v = edge[1];
//             adjList[u].add(v);
//             adjList[v].add(u);
//         }

//         // Find all leaf nodes (nodes with only one neighbor) as the starting point
//         List<Integer> leaves = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             if (adjList[i].size() == 1) {
//                 leaves.add(i);
//             }
//         }

//         // Keep track of the remaining nodes to process
//         int remainingNodes = n;

//         // Continue until there are only 1 or 2 nodes left
//         while (remainingNodes > 2) {
//             // Reduce the remaining nodes by the number of current leaf nodes
//             remainingNodes -= leaves.size();

//             // Create a new list to store the new leaf nodes for the next iteration
//             List<Integer> newLeaves = new ArrayList<>();

//             // Remove current leaf nodes and update their neighbors
//             for (int leaf : leaves) {
//                 int neighbor = adjList[leaf].get(0);
//                 adjList[neighbor].remove(Integer.valueOf(leaf));

//                 // If the neighbor becomes a leaf node, add it to the new leaves list
//                 if (adjList[neighbor].size() == 1) {
//                     newLeaves.add(neighbor);
//                 }
//             }

//             // Update the current leaf nodes for the next iteration
//             leaves = newLeaves;
//         }

//         // At this point, the remaining nodes are the centers of the minimum height trees
//         return leaves;
//     }
// }