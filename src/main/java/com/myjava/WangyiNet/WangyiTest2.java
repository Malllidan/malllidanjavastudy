package com.myjava.WangyiNet;

import java.util.Scanner;

/**
 *为了得到一个数的"相反数",我们将这个数的数字顺序颠倒,然后再加上原先的数得到"相反数"。
 * 例如,为了得到1325的"相反数",首先我们将该数的数字顺序颠倒,我们得到5231,之后再加上原先的数,
 * 我们得到5231+1325=6556.如果颠倒之后的数字有前缀零,前缀零将会被忽略。例如n = 100, 颠倒之后是1.
 *输入描述:
 输入包括一个整数n,(1 ≤ n ≤ 10^5)


 输出描述:
 输出一个整数,表示n的相反数

 */
public class WangyiTest2 {
    public static void main(String...args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        String numstr=String.valueOf(num);
        StringBuffer newnumstr=new StringBuffer();
        for(int i=numstr.length()-1;i>=0;i--){
            newnumstr.append(numstr.charAt(i));
        }
        int newnum=num+Integer.valueOf(newnumstr.toString());
        //System.out.println(newnum);
        String endstr=String.valueOf(newnum);
        StringBuffer endnumstr=new StringBuffer();
        for(int i=0;i<endstr.length();i++){
            endnumstr.append(endstr.charAt(i));
        }

        while (endnumstr.length()!=0){
            if(endnumstr.charAt(endnumstr.length()-1)==0){
                endnumstr.deleteCharAt(endnumstr.length()-1);
            }
            break;
        }
        System.out.println(endnumstr.toString());
    }
}
