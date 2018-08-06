package com.myjava.JianzhiOffer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，
 * 请重建出该二叉树。
 */

public class Test4_2 {

    public static void main(String...args){
        int[] mypre=new int[]{1,2,3,4,5,6,7};
        int[] myin=new int[]{3,2,4,1,6,5,7};
        TreeNode node=reConstructBinaryTree(mypre,myin);
        System.out.println(node);

    }

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        int prelen=pre.length;
        List<Integer> mypre= new ArrayList<Integer>();
        List<Integer> myin=new ArrayList<Integer>();
        for(int i=0;i<prelen;i++){
            mypre.add(pre[i]);
            myin.add(in[i]);
        }
        TreeNode root=reConstructBinaryTree(mypre,myin);
        return  root;


    }
    private static TreeNode reConstructBinaryTree(List<Integer> pre,List<Integer> in){
        if(pre.size()==0 ||in.size()==0){
            return null;
        }
        List<Integer> pre_left=new ArrayList<Integer>();
        List<Integer> pre_right=new ArrayList<Integer>();
        List<Integer> in_left=new ArrayList<Integer>();
        List<Integer> in_right=new ArrayList<Integer>();

        TreeNode root=new TreeNode(pre.get(0));
        int flag=0;
        for(int i=0;i<in.size();i++){
            if(in.get(i)!=root.val&&flag==0){//存中序的左节点
                in_left.add(in.get(i));

                continue;
            }
            else if(in.get(i)==root.val){
                flag=1;
                continue;
            }
            else if(in.get(i)!=root.val&&flag==1){
                //存中序的右节点
                in_right.add(in.get(i));
            }
        }
        for(int i=0;i<in_left.size();i++){
            //存前序的左节点
            pre_left.add(pre.get(i+1));
        }
        for(int i=0;i<in_right.size();i++){
            pre_right.add(pre.get(i+in_left.size()+1));
        }

        System.out.println(pre_left);
        System.out.println(pre_right);
        System.out.println(in_left);
        System.out.println(in_right);
        root.left=reConstructBinaryTree(pre_left,in_left);
        root.right=reConstructBinaryTree(pre_right,in_right);
        return root;

    }

}


class TreeNode {
    int val;
    TreeNode left;
   TreeNode right;
     TreeNode(int x) { val = x; }
}
