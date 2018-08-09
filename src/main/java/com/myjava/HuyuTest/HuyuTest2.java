package com.myjava.HuyuTest;

import java.util.*;

public class HuyuTest2 {

        public static void main(String... args) {
            Scanner sc = new Scanner(System.in);
            int namelen = sc.nextInt();
            Map<String,Integer> namegroud=new HashMap<String, Integer>();
            List<String> offshowlist=new ArrayList<String>();//屁股表示头
            List<String> onshowlist=new ArrayList<String>();//屁股表示头

            for(int i=0;i<namelen;i++){
                int level=sc.nextInt();
                String name=sc.next();
                //System.out.println(level+name);
                namegroud.put(name,level);

                offshowlist.add(name);
            }
            int actionlen=sc.nextInt();
            Collections.reverse(offshowlist);
            for(int i=0;i<actionlen;i++){
                String nmae=sc.next();
                int action=sc.nextInt();
                if(action==1){
                    onshowlist.add(offshowlist.remove(offshowlist.indexOf(nmae)));
                }
                else if (action==0){
                    offshowlist.add(onshowlist.remove(onshowlist.indexOf(nmae)));
                }
            }
            for(int i=0;i<offshowlist.size();i++){
                for(int j=0;j<offshowlist.size()-1-i;j++){
                    if(namegroud.get(offshowlist.get(j))>namegroud.get(offshowlist.get(j+1))){
                        //等级比较高
                        String mid=offshowlist.get(j);
                        offshowlist.set(j,offshowlist.get(j+1));
                        offshowlist.set(j+1,mid);
                    }
                    else if(namegroud.get(offshowlist.get(j)).equals(namegroud.get(offshowlist.get(j+1)))){
                        if(offshowlist.get(j).compareTo(offshowlist.get(j+1))<0){
                            String mid=offshowlist.get(j);
                            offshowlist.set(j,offshowlist.get(j+1));
                            offshowlist.set(j+1,mid);
                        }
                    }
                }
            }
            for(int i=0;i<onshowlist.size();i++){
                for(int j=0;j<onshowlist.size()-1-i;j++){
                    if(namegroud.get(onshowlist.get(j))>namegroud.get(onshowlist.get(j+1))){
                        //等级比较高
                        String mid=onshowlist.get(j);
                        onshowlist.set(j,onshowlist.get(j+1));
                        onshowlist.set(j+1,mid);
                    }
                    else if(namegroud.get(onshowlist.get(j)).equals(namegroud.get(onshowlist.get(j+1)))){
                        if(onshowlist.get(j).compareTo(onshowlist.get(j+1))<0){
                            String mid=onshowlist.get(j);
                            onshowlist.set(j,onshowlist.get(j+1));
                            onshowlist.set(j+1,mid);
                        }
                    }
                }
            }
            for(int i=onshowlist.size()-1;i>=0;i--){
                System.out.println(onshowlist.get(i));
            }
            for(int i=offshowlist.size()-1;i>=0;i--){
                System.out.println(offshowlist.get(i));
            }
        }
}

