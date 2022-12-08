package HomeWork16_Lesson17.box;

public class Box {
   private double width;
   private double heigth;
   private double length;

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

    public Box() {
        width = 0;
        heigth = 0;
        length = 0;
    }

    public  Box(Box box) {
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

    public Box (Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.heigth = box1.heigth + box2.heigth;
        this.length = box1.length + box2.length;
    }

    public Box increase(int i) {
        return new Box(width *i, heigth * i, length * i);
      //  return HomeWork16.HomeWork16.box;
    }

    public void setDimens(double width, double heigth, double length) {
        this.width = width;
        this.heigth = heigth;
        this.length = length;
    }

    public Box sumBox (Box box) {
        return new Box(this.width + box.width, this.heigth + box.heigth, this.length + length);
    }

    public double volume() {
        return width * heigth * length;
        //  return volume;
        // System.out.println(volume);
    }

    public void showVolume() {
        // double volume = width * heigth * length;
        //  double volume = volume();
        //    System.out.println(volume);
        System.out.println(volume());
    }

    public int compare (Box box) {
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

    public double getWidth() {
        return width;
    }

    public double getHeigth() {
        return heigth;
    }

    public double getLength() {
        return length;
    }
}

