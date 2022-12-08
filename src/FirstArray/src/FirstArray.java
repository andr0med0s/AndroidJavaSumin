package FirstArray.src;

public class FirstArray {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) { // в данном цикле меняется массив, т.е присваиваются новые значения его элементам
            nums[i] = i * 10;
        }
        //   for (int i = 0; i < nums.length; i++) { // массив не меняется
        //    System.out.println(nums[i]);
        //}
        for (int i : nums) {
            System.out.println(i);
        }
        char[] chars = new char[10];
        for (char ch : chars) {
            System.out.println(ch);
        }
        for (int i = 0, j = 1000; i < 1000; i++, j--) {

        }

     /*   int [] daysInMonth = new int[12];
        daysInMonth[0] = 31;
        daysInMonth[1] = 28;
        daysInMonth[2] = 31;
        daysInMonth[3] = 30;
        daysInMonth[4] = 31;
        daysInMonth[5] = 30;
        daysInMonth[6] = 31;
        daysInMonth[7] = 31;
        daysInMonth[8] = 30;
        daysInMonth[9] = 31;
        daysInMonth[10] = 30;
        daysInMonth[11] = 31;
//        int march = daysInMonth[2];
//        System.out.println(march);
//        for (int i = 0; i <= 12; i++) { --- выход за размер массива ArrayIndexOutOfBoundsException ....Index 12 out of bounds for length 12...  нет индекса 12
//            System.out.println(daysInMonth[i]);
//        }
        for (int i = 0; i < daysInMonth.length; i++){
            System.out.println(daysInMonth[i]);
        } */
    }
}
