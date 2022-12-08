package HomeWork16_Lesson17.test;

public class Man {
    private String name;
    private int age; // поля

    public Man(String name, int age) {
        this.name = name;
        this.age = age; // конструктор
    }

    public void showInfo(){
        System.out.println("Имя: " + name );
        System.out.println(("Возраст: " + age));
    }

    public  void setAge (int age) {
        if (age > 0) {
            this.age = age;
        }else {
            System.out.println("Возраст должен быть больше нуля");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
