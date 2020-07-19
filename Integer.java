package Homework2;

public class Integer {
    public static void main(String[] args){
        int a,b,c;
        a=1;
        b=2;
        c=-3;
        if(a>0 && b>0 && c>0){
            System.out.println("3");}
        else if(a<0 && b<0 && c<0){
            System.out.println("0");}
        else if(a<0 & b<0 || a<0 & c<0 || b<0 & c<0){
            System.out.println("1");}
        else if(a<0 || b<0 || c<0){
            System.out.println("2");
        }
    }
}
