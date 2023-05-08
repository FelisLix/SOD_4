package org.example;


public class Node{
    private int key;
    private Node left;
    private Node right;
    private Node parent;

    public Node(int key){
        this(key, null, null, null);
    }

    public Node(int key, Node left, Node right, Node parent){
        this.key = key;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    public boolean isLeaf(){
        return left == null && right == null;
    }

    public int getKey(){
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getParent() {
        return parent;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left){
        this.left = left;
        if (left != null){
            left.setParent(this);
        }
    }

    public void setRight(Node right) {
        this.right = right;
        if (right != null){
            right.setParent(this);
        }
    }

    public Node getRight() {
        return right;
    }
}