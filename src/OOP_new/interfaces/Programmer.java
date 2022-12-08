package OOP_new.interfaces;

public class Programmer implements Worker, Driver {
    @Override
    public void drive() {
        System.out.println("Программист водит машину");
    }

    @Override
    public void work() {
        System.out.println("Программист работает");
    }
}

