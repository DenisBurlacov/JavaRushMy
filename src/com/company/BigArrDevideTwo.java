package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
Один большой массив и два маленьких
Создать массив на 20 чисел.
Ввести в него значения с клавиатуры.
Создать два массива на 10 чисел каждый.
Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

Requirements:
1. Программа должна создавать большой массив и инициализировать его значением new int[20].
2. Программа должна считывать с клавиатуры 20 чисел для большого массива.
3. Программа должна создавать два маленьких массива и инициализировать их значениями new int[10].
4. Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести второй маленький массив на экран.
*/

public class BigArrDevideTwo {
    public static void main(String[] args) throws Exception {
        int[] listOne = new int[10];
        int[] listTwo = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] listBig = new int[20];
        for (int i = 0; i < listBig.length; i++) {
            listBig[i] = Integer.parseInt(reader.readLine()); //read value from buffer and add to the big arr
        }
        for (int i = 0; i < 10; i++) {                        // divide big arr into two
            listOne[i] = listBig[i];
            listTwo[i] = listBig[i + 10];
        }

        for (int i = 0; i < listTwo.length; i++) {            //print second arr
            System.out.println(listTwo[i]);
        }
    }
}
