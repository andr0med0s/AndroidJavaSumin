package IndependentWork;

public class Main {
    public static void main(String[] args) {
        LitleBaby baby = new LitleBaby();
        baby.name = "Малой";
        baby.lastName = "Босс";
        baby.walkingSpeed = 15;
        baby.run();
        System.out.println(baby.info());
    }
}
