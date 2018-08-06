package com.myjava.JianzhiOffer;

import javax.print.attribute.standard.NumberOfDocuments;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * Integer.toBinaryString(n)负数为补码。
 */

public class Test11 {
    public static void main(String ...args){
        System.out.println(NumberOf1(-2));
    }
    public static int NumberOf1(int n) {
        int index=0;
        String myString=Integer.toBinaryString(n);
        System.out.println(myString);
        if(n==0){
            return 0;
        }
        else if(n>0){

            for(int i=0;i<myString.length();i++){
                if(myString.charAt(i)=='1'){
                    index++;
                }
            }

        }
        else if(n<0){
            for(int i=0;i<myString.length();i++){
                if(myString.charAt(i)=='1'){
                    index++;
                }
            }


        }
        return index;//api写法
    }
}
