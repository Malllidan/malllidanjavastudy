package com.myjava.JianzhiOffer;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * f(n)=f(n-1)+-.......f(0)
 */
public class Test9 {

    public static void main(String...args){
        System.out.println(JumpFloorII(3));
    }
    public static int JumpFloorII(int target) {
       if(target==1){
           return 1;
       }
       if(target==2){
           return 2;
       }

       int a=JumpFloorII(1);
       for(int i=1;i<target;i++){
           a+=JumpFloorII(i);
       }
       return a;
    }
}
