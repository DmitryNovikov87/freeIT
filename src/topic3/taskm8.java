package src.topic3;
//Имеется целое число (задать через random).
//Это число - количество денег в рублях.
//Вывести это число, добавив к нему слово "рублей" в правельном падеже.

import java.util.Random;

public class taskm8 {
    public static void main (String[] args){
        Random rand = new Random();
        int x=rand.nextInt();
        System.out.println(x); //проверка числа
        //диапазон для полодительных и 0
        if (x==0 || x%100>=11 && x%100<=14 || x%10>=5 && x%10<=9 || x%10==0)
            System.out.println(x + " рублей");
        else if (x%10==1)
                System.out.println(x+" рубль");
            else if (x%10>=2 && x%10<=4)
                System.out.println(x+" рубля");
            //диапазон для отрицательных
        else if (x%100<=-11 && x%100>=-14 || x%10<=-5 && x%10>=-9)
            System.out.println(x+" рублей");
        else if (x%10==-1)
            System.out.println(x+" рубль");
        else if (x%10<=-2 && x%10>=-4)
            System.out.println(x+" рубля");
    }
}
