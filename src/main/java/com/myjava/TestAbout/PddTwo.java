package com.myjava.TestAbout;

import java.util.Scanner;

public class PddTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            String mystring = in.next();
        int index=0 ;
        for(int i=1;i<mystring.length();i++){
            String left=mystring.substring(0,i);
            String right=mystring.substring(i,mystring.length());
            //System.out.println("left:"+left+"right:"+right);
            //判断右是否合法，右合法再再拆左
            //System.out.print(Integer.valueOf(String.valueOf(right.charAt(0))));
            //System.out.println((right.charAt(0)+0!=0&&right.length()!=1));
            if(right.length()==1||(Integer.valueOf(String.valueOf(right.charAt(0)))!=0&&right.length()!=1)){
                //右肯定合法
//                for(int t=1;t<left.length();t++){
//                    String left_left=mystring.substring(0,t);//小数点左边
//                    String left_right=mystring.substring(t,left.length());//小数点右边
//                    if((Integer.valueOf(String.valueOf(left_left.charAt(0)))!=0&&left_left.length()!=1)||left_left.length()==1){
//                        //小数点左边合法
//                        if(left_right.length()==1||(left_right.length()!=1&&Integer.valueOf(String.valueOf(left_right.charAt(left_right.length()-1)))!=0)){
//                            index++;
//                        }
//                    }
//                }
                int t=1;
                do{
                    String left_left=left.substring(0,t);//小数点左边
                    if(left.length()==1){
                        index++;
                    }
                    else {
                        String left_right = left.substring(t, left.length());//小数点右边
                        if ((Integer.valueOf(String.valueOf(left_left.charAt(0))) != 0 && left_left.length() != 1) || left_left.length() == 1) {
                            //小数点左边合法
                            if (left_right.length() == 1 || (left_right.length() != 1 && Integer.valueOf(String.valueOf(left_right.charAt(left_right.length() - 1))) != 0)) {
                                index++;
                            }
                        }
                    }
                    t++;
                }while (t<left.length());
            }


            //判断左是否合法，合法再拆右。
            if(left.length()==1||(Integer.valueOf(String.valueOf(left.charAt(0)))!=0&&left.length()!=1)){
                //左肯定合法
                int t=1;
//                for(int t=1;t<right.length();t++){
//                    String right_left=mystring.substring(0,t);//小数点左边
//                    String right_right=mystring.substring(t,right.length());//小数点右边
//                    if((Integer.valueOf(String.valueOf(right_left.charAt(0)))!=0&&right_left.length()!=1)||right_left.length()==1){
//                        //小数点左边合法
//                        if(right_right.length()==1||(right_right.length()!=1&&Integer.valueOf(String.valueOf(right_right.charAt(right_right.length()-1)))!=0)){
//                            index++;
//                        }
//                    }
//                }
                do{
                    String right_left=right.substring(0,t);//小数点左边
                    if(right.length()==1){
                        index++;
                    }
                    else {
                        String right_right = right.substring(t, right.length());//小数点右边
                        if ((Integer.valueOf(String.valueOf(right_left.charAt(0))) != 0 && right_left.length() != 1) || right_left.length() == 1) {
                            //小数点左边合法
                            if (right_right.length() == 1 || (right_right.length() != 1 && Integer.valueOf(String.valueOf(right_right.charAt(right_right.length() - 1))) != 0)) {
                                index++;
                            }
                        }
                    }
                    t++;
                }while (t<right.length());
            }


            }
            System.out.print(index);
        }




        }
    }

