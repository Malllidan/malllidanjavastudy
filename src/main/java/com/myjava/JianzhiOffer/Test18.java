package com.myjava.JianzhiOffer;

/**
 *操作给定的二叉树，将其变换为源二叉树的镜像。
 *
 *
 */
public class Test18 {

    public void Mirror(TreeNode root) {
        if(root!=null){
            TreeNode midNode=root.right;
            root.right=root.left;
            root.left=midNode;

            Mirror(root.left);
            Mirror(root.right);
        }

    }
    private void Switch(TreeNode root){

    }

}
