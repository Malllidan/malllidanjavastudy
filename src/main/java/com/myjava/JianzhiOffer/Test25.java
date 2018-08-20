package com.myjava.JianzhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点）
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class Test25 {
    public static void main(String...args){
        RandomListNode a1=new RandomListNode(1);
        RandomListNode a2=new RandomListNode(2);
        RandomListNode a3=new RandomListNode(3);
        a1.random=a3;
        a1.next=a2;
        a2.next=a3;
        RandomListNode mynode=Clone(a1);
        System.out.println(mynode);
    }
    public static RandomListNode Clone(RandomListNode pHead)
    {
      if(pHead==null){
          return null;
      }
      RandomListNode top=pHead;//记录头
      RandomListNode curNode;//复制的节点
      RandomListNode temp;
      while (pHead!=null){
          temp=pHead.next;
          curNode=new RandomListNode(pHead.label);
          pHead.next=curNode;
          curNode.next=temp;
          pHead=temp;
      }
      pHead=top;
      while (pHead!=null){
          curNode=pHead.next;
          if(pHead.random!=null){
          curNode.random=pHead.random.next;}
          pHead=pHead.next.next;
      }

      pHead=top;
        RandomListNode mid=pHead;
      curNode=pHead.next;
      top=curNode;
      while (curNode!=null){
          pHead.next=pHead.next.next;
          if(curNode.next!=null){
          curNode.next=curNode.next.next;}
          curNode=curNode.next;
          pHead=pHead.next;
      }
      return top;
    }
}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
