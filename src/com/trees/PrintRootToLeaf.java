package com.trees;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by shopclues on 19/8/16.
 */
public class PrintRootToLeaf {
    ArrayList<Integer> arrayList = new ArrayList<>();
    public void printRootToLeaf(Tree root){

        if(root == null) {


            return;
        }

        arrayList.add(root.data);
        printRootToLeaf(root.left);
        printRootToLeaf(root.right);
        if(root.left == null && root.right == null) {
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.print(arrayList.get(i) + " ");
            }
            System.out.println();
        }
        arrayList.remove(arrayList.size()-1);


    }


    public static void main(String[] args){
        /* Constructed binary tree is
            10
          /   \
        8      2
      /  \    /
    3     5  2
  */
        Tree root = new Tree(10);
        root.left = new Tree(8);
        root.right = new Tree(2);
        root.left.left = new Tree(3);
        root.left.right = new Tree(5);
        root.right.left = new Tree(2);
        Tree.printTreeInOrder(root);
        System.out.println();
        new PrintRootToLeaf().printRootToLeaf(root);



    }



}
