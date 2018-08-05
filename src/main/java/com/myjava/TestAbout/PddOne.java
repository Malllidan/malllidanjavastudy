package com.myjava.TestAbout;

import java.util.Scanner;

public class PddOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            String mystring = in.next();
        //System.out.println(mystring);
        int weishu=mystring.length()/4+1;
        for(int i=0;i<weishu;i++){

            if(i==weishu-1){
                System.out.println(mystring.charAt(i));
            }
            else {
                System.out.print(mystring.charAt(i));}
        }
        for(int i=0;i<weishu-2;i++) {
            System.out.print(mystring.charAt(mystring.length()-1-i));

            for (int j = 0; j < weishu - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(mystring.charAt(weishu+i));
        }
        for(int i=3*weishu-3;i>=2*weishu-2;i--){
            System.out.print(mystring.charAt(i));
        }



        }


        }
    }

