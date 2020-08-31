package src.topic2;

public class NaturalNumber {
    public static void main(String[] args) {
        int n = 5478;
        int un = n%10;
        int ten = (n%100-un)/10;
        int hund = (n%1000-ten)/100;
        int thou = (n%10000-hund)/1000;
        System.out.println(un);
        System.out.println(ten);
        System.out.println(hund);
        System.out.println(thou);
        System.out.println(un*1000+ten*100+hund*10+thou);
    }
}
