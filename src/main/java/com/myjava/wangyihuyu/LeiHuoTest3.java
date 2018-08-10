package com.myjava.wangyihuyu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *每个测试输入包含1个测试用例
 第一行输入两个数字N，M表示地图的大小。其中0<N，M<=8。
 接下来有N行，每行包含M个字符表示该行地图。其中 . 表示空地、X表示玩家、*表示箱子、#表示障碍、@表示目的地。
 每个地图必定包含1个玩家、1个箱子、1个目的地。


 输出描述:
 输出一个数字表示玩家最少需要移动多少步才能将游戏目标达成。当无论如何达成不了的时候，输出-1。
 *
 */
public class LeiHuoTest3 {



    public static void main(String...args){
        Scanner in=new Scanner(System.in);
        int hang=in.nextInt();
         int lie=in.nextInt();
        char[][] datalist=new char[hang][lie];
        int[][][][] state=new int[hang][lie][hang][lie];
        int  manx=0,many=0,boxx=0,boxy=0,endx=0,endy=0;
        for(int i=0;i<hang;i++){
            String  myString=in.next();
            for(int j=0;j<lie;j++){
                datalist[i][j]=myString.charAt(j);
                if(myString.charAt(j)=='*'){
                    boxx=i;
                    boxy=j;
                }
                else if(myString.charAt(j)=='@'){
                    endx=i;
                    endy=j;
                }
                else if(myString.charAt(j)=='X'){
                    manx=i;
                    many=j;
                }
                //System.out.println(myString.charAt(j));
            }
        }
        System.out.println(BFS(hang,lie,datalist,state,manx,many,boxx,boxy,endx,endy));

    }

    private static int BFS(int hang,int lie,  char[][] datalist,  int[][][][] state, int  manx,int many,int boxx,int boxy,int endx,int endy){
        List<point> pointlist=new ArrayList<point>();
        int[][] moves=new int[][]{{0,1},{0,-1},{-1,0},{1,0}};
        state[manx][many][boxx][boxy]=1;
        point temp=new point(boxx,boxy,manx,many);
        pointlist.add(temp);
        while (!pointlist.isEmpty()){
            temp=pointlist.get(0);
            pointlist.remove(0);
            if(temp.boxx==endx&&temp.boxy==endy){
                //System.out.println(state[temp.manx][temp.many][temp.boxx][temp.boxy]-1);
                return state[temp.manx][temp.many][temp.boxx][temp.boxy]-1;

            }
            for(int i=0;i<4;i++){//更新人的位置
                int nowmanx=temp.manx+moves[i][0];
                int nowmany=temp.many+moves[i][1];
                if(bound(nowmanx,nowmany,hang,lie,datalist)){
                    continue;
                }
                if(nowmanx==temp.boxx&&nowmany==temp.boxy){//假如推倒了箱子
                    if(bound(temp.boxx+moves[i][0],temp.boxy+moves[i][1],hang,lie,datalist)){
                        continue;
                    }
                    state[nowmanx][nowmany][temp.boxx+moves[i][0]][temp.boxy+moves[i][1]]=state[temp.manx][temp.many][temp.boxx][temp.boxy]+1;
                    pointlist.add(new point(temp.boxx+moves[i][0],temp.boxy+moves[i][1],nowmanx,nowmany));
                }
                else{
                    if(state[nowmanx][nowmany][temp.boxx][temp.boxy]!=0){
                            //转改出现过，重新搜索方向。
                        continue;
                    }
                    state[nowmanx][nowmany][temp.boxx][temp.boxy]=state[temp.manx][temp.many][temp.boxx][temp.boxy]+1;
                    pointlist.add(new point(temp.boxx,temp.boxy,nowmanx,nowmany));
                }

            }

        }
        return -1;


    }

    private static boolean bound(int x,int y,int hang,int lie, char[][] datalist){
        if(x<0||y<0||x>=hang||y>=lie||datalist[x][y]=='#'){
            return true;
        }
        return false;
    }



}
class point{
    public int boxx;
    public int boxy;
    public int manx;
    public int many;
    public point(int boxx,int boxy,int manx,int many){
        this.boxx=boxx;
        this.boxy=boxy;
        this.manx=manx;
        this.many=many;
    }
}