package com.myjava.wangyihuyu;

import java.util.Scanner;

/**
 *在一个N*N的数组中寻找所有横，竖，左上到右下，右上到左下，四种方向的直线连续D个数字的和里面最大的值
 *输入描述:
 每个测试输入包含1个测试用例，第一行包括两个整数 N 和 D :
 3 <= N <= 100
 1 <= D <= N
 接下来有N行，每行N个数字d:
 0 <= d <= 100
 输出描述:
 输出一个整数，表示找到的和的最大值
 */
public class LeiHuoTest2 {
    public static void main(String...args){
        Scanner in=new Scanner(System.in);
        int weishu=in.nextInt();
        int len=in.nextInt();
        int[][] datalist=new int[weishu][weishu];//行、列
        int max=0;
        for(int i=0;i<weishu;i++){
            for(int j=0;j<weishu;j++){
                datalist[i][j]=in.nextInt();
                //System.out.println(datalist[i][j]);
            }
        }
        for(int xindex=0;xindex<weishu;xindex++){
            for(int yindex=0;yindex<weishu;yindex++){
                if(yindex<=weishu-len){//横
                    int newnum=0;
                    for(int k=0;k<len;k++){
                        newnum+=datalist[xindex][yindex+k];
                    }
                    if(newnum>max){
                        max=newnum;
                    }
                }
                if(xindex<=weishu-len){//竖
                    int newnum=0;
                    for(int k=0;k<len;k++){
                        newnum+=datalist[xindex+k][yindex];
                    }
                    if(newnum>max){
                        max=newnum;
                    }
                }
                if(xindex<=weishu-len&&yindex<=weishu-len){//左上到右下
                    int newnum=0;
                    for(int k=0;k<len;k++){
                        newnum+=datalist[xindex+k][yindex+k];
                    }
                    if(newnum>max){
                        max=newnum;
                    }
                }
                if(xindex>=len-1&&yindex<=weishu-len){//左下到右上
                    int newnum=0;
                    for(int k=0;k<len;k++){
                        newnum+=datalist[xindex-k][yindex+k];
                    }
                    if(newnum>max){
                        max=newnum;
                    }

                }

            }
        }
        System.out.println(max);
    }
}
