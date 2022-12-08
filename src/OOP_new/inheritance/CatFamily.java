package OOP_new.inheritance;

public class CatFamily {
   // private int legs; // если модификатор доступа private,
    protected int legs;
    // то доступ только внутри класса снаружи незьзя обратиться ,
    // даже наследникам класса
    // есть два варианта: первый установить setter-ы
    // второй установить  модификатор доступа protected
//    private int eyes;
//    private boolean  canEatPerson;
    protected int eyes;
    protected boolean  canEatPerson;


//    public CatFamily(){ // создаем пустой конструктор и установим параметры
//        legs = 4;
//        eyes = 2;
//        canEatPerson = true;
 //   }


    public CatFamily(int legs, int eyes, boolean canEatPerson) {
        this.legs = legs;
        this.eyes = eyes;
        this.canEatPerson = canEatPerson;
    } // теперь нет конструктора без параметров
    // и его нужно вызывать вручную

    public void eat() {
        System.out.print("Кушаю ");
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public boolean isCanEatPerson() { // для типа boolean их
        // название начинается с is
        return canEatPerson;
    }
}
