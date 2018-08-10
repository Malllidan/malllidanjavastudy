package com.myjava.wangyihuyu;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * 在一条无限长的跑道上，有N匹马在不同的位置上出发开始赛马。
 * 当开始赛马比赛后，所有的马开始以自己的速度一直匀速前进。
 * 每匹马的速度都不一样，且全部是同样的均匀随机分布。
 * 在比赛中当某匹马追上了前面的某匹马时，被追上的马就出局。
 * 请问按以上的规则比赛无限长的时间后，赛道上剩余的马匹数量的数学期望是多少
 *
 *思路：速度第一的马必然留下来，一匹马时概率是1，两匹马时，第二匹马要留下来，他的位置要在第一批马后面，所以概率是0.5，第三匹马要留下来，只能在最后一个位置，1/3,调和级数
 */
public class LeihuoTest4 {
    public static void main(String...args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        double num=0;
        for(double i=1.0;i<=n;i++){
            num+=1.0/i;
        }
        System.out.println(String.format("%.4f",num));
//        BigDecimal nuewnum=new BigDecimal(num);
//        System.out.println(nuewnum.setScale(4,BigDecimal.ROUND_HALF_UP).doubleValue());
    }

}
