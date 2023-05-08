package org.example;

import lombok.Setter;

public class Tree {

    @Setter
    Node root;

    public boolean add(int value){
        if (root == null){
            root = new Node(value);
            return true;
        }
        return addInSubTree(value, root);
    }


    private boolean addInSubTree(int value, Node root) {
        if (value == root.getKey()) {
            return false;
        }
        if (value % 2 == 0) {
            if (value > root.getKey()) {
                if (root.getLeft() == null) {
                    root.setLeft(new Node(value));
                    return true;
                } else {
                    return addInSubTree(value, root.getLeft());
                }
            } else {
                if (root.getRight() == null) {
                    root.setRight(new Node(value));
                    return true;
                } else {
                    return addInSubTree(value, root.getRight());
                }
            }
        } else {
            if (value < root.getKey()) {
                if (root.getLeft() == null) {
                    root.setLeft(new Node(value));
                    return true;
                } else {
                    return addInSubTree(value, root.getLeft());
                }
            } else {
                if (root.getRight() == null) {
                    root.setRight(new Node(value));
                    return true;
                } else {
                    return addInSubTree(value, root.getRight());
                }
            }
        }
    }

    private void traverse(Node root){
        if (root!= null){
            traverse(root.getLeft());
            visit(root);
            traverse(root.getRight());
        }
    }

    private void visit(Node node) {
        System.out.print(node.getKey() + " ");
    }

    private Node find(int key){
        if (root==null){
            return null;
        }
        return findInSubTree(key, root);
    }

    private Node findInSubTree(int key, Node root) {
        if ((root == null) || (key == root.getKey())){
            return root;
        }
        if (key < root.getKey()) {
            return findInSubTree(key, root.getLeft());
        } else {
            return findInSubTree(key, root.getRight());
        }
    }
    public boolean contains (int key){ return find(key) != null; }

    public void traverse(){
        traverse(root);
    }


    public int treeHeight(){
        return height(root);
    }

    private int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.getLeft()), height(root.getRight()));
    }

    public boolean isTreeBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node root){
        int leftH = height(root.getLeft());
        int rightH = height(root.getRight());

        return Math.abs(leftH - rightH) <= 1;
    }


}
