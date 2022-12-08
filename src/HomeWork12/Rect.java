package HomeWork12;

public class Rect {
    double length;
    double width;

    void setSize (double length, double width) {
        this.length = length;
        this.width = width;
    }
    double perimetr () {
        return length + width;
    }
    double square () {
        return length * width;
    }
}
