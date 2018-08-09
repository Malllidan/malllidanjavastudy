package com.myjava.HuyuTest;

import java.util.Scanner;

public class HuyuTest1 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            int money=sc.nextInt();
            if(money<=5000){
                System.out.println(0);
            }
            if(money>5000&&money<=8000){
                int shui=Math.round((money-5000)*0.03f);
                System.out.println(shui);
            }
            if(money>8000&&money<=17000){
                int shui=Math.round((8000-5000)*0.03f+(money-8000)*0.1f);
                System.out.println(shui);
            }
            if(money>17000&&money<=30000){
                int shui=Math.round((8000-5000)*0.03f+(17000-8000)*0.1f+(money-17000)*0.2f);
                System.out.println(shui);
            }
            if(money>30000&&money<=40000){
                int shui=Math.round((8000-5000)*0.03f+(17000-8000)*0.1f+(30000-17000)*0.2f+(money-30000)*0.25f);
                System.out.println(shui);
            }
            if(money>40000&&money<=60000){
                int shui=Math.round((8000-5000)*0.03f+(17000-8000)*0.1f+(30000-17000)*0.2f+(40000-30000)*0.25f+(money-40000)*0.3f);
                System.out.println(shui);
            }
            if(money>60000&&money<=85000){
                int shui=Math.round((8000-5000)*0.03f+(17000-8000)*0.1f+(30000-17000)*0.2f+(40000-30000)*0.25f+(60000-40000)*0.3f+(money-60000)*0.35f);
                System.out.println(shui);
            }
            if(money>85000){
                int shui=Math.round((8000-5000)*0.03f+(17000-8000)*0.1f+(30000-17000)*0.2f+(40000-30000)*0.25f+(60000-40000)*0.3f+(85000-60000)*0.35f+(money-85000)*0.45f);
                System.out.println(shui);
            }

        }

    }
}
