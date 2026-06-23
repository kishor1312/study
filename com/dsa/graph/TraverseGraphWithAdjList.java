package com.dsa.graph;

import java.util.*;

public class TraverseGraphWithAdjList {
    public static void main(String[] args) {
        //initialize nodes
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");

        //associate neighbours and adjecency using Map
        Map<Node, List<Node>> graph = new HashMap<>();
        graph.put(a, Arrays.asList(b, c));
        graph.put(b, Arrays.asList(d));
        graph.put(c, Arrays.asList(e));
        graph.put(d, Arrays.asList(f));
        graph.put(e, Arrays.asList(b));
        graph.put(f, Arrays.asList());

        //depth first traversal with recursion
        System.out.println("\nPrinting DFS with recursion");
        printDfsWithRecursion(a, graph, new HashSet<>());

        //dfs with stack, without method recursion
        System.out.println("\nPrinting DFS without recursion");
        printDfsWithStack(a, graph, new HashSet<>());

        //Bfs with Queue
        System.out.println("\nPrinting BFS with Queue");
        printBfs(a, graph, new HashSet<>());
    }

    private static void printDfsWithRecursion(Node n,  Map<Node, List<Node>> graph, Set<Node> visited) {
        if (n == null || visited.contains(n)) {
            return;
        }
        System.out.println(n.val);
        visited.add(n);
        for (Node neighbour: graph.getOrDefault(n, Collections.emptyList())) {
            printDfsWithRecursion(neighbour, graph, visited);
        }
    }

    private static void printBfs(Node start, Map<Node, List<Node>> graph, Set<Node> visited) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println(current.val);
            for(Node neighbour: graph.getOrDefault(current, Collections.emptyList())) {
                if(!visited.contains(neighbour)) {
                    queue.offer(neighbour);
                    visited.add(neighbour);
                }
            }
        }
    }

    private static void printDfsWithStack(Node start,  Map<Node, List<Node>> graph, Set<Node> visited) {
        Stack<Node> stack = new Stack<>();
        stack.push(start);
        visited.add(start);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.println(current.val);
            for (Node neighbour : graph.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(neighbour)) {
                    stack.push(neighbour);
                    visited.add(neighbour);
                }
            }
        }
    }
}

