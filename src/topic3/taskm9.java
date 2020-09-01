package src.topic3;
//Получить случайное число и посчитать его факториал.

public class taskm9 {
    public static void main(String[] args) {
        int a = 1; //начальное число из диапазона 1..20
        int x = (int) (Math.random() * 20); //случайное число в диапазоне 1..20
        System.out.println(x); //проверка числа
        for (int b = 1; b <= x; b++) {
            a = a * b;
        }
        System.out.println(a);
    }
}
