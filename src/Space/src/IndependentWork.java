package Space.src;

public class IndependentWork {
    public static void main(String[] args) {
        String[] month = {"январь", "февраль", "март", "апрель", "май", "июнь",
                          "июль", "август", "сентябрь", "октябрь", "ноябрь" , "декабрь"};
/*
*         System.out.print(month[0] + ", " + month[1] + ", " + month[2] + ", " + month[3] + ", " +
                         month[4] + ", " + month[5] + ", " + month[6] + ", " + month[7] + ", " +
                         month[8] + ", " + month[9] + ", " + month[10] + ", " + month[11] + ".");
* */

        String result = "";
         for (int i = 0; i < month.length; i++) {
             result += month[i];
             if (i == month.length - 1) {
                 result += ".";
             }else {
                 result += ", ";
             }
         }
        System.out.println(result);
    }
}
