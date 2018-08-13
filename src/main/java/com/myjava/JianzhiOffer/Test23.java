package com.myjava.JianzhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 *输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 *
 * //二叉搜索树：右大于根大于左
 */
public class Test23 {
    public static void main(String...args){
        int[] test=new int[]{1,2,3,4,6,7,8,9,5};
        System.out.println(VerifySquenceOfBST(test));

    }
    private static int flag=0;
    public static boolean VerifySquenceOfBST(int [] sequence) {
            int[] mytree=sequence;
            if(mytree.length==0&&flag!=0){
                return true;
            }
            if(mytree.length==0&&flag==0){
                return false;
            }
            flag++;
             List<Integer> lefttree=new ArrayList<Integer>();
             List<Integer> righttree=new ArrayList<Integer>();
            int root=mytree[mytree.length-1];
            for(int i=0;i<mytree.length-1;i++){
                if(mytree[i]<root){
                    lefttree.add(mytree[i]);
                }
                else{
                    break;
                }
            }
            for(int i=0;i<mytree.length-1-lefttree.size();i++){
                if(mytree[i+lefttree.size()]>root){
                    righttree.add(mytree[i+lefttree.size()]);
                }
                else{
                    return false;
                }
            }
            int[] leftarray=new int[lefttree.size()];
            int[] rightarray=new int[righttree.size()];
            for(int i=0;i<leftarray.length;i++){
                leftarray[i]=lefttree.get(i);
            }
        for(int i=0;i<rightarray.length;i++){
            rightarray[i]=righttree.get(i);
        }


            return VerifySquenceOfBST(leftarray)&&VerifySquenceOfBST(rightarray);



    }
}

