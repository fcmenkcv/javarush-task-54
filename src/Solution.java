package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/*
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int speedM = console.nextInt();
        int speedK = (int) Math.round(speedM * 3.6);

        System.out.println(speedK);
    }
}
