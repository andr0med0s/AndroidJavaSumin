package OOP_new.test;

import java.util.Random;

public class Main {

    /*
    * public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();
      //  System.out.println(cat.canEatPerson); в классе main который в
        //  другом пакете нельзя обратиться к полям , для этого создаются
        //  getter-ы
//      System.out.println(lion.canEatPerson);

//        System.out.println(cat.isCanEatPerson());
//        System.out.println(lion.isCanEatPerson());

        cat.eat(); // при вызове данного метода возьмется
        // та реализация, которая указана в конкретном классе наследнике
        // это называется переопределение метода
        lion.eat();// если в каком-то наследнике мы не будем
        // переопределять метод, то возьмется реализация из
        // родительского класса
    }
    * */

/*
*     public static void main(String[] args) {
//        Box box = new Box(10);
//        WeigthBox weigthBox = new WeigthBox(10,20);
//        box.showInfo();
//        weigthBox.showInfo();
//    }
* */

/*
    public static void main(String[] args) {
        ColoredRed rect = new ColoredRed(10,20);
        //Rect rect = new Rect(10,20);
        Triangle triangle = new Triangle(10,10,10);

        rect.showPerimetr();
        triangle.showPerimetr();

//        Shape shape = new Shape(10,5);
//        shape.getPerimetr()
    }
 */

    /*
    public static void main(String[] args) {
//    Empty empty = new Empty();
//    empty.toString();
    Person person = new Person("Jonz", 38);
//    System.out.println(person.toString());
    System.out.println(person.toString());

}
     */

    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i < 10; i++ ){    // выводится 100 раз случайное число от нуля до 10
//        int a = random.nextInt(5,11);
//        System.out.print(a + " ");
            int number = random.nextInt(1,7);
            String result = String.format("Ваше число: %s", number) ;
            System.out.println(result);
        }
    }

}
