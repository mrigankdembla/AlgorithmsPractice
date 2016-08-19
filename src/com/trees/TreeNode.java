package com.trees;



import java.util.ArrayList;
import java.util.TreeSet;

public class TreeNode {


    ArrayList<Integer> integersList;


    public TreeNode(ArrayList<Integer> integersList){
        this.integersList = integersList;

    }

    public Tree createTree(){
        int i;
        int count=0;
        Tree temp;
        Tree tree = new Tree(integersList.get(0));
        temp = tree;
        for(i=1;i<integersList.size();i+=2){
            ++count;
            tree.left = new Tree(integersList.get(i));
            if(i+1 >= integersList.size())
                break;
            tree.right = new Tree(integersList.get(i+1));
            if(count%2==1)
                tree = tree.left;
            else
                tree = tree.right;

        }

        return tree;

    }

}
