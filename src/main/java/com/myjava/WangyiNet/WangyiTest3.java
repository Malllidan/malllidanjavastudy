package com.myjava.WangyiNet;

import java.util.*;

public class WangyiTest3 {
        public static void main(String...args){
        Scanner in=new Scanner(System.in);
        String mystring=in.next();
        int index=1;
        int flag=1;
        char thischar=mystring.charAt(0);
        List<Integer> mylist=new ArrayList<Integer>();
        do{
            char nextchar=mystring.charAt(index);
            if(nextchar==thischar){
                flag++;
            }
            else {

                int flag2=0;
                mylist.add(flag);
                flag=1;
                thischar=nextchar;
            }

            index++;


        }while (index<mystring.length());
       mylist.add(flag);
        float outnum=0;
        float len=0;
        for(int i=0;i<mylist.size();i++){
            outnum+=mylist.get(i);
        }
        System.out.println(String.format("%.2f",outnum/mylist.size()));

    }//该程序3a会覆盖掉2a
//    public static void main(String...args){
//        Scanner in=new Scanner(System.in);
//        String mystring=in.next();
//        int index=1;
//        int flag=1;
//        char thischar=mystring.charAt(0);
//        Map<String,Integer> map=new HashMap<String, Integer>();
//        do{
//            char nextchar=mystring.charAt(index);
//            if(nextchar==thischar){
//                flag++;
//            }
//            else {
//
//                int flag2=0;
//                if(!map.isEmpty()){
//                for(Map.Entry<String,Integer> entry:map.entrySet()){
//                    if(entry.getKey()==String.valueOf(thischar)){
//                        if(flag>entry.getValue()){
//                            map.put(entry.getKey(),flag);
//                            flag2=1;
//
//                        }
//                    }
//                }
//                    if(flag2==0){
//                        map.put(String .valueOf(thischar),flag);
//                    }
//                }
//                else
//                {
//                    map.put(String .valueOf(thischar),flag);
//                }
//                flag=1;
//                thischar=nextchar;
//            }
//
//            index++;
//
//
//        }while (index<mystring.length());
//        int flag2=0;
//        if(!map.isEmpty()){
//            for(Map.Entry<String,Integer> entry:map.entrySet()){
//                if(entry.getKey()==String.valueOf(thischar)){
//                    if(flag>entry.getValue()){
//                        map.put(entry.getKey(),flag);
//                        flag2=1;
//                        break;
//                    }
//                }
//
//            }
//            if(flag2==0){
//                map.put(String .valueOf(thischar),flag);
//            }
//        }
//        else
//        {
//            map.put(String .valueOf(thischar),flag);
//        }
//        float outnum=0;
//        float len=0;
//        for(Map.Entry<String,Integer> entry:map.entrySet()){
//            outnum+=entry.getValue();
//            len++;
//        }
//        System.out.println(String.format("%.2f",outnum/len));
//
//    }//该程序3a会覆盖掉2a
}
