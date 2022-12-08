package Variable.src;

public class Var {

    public static void main(String[] args) {
        int a = 15;
        //byte b = a; // ошибка потому что нет приведения типов к более мелкому типу
        byte b = (byte) a; // приведение (в ручном виде)
        System.out.println(b);
    }



   /*
    public static void HomeWork16.HomeWork16.box.main(String[] args) {
        int days = 1000;
        int speed = 300000;

        int seconds = days * 24 * 60 * 60;// long изменим на int и получим не правильный вывод, а именно: -127631360

        //  long seconds = days * 24 * 60 * 60;

        // int distance = speed * seconds;// результату присваивается тип самого большого типа в выражении в данном случае должно быть long

        long distance = speed * seconds;// если int speed и int seconds, а distance типа long ошибка не возникает так как работает автоматическое приведение типов, но вывод остается неверный: -127631360
        System.out.println(distance);
/*
        byte a = 127;
        a += 4;
      // a += 1;
        System.out.println(a); // -128 при a += 1;----выводится самое минимальное значение -127 при a += 2; -125 при a += 4; и т.д происходит это из за того что значение не входит в допустимую область значений


   byte a = 10;
    int b = a; //автоматическое преобразование (мелкое в крупное)
        System.out.println(b); // byte преобразуется в тип int
 *  */
}


