package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
Улица и дома
Улица и дома
Создать массив на 15 целых чисел.
Ввести в него значения с клавиатуры.
Пускай индекс элемента массива является номером дома, а значение — числом жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными — на другой. Выяснить, на какой стороне улицы проживает больше жителей.
Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."
Примечание: дом с порядковым номером 0 считать четным.


Requirements:
1. Программа должна создавать массив и инициализировать его значением new int[15].
2. Программа должна считывать числа для массива с клавиатуры.
3. Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных элементов массива больше суммы четных.
4. Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных элементов массива больше суммы нечетных.
5. Программа не должна выводить текст в консоль, если количество жителей на каждой стороне - одинаковое.
*/


public class Houses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        int[] arr = new int[15];
        int evenNum = 0;
        int oddNum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)  {
                evenNum += arr[i];
            }else {
                oddNum += arr[i];
            }
        }
        if(evenNum > oddNum){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else if (oddNum > evenNum){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}