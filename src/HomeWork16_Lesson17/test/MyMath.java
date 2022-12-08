package HomeWork16_Lesson17.test;

public class MyMath {

    private static final double PI = 3.14; // переменная относится к классу, а не к объекту ... если final то значение переменной можно присвоить только один раз

    public static int square(int number) {
        return number * number;
    }
    public static double length(double radius) {
        return 2 * PI * radius;
    }
    public static double area(double radius) {
        //pi = 10;
        return PI * radius * radius;
    }
    public static int sum (int... numbers){
        int sum = 0;
        for(int i : numbers) {
            sum += i;
        }
        return sum;
    }
 }
