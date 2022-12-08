package HomeWork3.src;

public class Time {
    public static void main(String[] args) {
        int second = 1000000;
        int minute = second / 60;
        int hours = minute / 60;
        int days = hours / 24;

        System.out.println("Общее кол-во секунд: " + second);
        System.out.println("Минут: " + minute );
        System.out.println("Часов: " + hours);
        System.out.println("Дней: " + days);
    }
}
