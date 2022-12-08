package HelloWorld.src;

public class FamilyAges {
    public static void main(String[] args) {
        int john = 23;
        int max = 17;
        int helen = 37;
        int sum = john + max + helen;
//        double sum = john + max + helen;
//        double average = (double)sum / 3; // sum - тип int; 3 - тип int; average - тип int
                                            // (приводим sum - тип int к sum - тип double)
        double average = sum / 3.0; // или укажем делить на дробное - тип double
        System.out.println("John : " + john + " !");
        System.out.println("Max: " + max + " !");
        System.out.println("Helen: " + helen + " !");
        System.out.println();
        System.out.println("Средний возраст = " + average);
    }
}
