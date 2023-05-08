package org.example;

public class BinaryTree {

   public static void main(String[] args){
       BinaryTree binaryTree = new BinaryTree();
       binaryTree.run();
    }

    public void run() {
       Tree binaryTree = new Tree();
        for (int i = 0; i < 20; i++) {
          binaryTree.add(i+1);
        }
        binaryTree.traverse();
        System.out.println();

        String bal = " ";
        if (binaryTree.isTreeBalanced()){
            bal = "yes";
        } else {
            bal = "no";
        }
        System.out.println("Чи є дерево збалансованим? " + bal);


        Tree tree1 = new Tree();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            tree1.add((int)Math.floor(Math.random() * (100 - 1 + 1) + 1));
        }
        long finish1 = System.currentTimeMillis();
        long res1 = finish1 - start1;
        System.out.println("Час додавання у створене дерево 100 000 випадкових чисел.: " + res1);

        Tree tree2 = new Tree();
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            tree2.add((int)Math.floor(Math.random() * (100 - 1 + 1) + 1));
        }
        long finish2 = System.currentTimeMillis();
        long res2 = finish2 - start2;
        System.out.println("Час додавання у створене дерево 100 0000 випадкових чисел.: " + res2);



    }


}
