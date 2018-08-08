package com.myjava.wangyihuyu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * 每个输入数据包含多个测试点。每个测试点后有一个空行。
 * 第一行为测试点的个数T(T<=100)。 每个测试点包含1行，为一个字符串”HH:MM:SS”，表示钟表显示的时间。

 * 对于每个测试点，输出一行。如果钟表显示的时间为真实存在的时间，
 * 则不做改动输出该时间，否则输出一个新的”HH:MM:SS”，表示修改最少的数字情况下，字典序最小的真实存在的时间。
 *
 */
public class HuyuTest1 {

    public static void main(String...args){
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();

        //List<String> mystringlist=new ArrayList<String>();
        while (in.hasNext()){
            String mystring=in.next();
           // mystringlist.add(mystring);
            String hour=mystring.substring(0,2);
            String min=mystring.substring(3,5);
            String se=mystring.substring(6,8);
            if(Integer.valueOf(hour)>23){
                hour="0"+hour.charAt(1);
            }
            if(Integer.valueOf(min)>59){
               min="0"+min.charAt(1);
            }
            if(Integer.valueOf(se)>59){
                se="0"+se.charAt(1);
            }
            mystring=hour+":"+min+":"+se;



            System.out.println(mystring);
        }


    }
}
