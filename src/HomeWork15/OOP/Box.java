package HomeWork15.OOP;

public class Box {
    double width;
    double heigth;
    double length;

    Box (double width, double heigth, double length) {
        this.width = width;
        this.heigth = heigth;
        this.length = length;
    }

    Box (double size) {
        width = size;
        heigth = size;
        length = size;
    }

    Box () {
        width = 0;
        heigth = 0;
        length = 0;
    }

    Box (Box box) {
        this.width = box.width;
        this.heigth = box.heigth;
        this.length = box.length;
    }

    Box (Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.heigth = box1.heigth + box2.heigth;
        this.length = box1.length + box2.length;
    }

    void setDimens (double width, double heigth, double length) {
        this.width = width;
        this.heigth = heigth;
        this.length = length;
    }

    Box increase (int i) {
        return new Box(width * i, heigth * i, length * i);
    }

    Box sumBox (Box box) {
        return new Box(this.width + box.width, this.heigth + box.heigth, this.length + length);
    }

    double volume () {
        return width * heigth * length;
    }

    void showVolume() {
        System.out.println(volume());
    }

    int compare (Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;
        if (thisVolume > boxVolume) {
            result = 1;
        } else if (thisVolume < boxVolume) {
            result = -1;
        } else {
            result = 0;
        } return result;
    }
}
