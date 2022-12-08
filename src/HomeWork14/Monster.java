package HomeWork14;

public class Monster {
    int numberEyes;
    int numberLegs;
    int numberHands;

    Monster () {
        this.numberEyes = 2;
        this.numberLegs = 2;
        this.numberHands = 2;
    }

    Monster (int numberEyes) {
        this.numberEyes = numberEyes;
        this.numberLegs = 2;
        this.numberHands = 2;
    }

    Monster (int numberEyes, int numberLegs) {
        this.numberEyes = numberEyes;
        this.numberLegs = numberLegs;
        this.numberHands = 2;
    }

    Monster (int numberEyes, int numberLegs, int numberHands) {
        this.numberEyes = numberEyes;
        this.numberLegs = numberLegs;
        this.numberHands = numberHands;
    }

    void voice() {
        System.out.println("Возглас");
    }

    void voice(int n) {
        for(int i = 0; i < n; i++){
            System.out.print("Голос ");
        }
        System.out.println();
    }



    void voice(int n, String word) {
        for(int i = 0; i < n; i++){
            System.out.print(word);
        }
    }
}
