package IndependentWork;

public class LitleBaby {
    String name;
    String lastName;
    int walkingSpeed;

    void run() {
        String result = "";
        for (int i = 0; i < walkingSpeed; i++ ){
            result +="топ-шлеп";

            //Последнее ли топ-шлеп в сравнении со скоростью ходьбы
            //Если последнее ставим точку, иначе запятая и пробел

            if (i == walkingSpeed - 1){
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }
    String info () {
        return "Имя: " + name + " Фамилия: " + lastName + " Скорость: " + walkingSpeed;
    }
}
