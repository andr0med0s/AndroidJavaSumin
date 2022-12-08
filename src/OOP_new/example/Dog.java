package OOP_new.example;

public class Dog {
    String name;
    String breed;
    double weigth;
    int speed;

    void run() {
        for (int i = 0; i<speed; i++){
            System.out.println("Бегу ");
        }
    }

    String getInfo() {
        return "Name: " + name + " Breed: " + breed + " Weigth: " + weigth + " Скорость: " + speed;
    }
}
