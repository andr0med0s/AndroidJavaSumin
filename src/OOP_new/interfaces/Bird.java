package OOP_new.interfaces;

public class Bird extends Animal implements AbleToFly, AbleToRun{ // реализуются несколько интерфейсов AbleToFly, AbleToRun
    @Override
    public void eat() { // переопределяем метод eat
        System.out.println("Птичий корм");
    }
// ctrl + i переопределение интерфейсов
    @Override
    public void fly() {
        System.out.println("Птица летит");
    }

    @Override
    public void run() {
        System.out.println("Птица бежит");
    }
}

