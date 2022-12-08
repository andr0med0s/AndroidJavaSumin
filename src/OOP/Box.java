package OOP;

public class Box {
    double width; // поля/ переменные экземпляра / состояния объекта
    double heigth;
    double length;

    public Box(double width, double heigth, double length) {
        this.width = width;
        this.heigth = heigth;
        this.length = length;
    }

    public Box(double size) {
        width = size;
        heigth = size;
        length = size;

    }

    Box() {
        width = 0;
        heigth = 0;
        length = 0;
    }

    Box(Box box) {
        this.width = box.width;
        this.heigth = box.heigth;
        this.length = box.length;
    }

    /*
*      Box(double width, double heigth, double length) {
        this.width = width;
        this.heigth = heigth;
        this.length = length;
    }
* */

/*
*     Box (){
        width = 10;
        heigth = 10;
        length = 10;
    }

* */

    Box increase(int i) {
        return new Box(width *i, heigth * i, length * i);
      //  return HomeWork16.HomeWork16.box;
    }

    void setDimens(double width, double heigth, double length) {
        this.width = width;
        this.heigth = heigth;
        this.length = length;
    }

    double volume() {
        return width * heigth * length;
        //  return volume;
        // System.out.println(volume);
    }

    void showVolume() {
        // double volume = width * heigth * length;
        //  double volume = volume();
        //    System.out.println(volume);
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
        }
        return result;
    }
}

