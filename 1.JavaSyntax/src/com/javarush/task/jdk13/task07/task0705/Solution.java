package com.javarush.task.jdk13.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayBig = new int[20];
        for (int i = 0; i < arrayBig.length; i++) {
            String s = reader.readLine();
            arrayBig[i] = Integer.parseInt(s);

        }
        int[] arrayLittle1 = new int[10];
        int[] arrayLittle2 = new int[10];
        for (int i = 0; i <= 9; i++) {
            arrayLittle1[i]=arrayBig[i];

        }
        for (int i = 10; i <=19; i++) {
            arrayLittle2[i-10]=arrayBig[i];

        }
        for (int i = 0; i <= 9; i++) {
            System.out.println(arrayLittle2[i]);

        }
    }
}
