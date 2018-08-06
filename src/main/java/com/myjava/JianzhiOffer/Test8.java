package com.myjava.JianzhiOffer;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * 一共跳n阶，第一次跳1阶，后面的方法为f（n-1），第一次跳2阶，后面的方法为f（n-2），所以跳n阶就是f（n）=f（n-1）+f（n-2） n=1 return1  n=2 return2
 *
 */
public class Test8 {

    public int JumpFloor(int target) {
        int n=target;
        if(n==1){
            return 1;
        }
        int pre_pre=1;
        int pre=1;
        int now=0;
        for(int i=2;i<n+1;i++){

            now=pre+pre_pre;
            pre_pre=pre;
            pre=now;
        }
        return now;
    }
}
