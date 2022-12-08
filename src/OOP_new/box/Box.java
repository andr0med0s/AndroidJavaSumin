package OOP_new.box;

public class Box { // шаблон по которому
    // создается  объект
    private double length; // поля // без модификатора доступ по умолчанию внутри одного пакета
    private double width; // определяют состояние
    private double height; // обьекта

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Box() {
//        this.length =  10;
//        this.width =  10;
//        this.height =  10;

        this(10); // конструктор без параметров , который устанавливает всем полям значение 10

    }

    public Box(Box another) { // конструктор в качестве параметра  ...// в качестве параметра конструктору
        // принимающий другой конструктор    ...// можно передавать любые ссылочные типы
        this(another.length, another.width, another.height); // вызываем конструктор
        // передав ему все необходимые параметры
    }

    public Box(double length, double width, double height) { //конструктор по умолчанию создается,
        // но полям присваивает ноль
        // теперь мы обязаны при создании объекта Box передавать поля
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) { // конструктор который принимает один параметр, а внутри вызывает другой конструктор
//        this.length =  size;    // и устанавливает этот параметр всем полям
//        this.width =  size;     // внутри одного конструктора можно вызвать другой конструктор
//        this.height =  size;
        this(size, size, size);
    }

    public void showInfo(){
        System.out.println("Width: " + width + "Length: " + length + "Height: " + height);
    }

    public void setDimens(double length, double width, double height) {
        // this //// обращаемся к переменным экземпляра данного класса,
        // а не обращение к переменным метода
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box copy() {
        // Box box = new Box(this.length, this.width, this.height ); // создается
        // новый объект Box с точно такими же размерами, Копия
        return new Box(this.length, this.width, this.height); // в качестве возвращаемого типа
        // методов можно использовать любой тип данных
        // return box;
    }

    public Box increase() {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
    }

    // void compare(Box another) { // методы в качестве параметра могут
    // принимать другие ссылочные типы
    public int compare(Box another) { // в качестве параметра методу можно
        // передать ссылочный тип
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        int result;
        if (currentVolume > anotherVolume) {
            // System.out.println("Current > Another");
            result = 1;
        } else if (currentVolume < anotherVolume) {
//            System.out.println("Current < Another");
            result = -1;
        } else {
//            System.out.println("Current = Another");
            result = 0;
        }
        return result;
    }

    private double getVolume() {
//        double volume = length * width * height;
//        return volume;
        return length * width * height;
    } // методы орпеделяют поведение объекта

//    double showVolume(){ // когда метод должен просто что то делать
//                        // и не должен возвращять каких-то данных
//                        // можно сделать возвращяемый тип void
//        double volume = length * width * height;
//        System.out.println(volume);
//        return volume; // в этом случае (при использовании void)
//                          ненужно возвращять значения
//    }

    public void showVolume() { // этот метод выполнит действия и ничего не вернет
//        double volume = length * width * height;
//        double volume = getVolume();
//        System.out.println(volume);
        System.out.println(getVolume());
    } // методы орпеделяют поведение объекта

    public double getWidth() {
        return width;
    }

}
