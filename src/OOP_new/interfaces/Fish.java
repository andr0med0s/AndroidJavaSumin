package OOP_new.interfaces;

public class Fish extends Animal{
    @Override
    public void eat() { // переопределяем метод eat
        System.out.println("Рыбий корм");
    }
}
