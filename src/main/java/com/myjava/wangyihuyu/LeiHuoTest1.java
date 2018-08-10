package com.myjava.wangyihuyu;

import java.util.Scanner;

/**
 *给定一个字符串，请你将字符串重新编码，将连续的字符替换成“连续出现的个数+字符”。比如字符串AAAABCCDAA会被编码成4A1B2C1D2A。
 * 输入描述:
 * 每个测试输入包含1个测试用例
 * 每个测试用例输入只有一行字符串，字符串只包括大写英文字母，长度不超过10000。
 *
 *
 * 输出描述:
 * 输出编码后的字符串
 */
public class LeiHuoTest1 {
    public static void main(String...args){
        Scanner in = new Scanner(System.in);
        if(!in.hasNext()){
            System.out.print("");
        }
        else {

            String mystring = in.next();
            if (mystring.length() == 1) {
                System.out.print("1"+mystring);
            }
            else {
                int i = 0;
                char thischar = mystring.charAt(0);
                int flag=1;
                StringBuffer newstring=new StringBuffer();
                do {
                    char nextchar = mystring.charAt(i + 1);
                    if(nextchar==thischar){
                        flag++;
                    }
                    else{
                        newstring.append(flag);
                        newstring.append(thischar);
                        flag=1;

                    }
                    thischar=nextchar;
                    i++;

                } while (i < mystring.length() - 1);
                newstring.append(flag);
                newstring.append(thischar);
                System.out.print(newstring);
            }
        }
    }

}
