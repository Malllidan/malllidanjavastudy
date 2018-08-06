package com.myjava.JianzhiOffer;

/**
 *
 *给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Test12 {
    public double Power(double base, int exponent) {
        double num = base;
        double mid = 1;
        if (exponent == 0) {
            return 1.0;
        }
        else if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                mid = mid * base;
            }
            return mid;
        }
        else if(exponent<0){
            int newexponent=0-exponent;
            for(int i = 0; i < newexponent; i++){
                mid=mid*base;
            }
            return 1.0/mid;
        }
        return 1.0;
    }
    }

