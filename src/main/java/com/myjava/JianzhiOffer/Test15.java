package com.myjava.JianzhiOffer;

/**
 *输入一个链表，反转链表后，输出新链表的表头
 *
 */
public class Test15 {
    public static void main(String...args){
        ListNode head=new ListNode(1);
        ListNode p1=new ListNode(2);
        ListNode p2=new ListNode(3);
        ListNode p3=new ListNode(4);
        ListNode p4=new ListNode(5);
        head.next=p1;
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        ListNode newhead=ReverseList(head);
        while (newhead!=null){
            System.out.println(newhead.val);
            newhead=newhead.next;
        }
        int i;

    }



    public static ListNode ReverseList(ListNode head) {
        ListNode pre=null;
        ListNode now=head;//A
        //ListNode next=head.next;
        while (now!=null){
            ListNode mid=now.next;//先记录a的nextb

            now.next=pre;//把a往回直
            pre=now;
            now=mid;
        }
        return pre;

    }
}
