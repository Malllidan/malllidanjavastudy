package com.myjava.JianzhiOffer;

/**
 *
 *从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */

import java.util.ArrayList;

public class Test22 {
    public static void main(String...args){
        TreeNode a1=new TreeNode(8);
        TreeNode a2=new TreeNode(8);
        TreeNode a3=new TreeNode(7);
        TreeNode a4=new TreeNode(9);
        TreeNode a5=new TreeNode(8);
        TreeNode a6=new TreeNode(4);
        TreeNode a7=new TreeNode(7);

        TreeNode b1=new TreeNode(8);
        TreeNode b2=new TreeNode(4);
        TreeNode b3=new TreeNode(7);

        a1.left=a2;
        a1.right=a3;
        a2.left=a4;
        a2.right=a5;
        a5.left=a6;
        a5.right=a7;
//        b1.left=b2;
//        b1.right=b3;
        a3.left=b1;
        a3.right=b2;

        Test22 mytest=new Test22();
        ArrayList<Integer> mylist=mytest.PrintFromTopToBottom(a1);
        System.out.println();
    }


    private ArrayList<Integer> mylist=new ArrayList<Integer>();
    private ArrayList<TreeNode> mytree=new ArrayList<TreeNode>();
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null){
            return mylist;
        }
        mytree.add(root);
        while (!mytree.isEmpty()){
            TreeNode mid=mytree.remove(0);
            if(mid.left!=null){
                mytree.add(mid.left);
            }
            if(mid.right!=null){
                mytree.add(mid.right);
            }
            mylist.add(mid.val);
        }
        return mylist;




    }

}
