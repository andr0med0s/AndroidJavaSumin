package OOP_new.example;

public class MyMath {

    //    private double pi = 3.14; // относится к объекту
   // private static final double pi = 3.14; // относится к классу MyMath поэтому к ней к переменной
                                    // можно обращятся из статических методов
    // ключевое слово final ставит запрет на изменение переменной
     // и означает что значение переменной можно задать только в момент создания

    public static final double PI = 3.14; //если создается публичная
                    // статичная константа то её имя пишется заглавными
    // горячяя клавиша шифт ф6 переименования везде

    public static int sum (int... numbers) { // аргумент переменной длины (var args)в
                        // данном случае переменные типа int

        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }

    public static double length(double radius) {
        return 2 * PI * radius;
    }

    public static double area(double radius){
        //   pi = 10; // значение pi изменилось не у какого-то объекта, а у всего класса
        return PI * radius * radius;
    }

    public static int multiple(int a, int b) {
        return a * b;
    }

    public static double multiple(double a, double b) {
        return a * b;
    }

    public static int multiple(int a) {
        return a * a;
    }
}
// В перегруженных методах и конструкторах должны отличаться:
// количество параметров, типы либо и то и другое

// если для вызова метода не нужен объект (объект никак не используется),
// то метод делается static и он относится к классу , а не к объекту

// это возможно только из-за того что данные методы не используют
// переменные экземпляра класса Math они не работают с самим объектом Math,
// являются самостоятельными единицами и их можно привязать к классу ,
// а не к объекту