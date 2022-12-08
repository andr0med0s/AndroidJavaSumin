package OOP_new.test;

//public class Main {
//    public static void main(String[] args) {
////        Box box1 = new Box(); // экземпляр класса Box
//                             // объект box1
//
//        // если не передаются значения полям, то как бы по умолчанию установятся
//        // значения из пустого конструктора
//
////        box1.height = 10; // присвоили значения
////        box1.width = 10; // полям, обращаясь к
////        box1.length = 10; // экземпляру класса
//
////        Box box2 = new Box(20,20,20);
////        box2.height = 20;
////        box2.width = 20;
////        box2.length = 20;
////        box2.setDimens(20,20,20);
//
////
//////        Box box3 = box2;
//////        box3.width = 0; // изменяя значения поля для box3 меняется box2
////                        // так как box3 это не объект , а ссылка и ссылается на
////                        // объект box2
////
////        double volume = box1.height * box1.length * box1.width;
////        System.out.println(volume);
////        double volume2 = box2.height * box2.length * box2.width;
////        System.out.println(volume2);
////
////        double volume = box1.getVolume();
////        System.out.println(volume);
////        double volume2 = box2.getVolume();
////        System.out.println(volume2);
//
////        box1.showVolume();
////        box2.showVolume();
//
//////        Person john = new Person();
//////        Person nick = new Person();
//////        Person max = new Person();
//////
//////        john.name = "John";
//////        john.age = 17;
//////        john.weight = 70.5;
//////
//////        nick.name = "Nick";
//////        nick.age = 27;
//////        nick.weight = 85.3;
//////
//////        max.name = "Max";
//////        max.age = 35;
//////        max.weight = 66.6;
//////
////////        int sum = john.age + nick.age + max.age;
////////        double average = (double) sum / 3; sum нужно привести к double
//////        //        иначе average будет int, а значит результат неверный
////////        System.out.println(average);
//////
//////        double sum = john.age + nick.age + max.age; // либо изначально sum сделать double
//////        double average =  sum / 3;
//////        System.out.println(average);
//////
////        Dog dog = new Dog();
////        dog.name = "Тузик";
////        dog.breed = "Такса";
////        dog.weigth = 10;
////        dog.speed = 10;
//
////        String info = dog.getInfo();
////        System.out.println(info);
//
////        dog.run();
////        System.out.println(dog.getInfo());
////        Test test = new Test(); // экземпляр класса Test
////        System.out.println(test.square(20));
//
////        Rectangle rect1 = new Rectangle();
////        rect1.setDimens(70,5.50);
////        System.out.println(rect1.getSquare());
//
////        Employee employee = new Employee("Andre","Programmer", 20000);
////        employee.showInfo();
//
////       Math math = new Math(); // если метод static, то создавать объект ненужно
////        System.out.println(math.multiple(5)); //
//      //  System.out.println(MyMath.multiple(5)); //  и указывается класс при вызове метода
//
////        System.out.println(Math.sqrt(36));
//
////        Box box1 = new Box(10.5);
////        box1.showVolume();
//
////       Monster monster1 = new Monster();
////       Monster monster2 = new Monster(3);
////       Monster monster3 = new Monster(4,5,6);
////       monster1.voice();
////       monster2.voice(3);
////       monster3.voice(3,"Aaaaaa ");
//
//        Box current = new Box(10); // это два разных
//        Box another = current.copy();  // объекта , новый объект создается внутри
//                                        // метода copy
////        Box another = new Box(100);
////        Box another = new Box(current);
////        current.compare(another);
////        int result = current.compare(another);
////        System.out.println(result );
//
////        another.setDimens(20,20,20);
//
//        Box another2 = current.increase();
//
//        current.showVolume();
//        another.showVolume();
//        another2.showVolume();
//    }

//    public static void main(String[] args) {
//        Person person = new Person("John", 25);
//        person.setAge(40);
//        System.out.println("Name: " + person.getName() + "\nAge: " + person.getAge() );
//    }
//public static void main(String[] args) {
////    System.out.println(MyMath.length(10));
////    System.out.println(MyMath.area(10));
////    System.out.println(MyMath.length(10));
//    System.out.println(MyMath.sum(1,2,4,5,234));
//
//}

    /*
    *     public static void main(String[] args) {
        //  String[] employees = getEmployees();// "Неизменяемый"  массив со списком сотрудников
        MyArrayList employees = getEmployees();
        employees.add("James");
        employees.remove("Emma");
*
*         String[] newArray = new String[employees.length + 1]; // новый массив на единицу больше для добавления нового сотрудника
        for (int i = 0; i < employees.length; i++){ // скопируем все элементы из
            newArray[i] = employees[i];             // первого массива во второй
        }
        newArray[newArray.length - 1] = "James"; // добавили нового сотрудника
        employees = newArray; // в переменную старого массива положили новый массив .
                            // .переменная employees и переменная newArray ссылаются на один и тот же объект

        employees[0] = null; // удалили сотрудника, значение ...  запись остается null
                            //ссылочная  переменная любого типа может содержать null
                            // переменная нессылается ни на какой объект

        String[] newestArray = new String[employees.length - 1]; // создаем новый самый новый массив
        for (int i = 0, j = 0; i < employees.length; i++){ //  добавляем индекс  j так как нулевой индекс всегда null
            String employee = employees[i];
            if (employee != null){ // если элемент не равен null, то перенести в новый массив .
                                    // если сотрудник неравен null, то в новый массив по индексу j положим новое значение .
                newestArray[j] = employee;
                j++;                // и после j увеличим на единицу таким образом новый массив будет заполнен с самого начала
            }                           // P.S в первом шаге цикла эта часть невыполняется  :
                                                  //       newestArray[j] = employee;
                                                         //       j++;
                                        // а со второго шага цикла начинает заполнятся новый массив
        }
        employees = newestArray; // переменной employees присваиваем значение  нового массива newestArray
*
    // for (String employee : employees) { // к коллекции не применим цикл for each.
    // . мы можем воспользоваться обычным циклом for
            for(int i = 0; i < employees.getSize(); i++){
        System.out.println(employees.get(i) );
    }
}

/*
    //    private static String[] getEmployees(){
//        String[] employees = new String[5];
//        employees[0] = "Jhon";
//        employees[1] = "Olivia";
//        employees[2] = "Emma";
//        employees[3] = "Max";
//        employees[4] = "Nick";
//        return employees;
//    }
*/



/*
*     public static void main(String[] args) { // Оболочки типов
        int a = 5;
        Integer a1 =5; // автоупаковка
        // a1.метод
        byte b; // примитивный тип
        Byte b1;// оболочка ссылочный тип
        short c;
        Short c1;
        long d;
        Long d1;
        char e;
        Character e1;
        float g;
        Float g1;
        double h;
        Double h1;
        boolean i;
        Boolean i1;
    }
* */

/*
*     public static void main(String[] args) {
        String s = "1000";
        String s1 = "2000";
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(s1);
      //  System.out.println(s + s1); // выведется в консоль строка: 10002000
        System.out.println(a + b); // выводится в консоль число результат сложения : 3000
    }
* */

/*
*     public static void main(String[] args) {
        String s = "This is John. He is 27 years old.";
//        String name = s.substring(8); // вызвали метод(substring) у строки
//        System.out.println(name); // вывели строку начиная с 8-го индекса
        String name = s.substring(8, 12 ); // вызвали метод(substring) у строки // конечный индекс
                                                        // в саму строку не входит
//        System.out.println(name); // вывели строку начиная с 8-го индекса

        String ageString = s.substring(20,22);
        int age = Integer.parseInt(ageString);
        Person person = new Person(name, age); // создали экземпляр класса Person и передали name и age
//        System.out.println(age);
        System.out.println(person.getName() + " " + person.getAge());
    }
* */

import java.util.HashSet;

public class Main1 {
/*
*     public static void main(String[] args) { // встроенные коллекции
        ArrayList<String> employees = getEmployees(); // <здесь указывается тип который будем хранить>
        // в коллекции
        employees.add("James");
        employees.remove("Emma");
        employees.remove(0);
//        for (int i = 0; i < employees.size(); i++) {
//            System.out.println(employees.get(i));
//        }
        //   можно использовать цикл for each
        for (String employee : employees) {
            System.out.println(employee);
        }

    }
* */

   /*
   *  public static void main(String[] args) { // встроенные коллекции
        ArrayList<Integer> numbers = new ArrayList<>(); // Внутри <> джинерика нельзя указывать примитивные типы
                                                        // указываются ссылочные типы
        for (int i = 0; i<1000; i++) {
            numbers.add(i);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static ArrayList<String> getEmployees() { // Чтобы в коллекции был только
        // тип String указывается джинерик <String> и внутри указывается какого
        //   типа данные будут в коллекции
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Jhon");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
//        employees.add(5); // можно добавлять
//        employees.add(new Box()); // разного типа, но в коллекциях
//        должны быть данные одного типа

        return employees;
    }
   * */


/*
*     public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); // коллекция чисел
        for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }
        ArrayList<String> names = getEmployees(); // используется уже созданная
                                                    // коллекция  строк/имен
        ArrayList<String> result = new ArrayList<>(); // новая коллекция в которой хранятся
                                                        // данные из колекции name и numbers
        for (int i = 0; i < names.size(); i++) { // name.size и numbers.size размер
                                                // одинаковый поэтому без разницы
           // String s = numbers.get(i) + " - " + names.get(i); // переменная в которую вложили
                                                                // два метода для получения элементов из
                                                                // двух коллекций
             result.add(numbers.get(i) + " - " + names.get(i)); // можно обойтись и без введения переменной String s..
                                                                // и возвращать сразу результат  в коллекцию result
        }
        for (String s : result) { // в цикле for each прошли по коллекции result
            System.out.println(s); // и вывели все её содержимое (элементы) в консоль
        }
     }

    private static ArrayList<String> getEmployees() {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Jhon");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
* */

    public static void main(String[] args) {
        HashSet<String> names = getEmployees(); // получаем все имена
        for (String name : names) { // выводим все имена в консоль ..
            // элементы можно вывести только используя цикл for each
            // в HashSet обратится к элементам по индексу невозможно
            System.out.println(name);
        }
    }

    // в отличии от ArrayList коллекция HashSet хранит элементы бес порядочно,
    // а в ArrayList все элементы хранятся в порядке их добавления

    private static HashSet<String> getEmployees() { // коллекция HashSet <тип данных>
        HashSet<String> employees = new HashSet<>();
        employees.add("Jhon");
        //employees.add("Jhon"); в HashSet нельзя хранить два одинаковых элемента (дубликата)
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }

}
