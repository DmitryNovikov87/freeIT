package src.topic2;

public class DifferentNumber {
    public static void main(String[] args) {
        int n, a, b, c, d;
        n = 1234;
        a = n%10;
        b = (n%100-a)/10;
        c = (n%1000-b)/100;
        d = (n%10000-c)/1000;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){ // сравнение всех полученных цифр числа
            System.out.println("Все цифры числа различны");
        }
        else {
            System.out.println("Одно или более чисел равны"); // если хотя бы одно число равно одному или более
        }

    }
}
