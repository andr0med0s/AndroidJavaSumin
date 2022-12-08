package OOP_new.example;

public class Person { // поля должны быть private
    //public String name; // доступно из любого места в программе
    private String name;// доступ только внутри класса
    private int age;
    //double weight;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        if (age >= 0){
            this.age = age;
        }
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
