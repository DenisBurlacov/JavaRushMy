package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Суммирование
Давай напишем программу, в которой нужно будет вводить числа с клавиатуры, и как только будет введено -1,
вывести на экран сумму всех чисел и завершить программу.
-1 должно учитываться в сумме.

Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
3. Программа должна посчитать сумму введенных чисел и вывести её на экран.
4. В программе должен использоваться цикл for, while или do-while.
*/

public class SumThreeNum {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        int check = -1;
        int numVal = 0;
        while (true) {
            int num = Integer.parseInt(reader.readLine());
            numVal += num;
            if (num == -1) {
                break;
            }
        }
        System.out.println(numVal);
    }
}