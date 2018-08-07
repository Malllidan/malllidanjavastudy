package com.myjava.JianzhiOffer;

/**
 *输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 1.首先判断root1和root2是否为空，为空则flase，都不为空则开始递归。
 * 2.比较值是否相等，若想等进入3,。不相进入4
 *
 * 3.比较左子树和右子树是否相等，相等则重复3，不相等则返回flase。直到root2空了，则证明是其子树，否则进入4。
 * 4.判断root1左子树和root2，root1右子树和root2是否符合条件
 *
 */
public class Test17 {

    public static void main(String...args){
        Test17 mytest=new Test17();
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
        b1.left=b2;
        b1.right=b3;
        System.out.println(mytest.HasSubtree(a1,b1));
    }

    public boolean newtest(TreeNode root1,TreeNode root2){
        boolean flag1=false;
        boolean flag2=false;

        if(root2==null&&root1==null){
            return true;
        }
        if(root2!=null&&root1==null){
            return false;
        }
        if(root2==null&&root1!=null){
            return false;
        }
        if(root1.val==root2.val){
            flag1=newtest(root1.left,root2.left);
            flag2=newtest(root1.right,root2.right);
            return flag1&&flag2;
        }
        else{
            flag1=newtest(root1.left,root2);
            flag2=newtest(root1.right,root2);

            return flag1||flag2;
        }

    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean flag1=false;
        boolean flag2=false;
        if(root2==null||root1==null){
            return false;}
        if(root2.val==root1.val){
            flag1=childHasSubTree(root1.left,root2.left,0);
            flag2=childHasSubTree(root1.right,root2.right,0);
            if( flag1&&flag2){
                return true;
            }
            flag1=childHasSubTree(root1.left,root2,1);
            flag2=childHasSubTree(root1.right,root2,1);


           return flag1||flag2;
        }
        else{
            flag1=childHasSubTree(root1.left,root2,1);
            flag2=childHasSubTree(root1.right,root2,1);
            return flag1||flag2;
        }



    }
    private boolean childHasSubTree(TreeNode root1,TreeNode root2,int size){
        boolean flag1=false;
        boolean flag2=false;

        if(root2==null){
            return true;
        }
        if(root2!=null&&root1==null){
            return false;
        }
        if(root1.val==root2.val){

            flag1=childHasSubTree(root1.left,root2.left,0);
            flag2=childHasSubTree(root1.right,root2.right,0);
            if( flag1&&flag2){
                return true;
            }
            flag1=childHasSubTree(root1.left,root2,1);
            flag2=childHasSubTree(root1.right,root2,1);


            return flag1||flag2;
        }
        else{
            if(size==0){
                return false;
            }
            flag1=childHasSubTree(root1.left,root2,1);
            flag2=childHasSubTree(root1.right,root2,1);

            return flag1||flag2;
        }

    }
}
