package com.myjava.JianzhiOffer;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * [A,B]旋转完必然是B第一个元素最小
 */
public class Test6 {

    public static void main(String...args){
        int[] mylist=new int[]{4,5,1,3,3};
        System.out.println(minNumberInRotateArray(mylist));
    }


    public static int minNumberInRotateArray(int [] array) {
        if(array.length==0) {
            return 0;
        }

        int mid=(int) Math.ceil(array.length/2);
        //return array[mid];
        for(int i=mid, j=mid;i<(array.length-1)&&j>0;i++,j--){
            if(array[i]>array[i+1]){
                return array[i+1];
            }
            if(array[j]<array[j-1]){
                return array[j];
            }

        }



     return 0;
    }
}
