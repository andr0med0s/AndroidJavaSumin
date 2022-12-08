public class Triangle {
    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        //double c = Math.sqrt((a*a) + (b*b)); Гипотенуза равна: 22.360679774997898
        double c = Math.sqrt(a*a + b*b); //Гипотенуза равна: 22.360679774997898
        System.out.println("Гипотенуза равна: " + c);
    }
}
