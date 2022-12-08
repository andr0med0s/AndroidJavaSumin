package OOP_new.interfaces;

public class Cat extends Animal implements AbleToRun{ // наследуется от Animal наследоваться можно только от одного
    // класса для реализации interface используется ключевое слово implements
    @Override
    public void eat() { // переопределяем метод eat
        System.out.println("Кошачий корм");
    }
@Override
    public void run (){
        System.out.println("Кот бежит");
    }
}
