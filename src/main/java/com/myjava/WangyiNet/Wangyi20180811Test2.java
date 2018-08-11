package com.myjava.WangyiNet;

import java.util.*;

public class Wangyi20180811Test2 {
 public static void main(String...args){
     Scanner in=new Scanner(System.in);
     int treelen=in.nextInt();
     //int[] tree=new int[treelen];
     List<Integer> mylist=new ArrayList<Integer>();
     int num=0;
     mylist.add(num);
     for(int i=0;i<treelen;i++){
        // tree[i]=in.nextInt();
         num+=in.nextInt();
         mylist.add(num);


     }
     int applenum=in.nextInt();
     for(int i=0;i<applenum;i++){
         int thisappple=in.nextInt();
         for(int k=0;k<treelen;k++){
             if(thisappple>mylist.get(k)&&thisappple<=mylist.get(k+1)){
                 System.out.println(k+1);
                 break;

             }
             }
         }



         }



 }

