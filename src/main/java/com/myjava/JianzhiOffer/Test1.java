package com.myjava.JianzhiOffer;

/***
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 *
 * 思路：从左下角开始，大的右移，小的上移
 */

public class Test1 {
    public static void main(String...args){
        int target=5;
        int[][] myarray=new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Find(target,myarray));

    }



    public static boolean Find(int target, int [][] array) {
        if(array.length==1) return false;
        int x_len=array[0].length;
        int y_len=array.length;
        if(target<array[0][0]||target>array[y_len-1][x_len-1]){
            return false;
        }
        else{
            int yindex=y_len-1;
            int xindex=0;
            do{
                if(array[yindex][xindex]==target){
                    return true;
                }
                else if(array[yindex][xindex]>target){
                    yindex--;
                }
                else if(array[yindex][xindex]<target){
                    xindex++;
                }
            }while (yindex>=0&&xindex<=x_len-1);
            return false;
        }

    }
}
