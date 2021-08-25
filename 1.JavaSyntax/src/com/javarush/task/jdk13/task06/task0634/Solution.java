package com.javarush.task.jdk13.task06.task0634;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Шахматная доска
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bufferedReader.readLine());

        array = new char[size][size];
        for (int i = 0; i< array.length; i++){
            for(int j = 0; j< array[i].length; j++){
                if ((i+j) %2 !=0 ){
                    array[i][j]= ' ';
                }
                else {
                    array[i][j] = '#';
                }
            }
        }
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length; j++){

                System.out.print(array[i][j]);
            }
            System.out.println();

        }

    }
}
