package com.javarush.task.jdk13.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строк в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        for (int i = 0; i <=7; i++)
        {
            list[i] = reader.readLine();
        }
        for (int i = 9; i >=0; i--) {
            System.out.println(list[i]);


        }
    }
}