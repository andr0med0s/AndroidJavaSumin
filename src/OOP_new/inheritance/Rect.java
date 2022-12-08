package OOP_new.inheritance;

public  class Rect extends Shape{ // каждый наследник может быть родителем для других классов
// final запрет на наследование и в данном примере невозможно унаследоваться ColoredRed будет ошибка

    // класс шейп имеет не пустой конструктор ,
    // поэтому переопределяем его
    public Rect(int a, int b) {
        super(a, b);
    }

//    public int getA() {
//        return 100;
//    }

    // и переопределяем метод гет периметр
    @Override
    public int getPerimetr() {
        return (getA() + getB())*2;
    }
}
