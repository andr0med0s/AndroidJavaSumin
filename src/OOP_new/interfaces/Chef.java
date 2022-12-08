package OOP_new.interfaces;

public class Chef implements Worker, Driver{
    @Override
    public void drive() {
        System.out.println("Повар водит машину");
    }

    @Override
    public void work() {
        System.out.println("Повар работает");
    }
}
