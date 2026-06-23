package com.dsa.graph;

import java.util.*;

public class Traversal {
    public static void main(String[] args) {
        //initialize nodes
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");

        //associate neighbours and adjecency
        a.n1 = b;
        a.n2 = c;
        b.n1 = d;
        d.n1 = f;
        c.n1 = e;
        //e.n1 = b;

        //depth first traversal
        System.out.println("Printing DFS");
        printDfs(a);

        //depth first traversal with recursion
        System.out.println("Printing DFS with recursion");
        printDfsWithRecursion(a);

        //breadth first traversal
        System.out.println("Printing BFS");
        printBfs(a);
    }

    private static void printDfsWithRecursion(Node n) {
        if (n == null) {
            return;
        }
        System.out.println(n.val);
        printDfsWithRecursion(n.n1);
        printDfsWithRecursion(n.n2);
    }

    private static void printBfs(Node a) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(a);
        while (!queue.isEmpty()) {
            List<String> tmp = new ArrayList<String>();
            int size = queue.size();
            while(size > 0) {
                Node n = queue.poll();
                tmp.add(n.val);
                if (n.n1 !=null) {
                    queue.add(n.n1);
                }
                if (n.n2 != null) {
                    queue.add(n.n2);
                }
                size--;
            }
            tmp.forEach(System.out::println);
        }
    }

    private static void printDfs(Node a) {
        Stack<Node> stack = new Stack<>();
        stack.push(a);
        while (!stack.isEmpty()) {
            //initialize temp list
            List<String> tmp = new ArrayList<String>();
            int size = stack.size();

            while(size > 0) {
                Node n = stack.pop();
                tmp.add(n.val);
                if (n.n1 !=null) {
                    stack.push(n.n1);
                }
                if (n.n2 != null) {
                    stack.push(n.n2);
                }
                size--;
            }
            tmp.forEach(System.out::println);
        }
    }
}

