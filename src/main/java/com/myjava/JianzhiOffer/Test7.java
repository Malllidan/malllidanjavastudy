package com.myjava.JianzhiOffer;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 n<=39
 */
public class Test7 {

    public static void main(String...args){
        System.out.println(Fibonacci1(6));
    }

    public static int  Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1||n==2){
            return 1;
        }
        return Fibonacci(n-2)+Fibonacci(n-1);

    }//递归版本
    public static int  Fibonacci1(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int pre_pre=0;
        int pre=1;
        int now=0;
        for(int i=2;i<n+1;i++){

            now=pre+pre_pre;
            pre_pre=pre;
            pre=now;
        }
    return now;
    }//非递归版本
//    protected int Fibonaccinew(int n){
//
//    }

}
