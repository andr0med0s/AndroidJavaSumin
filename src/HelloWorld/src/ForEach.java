package HelloWorld.src;

public class ForEach {
    public static void main(String[] args) {
//        String[] names = {
//                "Helen",
//                "Max",
//                "John",
//                "Alex"
//        };
//
//        System.out.println("------");
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//            // индексы массива никак не используются, а назначение цикла вытащить значение
//            // то можно использовать специальную форму цикла for которая называется  for each
//        }
//
//        System.out.println("------");
//
//        for(String name : names) { // по порядку будем вытаскивать элементы из массива..
//                                    // .массив строковый указываем тип даем имя переменной по аналогии с названием массива..
//                                    // . двоеточие и название массива откуда вытаскиваются данные
//            System.out.println(name);
//        }

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 100;
        }
        for(int number : numbers){
            System.out.println(number);
        }
    }
}
