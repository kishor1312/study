package com.dsa.graph;

import java.util.*;

public class HasPath {
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

        //check has Path
        System.out.println("Checking has Path");
        System.out.println(hasPathWithRecursion(a, e, graph, new HashSet<>()));
    }

    private static boolean hasPathWithRecursion(Node current, Node dest, Map<Node, List<Node>> graph, Set<Node> visited) {
        if (current == null || dest == null) {
            return false;
        }

        if (current == dest) {
            System.out.print(current.val);
            System.out.println("\nPathExists...");
            return true;
        }

        visited.add(current);
        System.out.print(current.val + "->");

        for (Node neighbour: graph.getOrDefault(current, Collections.emptyList())) {
            if (!visited.contains(neighbour)) {
                visited.add(neighbour);
                if(hasPathWithRecursion(neighbour, dest, graph, visited))
                    return true;
            }
        }
        System.out.println("Verified current path, exploring to new path from : "+current.val);
        return false;
    }
}

