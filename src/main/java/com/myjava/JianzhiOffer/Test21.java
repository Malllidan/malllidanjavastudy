package com.myjava.JianzhiOffer;
import java.util.ArrayList;

/**
 *输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 *
 */
public class Test21 {
    public static void main(String...args){
        int [] pushA=new int[]{1,2,3,4,5};
        int [] popA=new int[]{4,5,3,2,1};
        int [] popA1=new int[]{4,3,5,1,2};
        int [] popA2=new int[]{3,5,4,2,1};
        System.out.println(IsPopOrder(pushA,popA2));
    }



    public static boolean IsPopOrder(int [] pushA,int [] popA) {
            if(pushA.length==0) {
                return false;
            }
            ArrayList<Integer> mylist=new ArrayList<Integer>();
            int pushindex=0;
            int popindex=0;

            while (pushindex!=pushA.length&&popindex!=popA.length){
                int pushnode=pushA[pushindex];
                int popnode=popA[popindex];
                mylist.add(pushnode);//还没到pop点就压入。
                pushindex++;
                if(pushnode!=popnode){


                }
                else{
                    if(!mylist.isEmpty()){
                        mylist.remove(mylist.size()-1);
                        popindex++;
                    }


                }
            }
            if(mylist.isEmpty()){
                return true;
            }
            for(int i=pushindex-popindex-1;i>=0;i--){
                if(pushA[i]==mylist.get(i)){
                    mylist.remove(i);
                }
            }
        if(mylist.isEmpty()){
            return true;
        }
        return false;
    }

}
