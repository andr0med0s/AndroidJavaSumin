package OOP;

public class Main {
    public static void main(String[] args) {
        /*
        ////////
         Box myBox;
         myBox = new Box();
         //////
        Box myBox = new Box();
        myBox.heigth = 10.2;
        myBox.length = 15;
        myBox.width = 11.3;

        Box box2 = new Box();
        Box box3 = new Box();

        box2.length = 5;
        box2.heigth = 5;
        box2.width = 5;

        box3.heigth = 10;
        box3.length = 10;
        box3.width =10;

        Box box4 = box3;
        box4.heigth = 100;

        double volume = myBox.heigth * myBox.length * myBox.width;
        double volume2 = box2.heigth * box2.length * box2.width;
        double volume3  = box3.heigth * box3.length * box3.width;

        System.out.println("Объем первой коробки " + volume + "\nОбъем второй коробки " + volume2 + "\nОбъем третьей коробки " + volume3);

         */
    /*    Box box1 = new Box();
        Box box2 = new Box();

        box1.length = 5;
        box1.heigth = 5;
        box1.width = 5;
        box2.length = 10;
        box2.heigth = 10;
        box2.width = 10;
//        box1.showVolume();
//        box2.showVolume();

        double volume1 = box1.volume();
        double volume2 = box2.volume();
        System.out.println(volume1);
        System.out.println(volume2);

     */
/*
        Box HomeWork16.HomeWork16.box = new Box();
        HomeWork16.HomeWork16.box.setDimens(15, 15,15);
        System.out.println(HomeWork16.HomeWork16.box.volume());
* */
        /*
        Box HomeWork16.HomeWork16.box = new Box(10, 15, 20);
        System.out.println(HomeWork16.HomeWork16.box.volume());

        Box box2 = new Box(30, 30, 30 );
        System.out.println(box2.volume());

         */
/*        Box HomeWork16.HomeWork16.box = new Box(100);
        Box box2 = new Box(15, 20, 25);
        /* HomeWork16.HomeWork16.box.showVolume();
        box2.showVolume();
        Box box3 = new Box();
        box3.showVolume();
         */
//        HomeWork16.HomeWork16.box.compare(box2);
 //       int result =  HomeWork16.HomeWork16.box.compare(box2);

        Box box1 = new Box(10);
        Box box2 = box1.increase(3);
 //       Box box2 = new Box(box1);
 //       box1.setDimens(100, 100, 100);
/*        int result = box1.compare(box2);

        switch (result){
            case -1:
                System.out.println("Наша коробка меньше");
                break;
            case 0:
                System.out.println("Коробки равны");
                break;
            case 1:
                System.out.println("Наша коробка больше");
                break;
        }

 */
        box1.showVolume();
        box2.showVolume();
    }
}
