package HomeWork10;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human();
        Human h3 = new Human();
        Human h4 = new Human();
        Human h5 = new Human();

        h1.age = 10;
        h1.name = "Petr";
        h1.weight = 20.5;

        h2.age = 20;
        h2.name = "Igor";
        h2.weight = 30.2;

        h3.age = 30;
        h3.name = "Serg";
        h3.weight = 42;

        h4.age = 40;
        h4.name = "Vano";
        h4.weight = 50.3;

        h5.age = 50;
        h5.name = "Andr";
        h5.weight = 78.6;

        System.out.println("Средний возраст = " + (h1.age + h2.age + h3.age + h4.age + h5.age)/5);
    }

}
