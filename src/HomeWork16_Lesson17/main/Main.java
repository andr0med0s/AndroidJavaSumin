package HomeWork16_Lesson17.main;

import HomeWork16_Lesson17.test.MyMath;

public class Main {
    public static void main(String[] args) {
        /**** для урока 18 предыдущее закомментировано****
         Test HomeWork16.HomeWork16.box.test = new Test();
         int square =  HomeWork16.HomeWork16.box.test.square(80); // метод с параметром
         double sqrt = Math.sqrt(36); // метод с параметром
         System.out.println(square);

         Man man = new Man("Иван", 27);
         man.age = -40;
         man.setAge(-40);
         man.showInfo();
         System.out.println(man.getAge());
         Box box = new Box();
         */

        /*
*         double length = MyMath.length(10);
        System.out.println(length);
        double area = MyMath.area(10);
        System.out.println(area);
        length = MyMath.length(10);
        System.out.println(length);
* */
        int sum = MyMath.sum(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sum);

    }
}
