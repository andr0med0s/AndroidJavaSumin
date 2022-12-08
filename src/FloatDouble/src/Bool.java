public class Bool {
    public static void main(String[] args) {
       // int temp = 26;
        // int temp = 20;
        //  int temp = 40;
        int temp = 22;
        int time = 24;
        boolean late = time >= 23;
        boolean hot = temp > 25;
       /* if (temp > 25) {
            System.out.println("Кондиционер включен");
        }
        */

        if (!hot && late) {   // одно из условий не выполненео
            System.out.println("Кондиционер выключен");
        }
        /*
        *         if (!hot || late) {
            System.out.println("Кондиционер выключен");
        }
        * */

        /* if (hot) {
            System.out.println("Кондиционер включен");
        }

         */
    }
}
