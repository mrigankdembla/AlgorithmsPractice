package com.trees;

/**
 * Created by shopclues on 6/5/16.
 */

 public class Tree{
    public Tree left;
    public Tree right;
    public int data;

    public Tree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public Tree insertLeftChild(int data,Tree root){
        Tree node = new Tree(data);
        root.left=node;
        root.right = null;
        return root;
    }

    public Tree insertRightChild(int data,Tree root){
        Tree node = new Tree(data);
        root.right=node;
        root.left = null;
        return root;
    }

    public static void printTreeInOrder(Tree root){

        if(root==null)
            return;
        printTreeInOrder(root.left);
        System.out.print("" + root.data + " ");
        printTreeInOrder(root.right);
    }

}
