package OOP_new.example;

public class Monster {
    int eyes;
    int hands;
    int feet;


Monster () {
    this(2);
}

Monster (int amount){
    this(amount, amount,amount);
}

Monster (int eyes, int hands, int feet){
    this.eyes = eyes;
    this.hands = hands;
    this.feet = feet;
}

void voice() {
//    System.out.println("Grrrrrrrrrrrrr....");
    voice(1);
}

void voice(int count) {
//    for(int i = 0; i < count; i++){
//        System.out.println("Grrrrrr....");
//    }
    voice(count,"Grrrrrr....");
}

    void voice(int count, String word) {
        for(int i = 0; i < count; i++){
            System.out.println(word);
        }
    }

}