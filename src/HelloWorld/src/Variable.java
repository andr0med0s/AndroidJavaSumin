package HelloWorld.src;

public class Variable {
    public static void main(String[] args) {
/*
*       int x = 5;
        int y = x + 5;
        System.out.println(y);
* */
/*
*       int john = 100;
        int nick = john * 5;
        int sum = john + nick;

        System.out.println(sum);
* */
/*
*       int a = 10;
        int b  = 4;
        int c = a % b;

        System.out.println(c); // остаток от деления
*/
     int days = 10000;
     int years = days / 365;
     int month = (days - (years * 365)) / 30;
     int leftDays = days - (years * 365) - (month * 30);

     System.out.println(years);
     System.out.println(month);
     System.out.println(leftDays);
    }
}
