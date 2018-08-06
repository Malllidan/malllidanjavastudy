package com.myjava.JianzhiOffer;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，
 * 完成队列的Push和Pop操作。 队列中的元素为int类型。
 * 队列：从后加入，先进先出
 */
public class Test5 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {//f返回
        if(!stack2.empty()){
            return stack2.pop();
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
