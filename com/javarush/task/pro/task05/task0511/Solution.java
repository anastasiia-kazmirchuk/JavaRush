package com.javarush.task.pro.task05.task0511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Создаем двумерный массив
Создаем двумерный массив
Двумерный массив — это массив массивов, то есть в каждой его ячейке находится ссылка на некий массив. Но гораздо проще его представить в виде таблицы, у которой задано количество строк (первое измерение) и количество столбцов (второе измерение). В этой задаче мы будем создавать такой массив.

Для этого реализуй метод main(String[]), который:

Считывает из консоли число N — количество строк массива. Число должно быть больше 0.
Потом считывает N чисел из консоли (любые числа больше 0).
Затем инициализирует двумерный массив multiArray:
количеством строк N;
строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода).
Пример:

Введено число 5.
Введены числа 1, 7, 5, 9, 3.
Получаем такой массив:
[]
[][][][][][][]
[][][][][]
[][][][][][][][][]
[][][]
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int n;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bufferedReader.readLine());
        multiArray = new int[n][];
        for (int i = 0; i < n; i++) {
            multiArray[i] = new int[Integer.parseInt(bufferedReader.readLine())];
        }
    }
}
