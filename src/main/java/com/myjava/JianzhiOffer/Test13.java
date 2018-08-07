package com.myjava.JianzhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 *输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * ，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 */
public class Test13 {
    public void reOrderArray(int [] array) {
        List<Integer> myjilist=new ArrayList<Integer>();
        List<Integer> myoulist=new ArrayList<Integer>();
        for(int i=0;i<array.length;i++){
           int flag=array[i]%2;
           if(flag==0){
               myoulist.add(array[i]);
           }
           else {
               myjilist.add(array[i]);
           }
        }
        for(int i=0;i<myjilist.size();i++){
            array[i]=myjilist.get(i);
        }
        for(int i=0;i<myoulist.size();i++){
            array[i+myjilist.size()]=myoulist.get(i);
        }

    }
}
