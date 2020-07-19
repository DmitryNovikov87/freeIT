public class TimePrinter {
    public static void main(String[] args) {
        int s = 4500;
        int sec = s%60;
        int m = (s-sec)/60;
        int min = m%60;
        int h = (m - min)/60;
        int hour = h%24;
        int d = (h-hour)/24;
        int day = d%7;
        int w = d/7;
        System.out.println("A) " + m + " минут " + sec + " секунд");
        System.out.println("B) " + h + " часов " + min + " минут " + sec + " секунд");
        System.out.println("C) " + d + " дней " + hour + " часов " + + min + " минут " + sec + " секунд");
        System.out.println("D) " + w + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд");

    }
}
