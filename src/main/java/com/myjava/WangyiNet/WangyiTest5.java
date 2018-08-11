package com.myjava.WangyiNet;

import java.util.Scanner;

/**
 *小易有一个长度为N的正整数数列A = {A[1], A[2], A[3]..., A[N]}。
 牛博士给小易出了一个难题:
 对数列A进行重新排列,使数列A满足所有的A[i] * A[i + 1](1 ≤ i ≤ N - 1)都是4的倍数。
 小易现在需要判断一个数列是否可以重排之后满足牛博士的要求。
 *
 * 4的倍数大于奇数即可，2不用管，因为2放到两侧靠近4的倍数就符合条件。
 */
public class WangyiTest5 {
    public static void main(String...args){
        Scanner in=new Scanner(System.in);
        int testnum=in.nextInt();
        for(int i=0;i<testnum;i++){
            int len=in.nextInt();
            int flag4=0;
            int flagji=0;
            for(int t=0;t<len;t++){
                int num=in.nextInt();
                if(num%4==0){
                    flag4++;
                }
                if(num%2==1){
                    flagji++;
                }

            }
            if(flag4>=flagji){
                System.out.println("Yes");
            }
//            else if(flag4==flagji&&flag4+flagji==len){
//                System.out.println("Yes");
//            }
            else {
                System.out.println("No");
            }


        }
    }
}
