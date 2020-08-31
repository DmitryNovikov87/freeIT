package src.topic3;
//Создайте число.
//Определите, является ли оно трехзначным.
//Определите, является ли его последняя цифра семеркой.
//Определите, является ли число четным.


public class taskm6 {
    public static void main (String[] args){
        int x=108;{
            if (x>=100 && x<=999)
                System.out.println("Число "+x+" является трехзначным");
            else
                System.out.println("Число не является трехзначным");{
                if (x%10==7)
                    System.out.println("Последняя цифра данного числа 7");
                else
                    System.out.println("Последняя цифра данного числа не 7");{
                    if (x%2==0)
                        System.out.println("Число является четным");
                    else
                        System.out.println("Число является не четным");
                }
            }
        }
    }
}
