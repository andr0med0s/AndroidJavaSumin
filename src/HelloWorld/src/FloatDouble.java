package HelloWorld.src;

public class FloatDouble {
    public static void main(String[] args) {
//        double radius = 10.8;
//        double pi = 3.14;
//        double area = pi * radius * radius;
//        System.out.println(area);

//        float radius = 10.8; 10.8 - тип double, нельзя положить во float ошибка
        float radius = 10.8f; // 10.8f - указываем на тип float ошибки нет
        float pi = 3.14f;
        float area = pi * radius * radius;
        System.out.println(area); // вывод такойже как и при double, но количество знаков после запятой меньше
    }
}
