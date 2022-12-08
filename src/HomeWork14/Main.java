package HomeWork14;

public class Main {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
       // Monster monster2 = new Monster(3);
        Monster monster2 = new Monster(3,4);
        Monster monster3 = new Monster(3,4,5);

        monster1.voice();
        monster2.voice(3);
        monster3.voice(4,"Я монстр!  ");
    }
}
