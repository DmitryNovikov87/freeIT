package src.topic2;

public class Integer2 {
    public static void main(String[] args){
        int a,b,c;
        a=-1;
        b=-1;
        c=1;
        if(a>0 && b>0 && c>0){ // условие для 3-х положительных чисел
            System.out.println("Положительных чисел 3, отрицательных 0"); }
        else if(a<0 && b<0 && c<0){ // условие для 3-х отрицательных чисел
            System.out.println("ПОложительных чисел 0, отрицательных 3");}
        else if(a<0 && b<0 || a<0 && c<0 || b<0 && c<0){
            System.out.println("Положительных чисел 1, отрицательных 2");}
        else if(a<0 || b<0 || c<0){ // условие для 2-х положительных чисел
            System.out.println("Положительных чисел 2, отрицательных 1");}
        }
}
