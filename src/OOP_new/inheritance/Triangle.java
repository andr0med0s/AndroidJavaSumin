package OOP_new.inheritance;

public class Triangle extends Shape {

    private int c;

    public Triangle(int a, int b, int с ) {
        super(a, b);
        this.c = с;
    }

    @Override
    public int getPerimetr() {
        return getA() + getB() + c;
    }
}
