package OOP_new.interfaces;

import java.util.ArrayList;

public class Main {
    /*
    public static void main(String[] args) {
//        Cat cat = new Cat(); //создаем по одному экземпляру каждого животного
//        Dog dog = new Dog();// создаем собаку
//        Bird bird = new Bird();// -----птицу
//        Fish fish = new Fish();//--рыбу
//        ArrayList<Animal> animals = new ArrayList<>(); //создаем коллекцию всех животных
                                                        //указываем тип Animal общий тип для всех
                                                        // (все животные наследуются от Animal)
//        animals.add(cat); //добавляем животных ...если какой-то метод в качестве параметра
                            //принимает родительский тип в данном случае тип Animal,
                            // то мы можем ему передать любого наследника
//        animals.add(dog);
//        animals.add(bird);//Upcast : метод add принимает родительский тип Animal  и передаем различных наследников
//        animals.add(fish);// наследники автоматически приведены к типу animal к родительскому типу и это называется Upcast
//        for (Animal animal : animals) { //в качестве типа используется Animal
//            animal.eat(); // у объекта animal вызываем метод eat
//        }
//        Animal animal = new Dog();// ---      если Upcast делается автоматически      //* и возможен только если в переменную родительского
//        animal.eat(); // реализация возьмется из класса Dog                           //* типа кладем переменную дочернего типа
//      //  animal.run();// возникает ошибка в родительском классе нет метода run(), но метод есть в Dog
//        Dog dog = (Dog) animal;// можно сделать явное приведение типа это  Downcast приведение к дочернему типу
                                    //  ---   ,то Downcast делается вручную
//        dog.run();// и теперь можно вызвать метод который есть в Dog

//        Animal animal = new Cat(); // Upcast происходит без проблем Cat является экземпляром класса Animal
//        animal.eat();              // и можно вызвать метод eat()
//        Dog dog = (Dog) animal; //мы пытаемся переменную animal которая в данном случае является котом  привести к типу Dog
//        dog.run();              // выйдет ошибка класс кот не может быть приведен к типу Dog

//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Bird bird = new Bird();
//        Fish fish = new Fish();
////        ArrayList<Animal> animals = new ArrayList<>();
//        ArrayList<AbleToRun> animals = new ArrayList<>();// у коллекции указываем тип interface
//        animals.add(cat); // теперь без проблем добавляем животных
//        animals.add(dog);
//        animals.add(bird);
////        for (Animal animal : animals){ //использовать метод animal.run не удастся происходит Upcast ,
//                                            //        а в родительском классе Animal метода run() нет
//        for (AbleToRun animal : animals){
//          //  animal.eat(); //приведено к родительскому типу AbleToRun, там нет метода eat()
//            animal.run();
//        }
//        AbleToFly ableToFly = new Bird(); // здесь Upcast
//        ableToFly.fly();

        AbleToRun ableToRun = new Dog();// автоматический Upcast ..привели собаку к типу "способный бегать" ableToRun
        Dog dog =(Dog) ableToRun;          //если хотим объект "способный бегать" привести к типу Dog ,
                                    // то это нужно делать самостоятельно, явно указывая к какому типу хотим привести объект,
                                //сами должны следить за соответствием типов ,
                          // что в этой переменной ableToRun лежит объект типа Dog
    }

     */

    public static void main(String[] args) {
        Director director = new Director();
        Programmer programmer = new Programmer();
        Chef chef = new Chef();

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(director);
        workers.add(programmer);
        workers.add(chef);
        for(Worker worker : workers ){
            worker.work();
        }
        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(programmer);
        drivers.add(chef);
        for(Driver driver : drivers ){
            driver.drive();
        }
    }
}
