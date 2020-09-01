package src.topic3;
//Имеется целое число
//Определить, является ли это число простым, то есть делится на 1 или на себя без остатка

import java.util.Scanner;

public class taskm11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = sc.nextInt();
        if (number / number == 1 || number % number == 0)
            System.out.println("Число является простым");
        else
            System.out.println("Число не является простым");
    }
}
