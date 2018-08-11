package com.myjava.WangyiNet;

import java.util.*;
//import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.max;

public class Wangyi20180811Test1 {
    public static void main(String...args){
                Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        int wakelen=in.nextInt();
        List<Integer> fenshu=new ArrayList<Integer>();
        List<Integer> Issleeplist=new ArrayList<Integer>();
        //List<Integer>
        int max=0;
        for(int i=0;i<len;i++){
            int fen=in.nextInt();
            fenshu.add(fen);

            //System.out.println(fen);
        }
        for(int i=0;i<len;i++){
            int go=in.nextInt();
            Issleeplist.add(go);
            //System.out.println(go);
        }

        for(int i=0;i<=len-wakelen;i++){
            int[]nummid=new int[wakelen];
            for(int k=0;k<wakelen;k++){
                nummid[k]=Issleeplist.get(i+k);
                if (Issleeplist.get(i+k)==0){
                    Issleeplist.set(i+k,1);
                }
            }
            int num=0;
            for(int t=0;t<len;t++){
                if(Issleeplist.get(t)==1){
                    num+=fenshu.get(t);
                }
            }
            if(num>max){
                max=num;
            }
            for(int k=0;k<wakelen;k++){

                if (Issleeplist.get(i+k)!=nummid[k]){
                    Issleeplist.set(i+k,nummid[k]);
                }
            }

        }
        System.out.println(max);
    }
//    public static void main(String...args){
//        Scanner in=new Scanner(System.in);
//        int len=in.nextInt();
//        int wakelen=in.nextInt();
//        List<Integer> fenshu=new ArrayList<Integer>();
//        List<Integer> Issleeplist=new ArrayList<Integer>();
//        List<Integer> mid=new ArrayList<Integer>();
//        for(int i=0;i<len;i++){
//            int fen=in.nextInt();
//            fenshu.add(fen);
//            mid.add(fen);
//            //System.out.println(fen);
//        }
//        for(int i=0;i<len;i++){
//            int go=in.nextInt();
//            Issleeplist.add(go);
//            //System.out.println(go);
//        }
//        int index=0;
//        int flag=0;
//        while (index<len){
//            int max=Collections.max(mid);
//            int newindex=fenshu.indexOf(max);
//            if(Issleeplist.get(newindex)==0&&newindex<=len-wakelen){
//                flag=fenshu.indexOf(max);
//                for(int k=0;k<wakelen;k++){
//                    if(Issleeplist.get(k+flag)==0){
//                        Issleeplist.set(k+flag,1);
//                    }
//                }
//                break;
//            }
//            else {
//                mid.remove(mid.indexOf(max));
//                index++;
//            }
//        }
//        int num=0;
//        for(int i=0;i<len;i++){
//            if(Issleeplist.get(i)==1){
//                num+=fenshu.get(i);
//            }
//        }
//        System.out.println(num);
//    }
}
