package com.myjava.JianzhiOffer;

/**
 *
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
public class Test20 {
    public static void main(String...args){
        Test20 mytest=new Test20();
        mytest.push(3);
        System.out.println(mytest.min());
        mytest.push(4);
        System.out.println(mytest.min());
        mytest.push(2);
        System.out.println(mytest.min());
        mytest.push(3);
        System.out.println(mytest.min());
        mytest.pop();
        System.out.println(mytest.min());
        mytest.pop();
        System.out.println(mytest.min());
        mytest.pop();
        System.out.println(mytest.min());
        mytest.push(0);
        System.out.println(mytest.min());

    }
    private Stack<Integer> mystack=new Stack<Integer>();
    private Stack<Integer> minStack=new Stack<Integer>();
    private Stack<Integer> midStack=new Stack<Integer>();
    private int min=0;




    public void push(int node) {
        if(mystack.empty()){
            min=node;
        }
        mystack.push(node);

        if(node<min){
            min=node;

        }



    }

    public void pop() {
        int node=mystack.peek();
        mystack.pop();
        if(node==min){
            min=mystack.peek();
            while (!mystack.empty()){
                int thisnode=mystack.peek();
                midStack.push(mystack.pop());

                if(thisnode<min){
                    min=thisnode;
                }

            }
            while (!midStack.empty()){
                mystack.push(midStack.pop());
            }
        }


    }

    public int top() {
        return mystack.peek();
    }

    public int min() {
        return min;

    }
}
