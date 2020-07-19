package Homework2;

public class Triangle {
    public static void main(String[] args){
        int a, b, c;
        a=1;
        b=1;
        c=2;
        if(a+b>c || a+c>b || b+c>a){ //проверка выполнения условия существования треугольника
            System.out.println("Треуголькник может существовать");}

        if(a>b+c || b>a+c || c>a+b){ //проверка не выполнения условия существования треугольника
            System.out.println("Треугольник не может существовать");
        }
    }
}
