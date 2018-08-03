package com.myjava.ListAbout;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 对比两种列表set、get、remove、add的速度
 */
public class ArrayLinked {
    public static void main(String[] args){
        List<Integer> myArraylist=new ArrayList<Integer>();
        List<Integer> myLinkedlist=new LinkedList<Integer>();

        long startTime=System.nanoTime();   //获取开始时间
        for(int i=0;i<100;i++){
            myArraylist.add(i+1);
        }
        long endTime=System.nanoTime(); //获取结束时间
        System.out.println("ArrayList添加操作程序运行时间： "+(endTime-startTime)+"ns");

        startTime=System.nanoTime();   //获取开始时间
        myArraylist.remove(49);
        endTime=System.nanoTime(); //获取结束时间
        System.out.println("ArrayList删除操作程序运行时间： "+(endTime-startTime)+"ns");

        startTime=System.nanoTime();   //获取开始时间
        myArraylist.get(80);
        endTime=System.nanoTime(); //获取结束时间
        System.out.println("ArrayList get操作程序运行时间： "+(endTime-startTime)+"ns");

        startTime=System.nanoTime();   //获取开始时间
        myArraylist.set(80,999);
        endTime=System.nanoTime(); //获取结束时间
        System.out.println("ArrayList set操作程序运行时间： "+(endTime-startTime)+"ns");





         startTime=System.nanoTime();   //获取开始时间
        for(int i=0;i<100;i++){
            myLinkedlist.add(i+1);
        }
         endTime=System.nanoTime(); //获取结束时间
        System.out.println("LinkedList添加操作程序运行时间： "+(endTime-startTime)+"ns");

        startTime=System.nanoTime();   //获取开始时间
        myLinkedlist.remove(49);
        endTime=System.nanoTime(); //获取结束时间
        System.out.println("LinkedList删除操作程序运行时间： "+(endTime-startTime)+"ns");

        startTime=System.nanoTime();   //获取开始时间
        myLinkedlist.get(80);
        endTime=System.nanoTime(); //获取结束时间
        System.out.println("LinkedList get操作程序运行时间： "+(endTime-startTime)+"ns");

        startTime=System.nanoTime();   //获取开始时间
        myLinkedlist.set(80,999);
        endTime=System.nanoTime(); //获取结束时间
        System.out.println("LinkedList set操作程序运行时间： "+(endTime-startTime)+"ns");




    }
}
