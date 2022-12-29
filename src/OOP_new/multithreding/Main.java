package OOP_new.multithreding;

import java.util.Random;

public class Main {
//    static boolean isFive = false;
//    public static void main(String[] args) {
////        boolean isFive = false;
////        Timer timer = new Timer();
////        Thread thread = new Thread(timer);
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10_000_000; i++){
//                    if(i==5){
//                        isFive = true;
//                    }
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//
//                    }
//                }
//            }
//        });
//        thread.start();
////        for (int i = 0; i < 10_000_000; i++){
////            System.out.println(2);
////        }
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10_000_000; i++){
//                    if (isFive) {
//                        break;
//                    }
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//
//                    }
//                }
//            }
//        });
//        thread2.start();
//    }
    static boolean winner = false;
public static void main(String[] args) {
    int bound = 1_000_000_000;
    Random randome = new Random();
    int number = randome.nextInt(bound);
    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            int option;
            do{
                option = randome.nextInt(bound);
            } while(option != number);
//            int
//            while(option != number) {
//                option = randome.nextInt(1_000_000_000);
//            }
            winner = true;
            System.out.println("Winner: " + option);
        }
    });
    thread.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000_000; i++){
                    if (winner) {
                        break;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
            }
        });
        thread2.start();
    }
}

