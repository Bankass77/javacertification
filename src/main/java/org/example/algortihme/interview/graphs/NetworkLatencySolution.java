package org.example.algortihme.interview.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Divide a network of data centers into optimal local regions.
 * Given a network of g_nodes data centers and g edges bidirectional connections, the i-th connection connects data centers g_from[i] and g_to[i] with a latency of g_weight[i]. The max-latency of a network is the maximum latency of any connection.
 * Divide this network into k or fewer networks by removing some of the connections such that the maximum latencies of all the regions are minimized. Find the minimum possible value of the maximum max-latency of the networks formed.
 * Function Description:
 * Complete the function getMinMaxLatency in the editor below.
 * getMinMaxLatency has the following parameter(s): g_nodes: the number of data centers g fromig edges): one end of the connections gtolg edges): another end of the connections gweightig edges); the latency of the connections k: the maximum number of networks after removing some connections
 * Returns :
 * long int: the minimum possible value of the max-latency of the networks formed
 *
 * To solve this problem, we need to divide the network into k or fewer regions by removing some connections, such that the maximum latency of any connection in each region is minimized. This resembles a variant of the "Minimum Spanning Tree (MST)" problem, where we need to split the MST into k segments by removing the heaviest edges.
 *
 * Approach
 * Graph Representation:
 *
 * We have g_nodes data centers, connected by g_edges bidirectional edges.
 * Each edge has a weight, representing the latency.
 * MST (Minimum Spanning Tree):
 *
 * We first compute the MST of the graph. An MST minimizes the sum of all edge weights while connecting all nodes, and it provides the optimal structure to remove edges in order to break the network into regions.
 * After forming the MST, we will have g_nodes - 1 edges.
 * Edge Removal:
 *
 * To divide the MST into k regions, we remove the k - 1 most expensive edges from the MST. This minimizes the maximum latency in each of the resulting regions.
 * Binary Search:
 *
 * We can use binary search to find the minimum possible value of the maximum latency after dividing the network into k regions. The idea is to try different possible values of the maximum latency and check if it's possible to divide the graph into k or fewer regions with that maximum latency.
 * Steps
 * Create MST using Kruskal's or Prim's algorithm.
 * Remove the k - 1 most expensive edges from the MST.
 * The answer will be the largest remaining edge weight in the divided MST
 */
public class NetworkLatencySolution {
    static class Edge implements Comparable<Edge> {
        int from, to, weight;

        Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    static class UnionFind {
        int[] parent, rank;

        UnionFind(int size) {
            parent = new int[size];
            rank = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        int find(int node) {
            if (parent[node] != node) {
                parent[node] = find(parent[node]);
            }
            return parent[node];
        }

        boolean union(int u, int v) {
            int rootU = find(u);
            int rootV = find(v);

            if (rootU != rootV) {
                if (rank[rootU] > rank[rootV]) {
                    parent[rootV] = rootU;
                } else if (rank[rootU] < rank[rootV]) {
                    parent[rootU] = rootV;
                } else {
                    parent[rootV] = rootU;
                    rank[rootU]++;
                }
                return true;
            }
            return false;
        }
    }

    public static long getMinMaxLatency(int g_nodes, List<Integer> g_from, List<Integer> g_to, List<Integer> g_weight, int k) {
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < g_from.size(); i++) {
            edges.add(new Edge(g_from.get(i) - 1, g_to.get(i) - 1, g_weight.get(i)));
        }

        // Sort edges by weight
        Collections.sort(edges);

        // Kruskal's algorithm to form the MST
        UnionFind uf = new UnionFind(g_nodes);
        List<Edge> mstEdges = new ArrayList<>();

        for (Edge edge : edges) {
            if (uf.union(edge.from, edge.to)) {
                mstEdges.add(edge);
            }
        }

        // If we need k regions, we need to remove k-1 maximum edges from the MST
        Collections.sort(mstEdges);

        // Remove the k-1 most expensive edges
        int regionsToRemove = k - 1;
        while (regionsToRemove > 0 && mstEdges.size() > 0) {
            mstEdges.remove(mstEdges.size() - 1);
            regionsToRemove--;
        }

        // The maximum remaining edge weight is the answer
        return mstEdges.get(mstEdges.size() - 1).weight;
    }
}
/*
 * Explanation:
 * Edge class: A helper class to represent each connection with from, to, and weight.
 * Union-Find class: To efficiently manage connected components during Kruskal’s MST algorithm.
 * getMinMaxLatency function:
 * It constructs the graph using the provided connections.
 * It applies Kruskal’s algorithm to find the MST.
 * It removes the k - 1 most expensive edges from the MST.
 * The maximum weight of the remaining edges is returned as the result.
 * Time Complexity:
 * Sorting the edges: O(g_edges * log(g_edges))
 * Kruskal’s algorithm (with union-find): O(g_edges * log(g_nodes))
 * Sorting the MST edges and removing k - 1 edges: O((g_nodes - 1) * log(g_nodes)).
 * Edge Cases:
 * If k == 1, the entire network remains connected, and the maximum latency is the largest edge in the MST.
 * If k == g_nodes, each data center becomes its own region, and the maximum latency is zero.
 * This approach ensures that we minimize the maximum latency after dividing the network into k regions.
 */