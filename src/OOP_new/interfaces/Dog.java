package OOP_new.interfaces;

public class Dog extends Animal implements AbleToRun {
    @Override
    public void eat() { // переопределяем метод eat
        System.out.println("Собачий корм");
    }

    @Override
    public void run() {
        System.out.println("Собака бежит");
    }
}


