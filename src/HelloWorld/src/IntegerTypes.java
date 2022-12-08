package HelloWorld.src;

public class IntegerTypes {
    public static void main(String[] args) {

        //int speed = 300_000; здесь long distance приводится в int и вывод не корректный,
        // значение мелкого типа можно положить в переменную большего типа, но вывод некорректный
//        long speed = 300_000;
//        long distance = 365 * 24 * 60 * 60 * speed; // неявное приведение типа int в тип long
//        //       System.out.println(distance);

/**
 *         int a = 5;
 *         a = a + 1;
 *         a += 1;
 *         a += 10;
 *         a -= 6;
 *         a++;
 *         a--;
 * */

      //byte b = 127;
//        byte b = 10;
//        b = (byte) (b + 10); // явное приведение типа, если вы уверенны что результат поместится в тип ...
//        b++; // происходит переполнение , отсчет начнется с самого минимального значение которое может содержать этот тип
//        b++;
//        System.out.println(b);

//        byte a = 10;
//        int b = a;

//        int a = 1;
//        byte b =  a;

        int a = 1;
        byte b = (byte) a;
        
    }

}
