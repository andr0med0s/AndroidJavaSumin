package OOP_new.example;

public class Rectangle {
    double width;
    double heigth;

    void setDimens(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    double getSquare() {
        return width * heigth;
    }
}
