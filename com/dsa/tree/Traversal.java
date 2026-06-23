package com.dsa.tree;

import java.util.*;

public class Traversal {
    public static void main(String[] args) {

        //initialize
        Node root = new Node("Keshav");
        Node node1 = new Node("Subhash");
        Node node2 = new Node("Suklal");
        Node node3 = new Node("Kishor");
        Node node4 = new Node("Mangesh");
        Node node5 = new Node("Bhavesh");
        Node node6 = new Node("chiu");

        //associate
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        //traverse PreOrder
        System.out.println("\n Printing PreOrder: ");
        printPreOrder(root);

        //traverse InOrder
        System.out.println("\n Printing InOrder: ");
        printInOrder(root);

        //traverse PostOrder
        System.out.println("\n Printing PostOrder: ");
        printPostOrder(root);

        //traverse levelOrder
        System.out.println("\n Printing Level ordered traversal: ");
        printLevelOrder(root);
    }

    private static void printLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        int levelCounter = 0;
        while (!queue.isEmpty()) {
            levelCounter++;
            List<String> tmp = new ArrayList<String>();
            int noOfNodesAtLevel = queue.size();
            System.out.println("Printing elements at level : "+levelCounter);
            while(noOfNodesAtLevel > 0) {
                Node n = queue.poll();
                tmp.add(n.val);
                if (n.left != null) {
                    queue.add(n.left);
                }
                if (n.right != null) {
                    queue.add(n.right);
                }
                noOfNodesAtLevel--;
            }
            tmp.forEach(System.out::println);
        }
    }

    private static void printPostOrder(Node n) {
        if (n == null) {
            return;
        }
        printPostOrder(n.left);
        printPostOrder(n.right);
        System.out.println(n.val);
    }

    private static void printInOrder(Node n) {
        if (n == null) {
            return;
        }
        printInOrder(n.left);
        System.out.println(n.val);
        printInOrder(n.right);
    }

    private static void printPreOrder(Node n) {
        if (n == null) {
            return;
        }
        System.out.println(n.val);
        printPreOrder(n.left);
        printPreOrder(n.right);
    }


}

class Node {
    String val;
    Node left;
    Node right;
    public Node(String val) {
        this.val = val;
    }
}
