package com.company;

/*Вырезаем середину
        Дан двумерный массив chars. Тебе нужно в методе main заменить все внутренние элементы на дефис (минус).

        Для вывода содержимого массива на экран используй приватный метод printArray().

        Пример массива:
        a b c d e f
        g h i j k l
        m n o p q r
        s t u v w x

        После отработки программы массив должен содержать:
        a b c d e f
        g - - - - l
        m - - - - r
        s t u v w x


        Requirements:
        1. В методе main необходимо заменить все внутренние элементы массива chars на дефис (см. пример в условии).*/

public class CutCharsArr {
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'j', 'h', 'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p', 'q', 'r'},
            {'s', 't', 'u', 'v', 'w', 'x'}};

    public static void main(String[] args) {
        printArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[0].length; j++) {
                if (i != 0 && i != chars.length - 1 && j != 0 && j != chars[0].length - 1) {
                    chars[i][j] = '-';
                }
            }
        }//напишите тут ваш код

        printArray();
    }

    private static void printArray() {
        for (char[] aChar : chars) {
            for (char c : aChar) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
