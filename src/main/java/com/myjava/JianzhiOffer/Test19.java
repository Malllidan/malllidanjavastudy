package com.myjava.JianzhiOffer;

import java.util.ArrayList;
import java.util.List;

/***
 *
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Test19 {

    public static void main(String...ars){
        Test19 mytest=new Test19();
        int [][] matrix=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int [][] matrix1=new int[][]{{1,2},{3,4}};
        int [][] matrix2=new int[][]{{1},{2},{3},{4},{5}};
        ArrayList<Integer> mylist=mytest.printMatrix(matrix2);
        for(int i=0;i<mylist.size();i++){
            System.out.println(mylist.get(i));

        }
    }
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int leny=matrix.length;
        if(leny==0){
            return null;
        }
        int lenx=matrix[0].length;
        ArrayList<Integer> mylist=new ArrayList<Integer>(leny*lenx);
        int xindex=0;
        int yindex=0;
        int allindex=0;
        int flag=0;
        int num=0;//第几圈;
        //int jiouflag=(len+1)%2;
        while (allindex<lenx*leny){

            switch (flag){
                case 0:

                        mylist.add(matrix[yindex+num][xindex+num]);
                        xindex++;
                        allindex++;

                    if(xindex==lenx-2*num){
                        flag=1;
                        xindex=0;
                        continue;
                    }
                    break;
                case 1:

                        mylist.add(matrix[yindex+1+num][lenx-num-1]);
                        yindex++;
                        allindex++;

                    if(yindex==leny-2*num-1){
                        flag=2;
                        yindex=0;
                        continue;
                    }
                    break;
                case 2:


                        mylist.add(matrix[leny-num-1][lenx-xindex-2-num]);
                        xindex++;
                        allindex++;


                    if(xindex==lenx-2*num-1){
                        flag=3;
                        xindex=0;
                        continue;
                    }
                    break;
                case 3:


                        mylist.add(matrix[leny-num-yindex-2][num]);
                        allindex++;
                        yindex++;


                    if(yindex==leny-2*num-2){
                        flag=4;
                        yindex=0;
                    }
                    break;
                case 4:


                        num++;
                        flag=0;

                    break;
                default:
                    break;


            }


        }
        return mylist;

    }
}
