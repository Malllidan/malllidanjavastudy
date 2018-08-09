package com.myjava.HuyuTest;

import org.omg.PortableInterceptor.INACTIVE;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;

public class HuyuTest3 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int testnum=sc.nextInt();
        for(int testi=0;testi<testnum;testi++){
            int jihuanum=sc.nextInt();//一周有几个计划
            Map<Integer,List<String>> jihua=new TreeMap<Integer, List<String>>();
            for(int jihuai=0;jihuai<jihuanum;jihuai++){
                int day=sc.nextInt();//星期几
                int daynum=sc.nextInt();//星期几的计划数
                List<String> daylist=new ArrayList<String>();
                for(int daynumi=0;daynumi<daynum;daynum++){
                    String timestr=sc.next();
                    daylist.add(timestr);
                }
                jihua.put(day,daylist);
            }
            List<Map.Entry<Integer,List<String>>> maplist = new ArrayList<Map.Entry<Integer,List<String>>>(jihua.entrySet());

            int palynum=sc.nextInt();//玩几次
            //Map<Integer,String> playgroud=new LinkedHashMap<Integer, String>();
            for(int playi=0;playi<palynum;playi++){
                int day=sc.nextInt();
                String  timestr=sc.next();
                int time=timejisuan(timestr);
                int flag=0;
                for (int k=0;k<maplist.size();k++) {
                    Map.Entry<Integer,List<String>> entry=maplist.get(k);
                    int jihuaday=entry.getKey();
                    if(day==jihuaday){
                       List<String> daylist=entry.getValue();
                       for(int i=0;i<daylist.size();i++){
                          int timestart=timejisuan(daylist.get(i).substring(0,8));
                          int timeend=timejisuan(daylist.get(i).substring(9,17));
                          if(time>=timestart&&time<=timeend){
                              System.out.println(0);
                              flag=1;

                          }

                       }
                    }

                }
                if(flag==0){
                    for (int k=0;k<maplist.size();k++) {
                        Map.Entry<Integer, List<String>> entry = maplist.get(k);
                        int jihuaday = entry.getKey();
                        if(k!=maplist.size()-1){

                        if (day == jihuaday) {
                            List<String> nextdaylist = entry.getValue();
                            for (int t = 0; t < nextdaylist.size(); t++) {
                                int nexttimeend = timejisuan(nextdaylist.get(t).substring(9, 17));
                                if (time > nexttimeend) {
                                    if (t != nextdaylist.size() - 1) {
                                        System.out.println(timejisuan(nextdaylist.get(t + 1).substring(0, 8)) - time);
                                    } else {
                                        int nexttimestart = timejisuan(maplist.get(k+1).getValue().get(0).substring(0,8));
                                        System.out.println(maplist.get(k+1).getKey()*24*3600+nexttimestart-(day*24*3600+time));
                                    }
                                }
                            }

                        }
                    }
                    else {
                            if (day == jihuaday) {
                                List<String> nextdaylist = entry.getValue();
                                for (int t = 0; t < nextdaylist.size(); t++) {
                                    int nexttimeend = timejisuan(nextdaylist.get(t).substring(9, 17));
                                    if (time > nexttimeend) {
                                        if (t != nextdaylist.size() - 1) {
                                            System.out.println(timejisuan(nextdaylist.get(t + 1).substring(0, 8)) - time);
                                        } else {
                                            int nexttimestart = timejisuan(maplist.get(0).getValue().get(0).substring(0,8));
                                            System.out.println(maplist.get(k+1).getKey()*24*3600+nexttimestart-(day*24*3600+time)+7*24*3600);
                                        }
                                    }
                                }

                            }
                        }

                    }
                }

            }


        }
    }
    private static int timejisuan(String timestr){
        int hour=Integer.valueOf(timestr.substring(0,2));
        int min=Integer.valueOf(timestr.substring(3,5));
        int se=Integer.valueOf(timestr.substring(6,8));
        return hour*3600+min*60+se;
    }
}
