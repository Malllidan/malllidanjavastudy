package com.myjava.TestAbout;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HuaWeiTest1 {
    public static void main(String...args){
        Scanner in = new Scanner(System.in);
        int groudnum=in.nextInt();

        for(int i=0;i<groudnum;i++){
            int hang=in.nextInt();
            int lie=in.nextInt();
            char[][] mycharlist=new char[hang][lie];//迷阵
            int flag=0;

            for(int j=0;j<hang;j++){
                String myString=in.next();
                for(int k=0;k<lie;k++){
                    mycharlist[j][k]=myString.charAt(k);

                }
            }
            String myworkstr=in.next();
            int worklen=myworkstr.length();
            char[] mywork=new char[worklen];//单词
            for(int j=0;j<worklen;j++){
                mywork[j]=myworkstr.charAt(j);
            }
            for(int xindex=0;xindex<lie;xindex++){
                for(int yindex=0;yindex<hang;yindex++){
                    int charindex=0;
//                    if()
                    for(int f=0;f<worklen;f++){//向右
                        if(mywork[f]!=mycharlist[yindex][xindex+f]){
                            break;
                        }
                    }

                }

            }





        }



    }
}
