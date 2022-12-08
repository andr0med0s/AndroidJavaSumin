package OOP_new.box;

public class WeigthBox extends Box{

    private double weight;

    public WeigthBox() {
        this.weight = 10;
    }

    public WeigthBox(Box another, double weigth) {
        super(another);
        this.weight = weigth;
    }

    public WeigthBox(double length, double width, double height, double weigth) {
        super(length, width, height);
        this.weight = weigth;
    }

    public WeigthBox(double size, double weigth) {
        super(size);
        this.weight = weigth;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weight: " + weight);
    }
}
