package HelloWorld.src;

public class WhatToEat {

   /* public static void main(String[] args) {
        int moneyInPocket = 50;
        if (moneyInPocket > 500) {
            System.out.println(" Пицца ");
        } else if (moneyInPocket < 100) {
            System.out.println(" Доширак ");
        }
}
   */
   public static void main(String[] args) {

       int money = 12;
       if (money > 10){
           System.out.println("Пицца");
       }else if (money > 6) {
           System.out.println("Гамбургер");
       }else {
           System.out.println("Сэндвич");
       }

   }


}
