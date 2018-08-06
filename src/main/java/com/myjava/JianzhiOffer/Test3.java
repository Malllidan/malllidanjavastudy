package com.myjava.JianzhiOffer;

import sun.rmi.transport.Connection;
/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
import java.util.ArrayList;
import java.util.Collections;

public class Test3 {

    public static void main(String...args){
        ArrayList<Integer> mylist=new ArrayList<>(1);
        System.out.println(mylist);
    }




    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> mylist=new ArrayList<>(1);
        ListNode mylistnode=listNode;
        if(mylistnode==null) return mylist;
        while (mylistnode!=null){
              mylist.add(mylistnode.val);
              mylistnode=mylistnode.next;
        }
        Collections.reverse(mylist);
        return mylist;


    }
}


class ListNode {
       int val;
       ListNode next = null;
       ListNode(int val) {
           this.val = val;
       }
}

