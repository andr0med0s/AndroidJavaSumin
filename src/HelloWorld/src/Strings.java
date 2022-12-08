package HelloWorld.src;

public class Strings {
    public static void main(String[] args) {
/*
* //        String s = "Hello world!!! ";
        String hello = "Hello";
        String world = "World";
        String result = hello + " " + world;

//      System.out.println(hello + " " + world);
        System.out.println(result);
* */

        String name = "Иван";
        int age = 37;
        String result = "Привет, \"" + name + "\"!\nТебе " + age + " лет."; // \n - управляющий символ перенос
        // на новую строку \" -- экранирование кавычек
        System.out.println(result);
    }
}
