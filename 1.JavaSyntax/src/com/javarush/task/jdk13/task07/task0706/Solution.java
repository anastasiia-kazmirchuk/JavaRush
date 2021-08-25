package com.javarush.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улица и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[15];
        for (int i = 0; i < list.length ; i++) {
            String s  = reader.readLine();
            list[i] = Integer.parseInt(s);

         }
            int parne =0;
            int neparne=0;
        for (int i = 0; i < list.length; i++) {
            if( i %2==0){
                parne = parne+list[i];
            } else {
                neparne = neparne+list[i];
            }

        }
        if (parne>neparne){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
