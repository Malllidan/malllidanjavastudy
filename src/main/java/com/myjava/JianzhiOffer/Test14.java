package com.myjava.JianzhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Test14 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null){
            return null;
        }
        if(k==0){
            return null;
        }

        List<ListNode> mynodelist=new ArrayList<ListNode>();
        while (head!=null){
            mynodelist.add(head);
            head=head.next;
        }
        if(k<=mynodelist.size()) return mynodelist.get(mynodelist.size()-k);
        else return null;

    }
}

