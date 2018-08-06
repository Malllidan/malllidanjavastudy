package com.myjava.JianzhiOffer;

/***
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Test10 {
    public int RectCover(int target) {
       if(target==1){
           return 1;
       }
       int pre_pre=1;
       int pre=1;
       int now=0;
       for(int i=2;i<target+1;i++){
           now=pre+pre_pre;
           pre_pre=pre;
           pre=now;
       }
       return now;
    }
}
