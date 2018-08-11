package com.myjava.WangyiNet;
/**
 *一个合法的括号匹配序列被定义为:
 1. 空串""是合法的括号序列
 2. 如果"X"和"Y"是合法的序列,那么"XY"也是一个合法的括号序列
 3. 如果"X"是一个合法的序列,那么"(X)"也是一个合法的括号序列
 4. 每个合法的括号序列都可以由上面的规则生成
 例如"", "()", "()()()", "(()())", "(((()))"都是合法的。
 从一个字符串S中移除零个或者多个字符得到的序列称为S的子序列。
 例如"abcde"的子序列有"abe","","abcde"等。
 定义LCS(S,T)为字符串S和字符串T最长公共子序列的长度,即一个最长的序列W既是S的子序列也是T的子序列的长度。
 小易给出一个合法的括号匹配序列s,小易希望你能找出具有以下特征的括号序列t:
 1、t跟s不同,但是长度相同
 2、t也是一个合法的括号匹配序列
 3、LCS(s, t)是满足上述两个条件的t中最大的
 因为这样的t可能存在多个,小易需要你计算出满足条件的t有多少个。
 *
 *
 *因为t是自定义的，符合条件t最大的必然是提取了一个字符然后插入各个位置。
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class WangyiTest6 {
    public static void main(String...args) {
        Scanner in = new Scanner(System.in);
        String mystring = in.next();
        char[] charlist = mystring.toCharArray();
        Map<String,Integer> map=new HashMap<String, Integer>();
        for(int i=0;i<charlist.length;i++){
            String s1=mystring.substring(0,i);
            String s2=mystring.substring(i+1,charlist.length);
            String news=s1+s2;
            for(int j=0;j<charlist.length;j++){
                String news1=news.substring(0,j);
                String news2=news.substring(j,charlist.length-1);
                String newSrting=news1+String.valueOf(mystring.charAt(i))+news2;
                if(!newSrting.equals(mystring)){
                    char[] newcharlist=newSrting.toCharArray();
                    Stack<Character> mystack=new Stack<Character>();
                    for(int t=0;t<newcharlist.length;t++){
                        char thischar=newcharlist[t];
                        if(mystack.isEmpty()){

                                mystack.push(thischar);

                        }
                        else{
                            if(thischar=='('){
                                mystack.push(thischar);
                            }
                            else {
                                mystack.pop();
                            }
                        }
                    }
                    if(mystack.isEmpty()){
                        map.put(newSrting,1);
                }
            }
        }


    }
    System.out.println(map.size());
    }

}
