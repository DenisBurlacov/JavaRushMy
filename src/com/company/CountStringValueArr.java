package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/*Два массива
        Создать массив на 10 строк.
        Создать массив на 10 чисел.
        Ввести с клавиатуры 10 строк, заполнить ими массив строк.
        В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает
        с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить
        с новой строки.

        Requirements:
        1. Программа должна создавать массив и инициализировать его значением new String[10].
        2. Программа должна создавать массив и инициализировать его значением new int[10].
        3. Программа должна считывать строки для массива с клавиатуры.
        4. Программа должна записать в массив чисел длины строк из массива строк, а затем вывести их на экран.*/


public class CountStringValueArr {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        int[] intArr = new int[10];
        String[] stringArr = new String[10];
        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = reader.readLine();
            intArr[i] = stringArr[i].length();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(intArr[i]);
        }

    }
}
