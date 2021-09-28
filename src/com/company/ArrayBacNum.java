package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив из чисел в обратном порядке
Массив из чисел в обратном порядке
Создать массив на 10 чисел.
Ввести с клавиатуры 10 чисел и записать их в массив.
Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.

Requirements:
1. Программа должна создавать массив и инициализировать его значением new int[10].
2. Программа должна считывать числа для массива с клавиатуры.
3. Программа должна выводить 10 строчек, каждую с новой строки.
4. Массив должен быть выведен на экран в обратном порядке.
*/

public class ArrayBacNum {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        int [] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);

        }//напишите тут ваш код
    }
}
