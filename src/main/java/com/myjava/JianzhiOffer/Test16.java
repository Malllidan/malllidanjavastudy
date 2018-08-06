package com.myjava.JianzhiOffer;

/**
 *
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Test16 {


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
        ListNode head1=new ListNode(3);
        ListNode p11=new ListNode(4);
        ListNode p21=new ListNode(5);
        ListNode p31=new ListNode(6);
        ListNode p41=new ListNode(7);
        head1.next=p11;
        p11.next=p21;
        p21.next=p31;
        p31.next=p41;
        ListNode newhead=Merge(head,head1);
        while (newhead!=null){
            System.out.println(newhead.val);
            newhead=newhead.next;
        }
        int i;

    }
    public static ListNode Merge(ListNode list1,ListNode list2) {
        ListNode list1mid=list1;//先把头记录下来

        while (list2!=null){
            ListNode mid=null;
               list1=list1mid;
            while (list1!=null){
                if(list2.val>=list1.val){
                    mid=list1;
                    list1=list1.next;
                }
                else{
                    ListNode newnode=new ListNode(list2.val);
                    mid.next=newnode;
                    newnode.next=list1;
                    list2=list2.next;
                    break;
                }

            }
            if((list2!=null)&&list1==null){
                ListNode newnode=new ListNode(list2.val);
                mid.next=newnode;
                list2=list2.next;

            }


        }
        return list1mid;


    }
}
