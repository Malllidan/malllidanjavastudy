package com.myjava.JianzhiOffer;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class Test27 {
    public static void main(String...args){
        String mystr="abc";
        Test27 test=new Test27();
        ArrayList<String> newstr=test.Permutation(mystr);
        System.out.println(newstr);
    }
    ArrayList<String> mylist=new ArrayList<String>();

    public ArrayList<String> Permutation(String str) {
        if(str==null){
            return mylist;
        }
        char[] mycharlist=str.toCharArray();
        getMylist(mycharlist,0,mylist);
        Collections.sort(mylist);
        return mylist;
    }

    public void getMylist(char[] mycharlist,int i,ArrayList<String> mylist) {
        if (i == mycharlist.length - 1) {
            String newstr = String.valueOf(mycharlist);
            if (!mylist.contains(newstr)) {
                mylist.add(newstr);

            }
        }
        else {
            for(int j=i;j<mycharlist.length;j++){
                char tem=mycharlist[i];
                mycharlist[i]=mycharlist[j];
                mycharlist[j]=tem;
                getMylist(mycharlist,i+1,mylist);
                tem=mycharlist[i];
                mycharlist[i]=mycharlist[j];
                mycharlist[j]=tem;
            }
        }
    }


}
