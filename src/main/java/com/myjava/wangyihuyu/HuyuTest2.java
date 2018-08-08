package com.myjava.wangyihuyu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/***
 *
 * 输入描述:
 * 输入的第一行为一个正整数T（T<=10），表示测试数据组数。
 * 接下来有T组数据。每组数据的第一行为一个正整数N（1<=N<=200），表示接收到信息的次数。第二行为N个正整数，按时间从先到后的顺序表示接收到信息的会话id。会话id不大于1000000000。
 *
 * 输出描述:
 * 对于每一组数据，输出一行，按会话列表从上到下的顺序，输出会话id。
 * 相邻的会话id以一个空格分隔，行末没有空格。
 */
public class HuyuTest2 {
    public static void main(String...args){
        Scanner in = new Scanner(System.in);
        int groudnum=in.nextInt();
        while (in.hasNextInt()){
            int idnum=in.nextInt();
            ArrayList<Integer> mylist=new ArrayList<Integer>();
            for (int i=0;i<idnum;i++){
                int id=in.nextInt();
                int index=mylist.indexOf(id);
                if(index==-1){
                    mylist.add(id);
                }
                else{
                    mylist.add(id);
                    mylist.remove(index);
                }
            }
            Collections.reverse(mylist);
            for(int i=0;i<mylist.size()-1;i++){
                System.out.print(mylist.get(i)+" ");
            }
            System.out.println(mylist.get(mylist.size()-1));
        }



    }
}
