package com.trees;

/**
 * Created by shopclues on 7/5/16.
 */
public class MaximuminBt {

    private int maxinBt(Tree tree, int max){
        if(tree == null){
            return max;
        }
        if(tree.getData() > max){
            max = tree.getData();
            //return max;
        }




         maxinBt(tree.left,max);
        maxinBt(tree.right,max);

        return max;

    }





    public static void main(String args[]){
        Tree tree = new Tree(12);
        tree.left = new Tree(8);
        tree.right = new Tree(7);
        tree.left.left = new Tree(2);
        tree.left.right = new Tree(10);
        tree.right.right = new Tree(4);
        tree.right.left = new Tree(5);
        tree.right.left.left = new Tree(7);
        tree.right.left.right = new Tree(9);
        int max = 0;
        System.out.print(new MaximuminBt().maxinBt(tree,max));

    }
}
