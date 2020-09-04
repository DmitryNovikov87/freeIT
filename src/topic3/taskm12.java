package src.topic3;
//Найдите сумму первых n целых чисел, которые делятся на 3

import java.util.Scanner;

public class taskm12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел для которых посчитать сумму");
        int n = sc.nextInt();
        int k = 0; //начало отсчета порядкового номера чисел диапазона
        int sum = 0; //наименование первого числа в диапазоне
        for (int i = 1; k < n; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
                k++;
            }
        }
        System.out.println("Сумма первых " + n + " целых чисел = " + sum);
    }
}
