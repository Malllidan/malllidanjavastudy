package com.myjava.JianzhiOffer;

import sun.reflect.generics.tree.Tree;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Test26 {
    TreeNode leftHead=null;//记录链表的头
    TreeNode rightHead=null;//不停右移的链表尾巴
    public TreeNode Convert(TreeNode pRootOfTree) {
       if(pRootOfTree==null){
           return null;
       }
       Convert(pRootOfTree.left);
       if(leftHead==null){
           leftHead=rightHead=pRootOfTree;
       }
       else{
           rightHead.right=pRootOfTree;
           pRootOfTree.left=rightHead;
           rightHead=pRootOfTree;
       }
       Convert(pRootOfTree.right);
       return leftHead;
        

    }


}
