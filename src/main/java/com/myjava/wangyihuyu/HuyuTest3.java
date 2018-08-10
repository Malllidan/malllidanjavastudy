package com.myjava.wangyihuyu;

import java.util.Scanner;

public class HuyuTest3 {
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
                for(int yindex=0;yindex<hang;yindex++) {
                    int charindex = 0;
                    if (xindex<=lie-worklen) {//向右
                        for (int f = 0; f < worklen; f++) {
                            if (mywork[f] != mycharlist[yindex][xindex + f]) {
                                break;
                            }
                            if(f==worklen-1){
                                flag++;
                            }
                        }

                    }
                    if (yindex<=hang-worklen) {//向下
                        for (int f = 0; f < worklen; f++) {
                            if (mywork[f] != mycharlist[yindex+f][xindex]) {
                                break;
                            }
                            if(f==worklen-1){
                                flag++;
                            }
                        }

                    }
                    if (yindex<=hang-worklen&&xindex<=lie-worklen) {//邪向下
                        for (int f = 0; f < worklen; f++) {
                            if (mywork[f] != mycharlist[yindex+f][xindex+f]) {
                                break;
                            }
                            if(f==worklen-1){
                                flag++;
                            }
                        }

                    }

                }

            }
            System.out.println(flag);





        }



    }
}
