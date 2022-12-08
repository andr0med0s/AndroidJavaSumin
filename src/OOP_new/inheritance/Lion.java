package OOP_new.inheritance;

public class Lion extends CatFamily{
  //  public Lion () { // по умолчанию создается пустой конструктор
        // без параметров
      //  super();// первым вызывается конструктор супер класса в
        // котором присваиваются все значения
  //  }
    public Lion (){
        super(4,2,true);
    }

   // @Override // анотация переопределения
    // комбинация ctrl + O(не ноль) добавить анотацию
//    public void eat() {
//        System.out.println("Кушаю антилопу");
//    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("_антилопу");
    }
}
