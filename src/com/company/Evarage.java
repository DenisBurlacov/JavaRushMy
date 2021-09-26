package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
Среднее такое среднее

Среднее такое среднее
Введи с клавиатуры три числа, выведи на экран среднее из них. Т.е. не самое большое и не самое маленькое.
Если все числа равны, выведи любое из них.

Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить среднее из трех чисел.
4. Если все числа равны, вывести любое из них.
5. Если два числа из трех равны, вывести любое из двух.
*/

public class Evarage {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        int numOne = Integer.parseInt(reader.readLine());
        int numTwo = Integer.parseInt(reader.readLine());
        int numThree = Integer.parseInt(reader.readLine());
        if ((numOne >= numTwo && numOne <= numThree) || (numOne <= numTwo && numOne >= numThree)){
            System.out.println(numOne);
        } else if ((numTwo >= numOne && numTwo <= numThree) || (numTwo <= numOne && numTwo >= numThree)) {
            System.out.println(numTwo);
        } else {
            System.out.println(numThree);

        }
    }
}