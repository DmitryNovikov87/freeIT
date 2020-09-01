package src.topic3;
//Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию)

public class taskm10 {
    public static void main(String[] args) {
        int a = 10;//порядковый номер числа из ряда факториала
        for (int n = 10; n <= 15; n++) {
            a = a * n;
        }
        System.out.println("Факториал числа в диапазоне 10..15 равен " + a);
    }
}
