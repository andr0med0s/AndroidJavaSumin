package OOP_1;

public class Test {
    static int multiple (int a, int b) {   // добавляем static
        return a * b;
    }
    static double multiple (double a, double b){ // добавляем static
        return  a * b; // Использовать перегрузку когда методы действительно похожи К примеру так нельзя return a - b
    }
    static int multiple (int a){ // добавляем static
        return a * a;
    }

}

 class Main {
     public static void main(String[] args) {

   /*
         Test HomeWork16.HomeWork16.box.test = new Test();

         int result = HomeWork16.HomeWork16.box.test.multiple(6, 5);
         System.out.println(result);

         double result1 = HomeWork16.HomeWork16.box.test.multiple(6.5,3.2);
         System.out.println(result1);

         int res2 = HomeWork16.HomeWork16.box.test.multiple(6);
         System.out.println(res2);

    */
         //  метод стал static можно не создавать новые объекты
         int result = Test.multiple(5); // обращяемся к классу и вызываем статический метод
//         double sqrt = Math.sqrt(36); здесь тоже самое
         System.out.println(result);
     }
}

// Использовать перегрузку когда методы действительно похожи