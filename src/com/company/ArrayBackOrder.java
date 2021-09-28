package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив из строк в обратном порядке
Массив из строк в обратном порядке
Создать массив на 10 строк.
Ввести с клавиатуры 8 строк и сохранить их в массив.
Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент — с новой строки.

Requirements:
1. Программа должна создавать массив и инициализировать его значением new String[10].
2. Программа должна считывать 8 строк для массива с клавиатуры.
3. Программа должна выводить на экран 10 строк, каждую с новой строки.
4. Программа должна выводить на экран массив (10 элементов) в обратном порядке.
*/


public class ArrayBackOrder {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String[] list = new String[10];
        for (int i = 0; i < list.length - 2; i++) {
            list[i] = reader.readLine();
        }
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);

        }
    }
}
