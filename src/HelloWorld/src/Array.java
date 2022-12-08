package HelloWorld.src;

public class Array {
    public static void main(String[] args) {
//        String[] namesOfMonth = new String[11];
//        namesOfMonth[0] = "January";
//        namesOfMonth[1] = "February";
//        namesOfMonth[2] = "March";
//        namesOfMonth[3] = "April";
//        namesOfMonth[4] = "May";
//        namesOfMonth[5] = "June";
//        namesOfMonth[6] = "July";
//        namesOfMonth[7] = "August";
//        namesOfMonth[8] = "September";
//        namesOfMonth[9] = "October";
//        namesOfMonth[10] = "November";
////        namesOfMonth[11] = "December";
////       for (int i = 0; i < 12; i++) { // в Выводе : Исключение .. выход за пределы массива , если убрать строку namesOfMonth[11] = "December";
//        for (int i = 0; i < namesOfMonth.length; i++) { // namesOfMonth.length способ предпочтительне так как на лету можно менять размер массива
//            System.out.print(namesOfMonth[i]);
////            if (i < 11){
//            if (i < namesOfMonth.length - 1){
//                System.out.print(", ");
//            } else {
//                System.out.print(".");
//            }
//        }
        int [] numbers = {4, 1, 34, 45, 13, 256};
        for (int i = numbers.length - 1; i >=0; i--) { // numbers.length - 1, а не просто numbers.length потому что элементов 6,
            // а индексов 5 и первый индекс 0 , поэтому количество всех элементов минус 1,
            // что бы можно было обратится к элементам массива
            System.out.println(numbers[i]);
        }
    }
}
