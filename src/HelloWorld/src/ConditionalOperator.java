package HelloWorld.src;

/*
* package HelloWorld.src;

public class Temp {
    public static void main(String[] args) {
        int temp = 23;
        if ( temp > 25){ // в круглых скобках условие которое будем проверять
            System.out.println(" Кондиционер включен  "); // в фигурных скобках пишем код который будет выполняться если условие true
        }else if ( temp < 22 ){ // else добавляется если добавляется действие при не выполнении условия false
            System.out.println(" Кондиционер выключен ");
        }else {
            System.out.println(" Кондиционер простаивает ");
        }
    }
}
* */

public class ConditionalOperator {
    public static void main(String[] args) {
        int temp = 30;
        boolean hot = temp >= 25;
        boolean cold = temp <= 22;
        int time = 23;
        boolean isNight = time > 22 || time < 6; // логическое или результат всего выражения будет true ,
                                                // если хотя бы одно из выражений вернет true
        if (hot && !isNight) { // логическое и результат всего выражения будет true , если оба выражения вернут true
            System.out.println("Кондиционер включен");
        } else if(cold) {
            System.out.println("Кондиционер выключен");
        } else {
            System.out.println("Кондиционер ничего не делает");
        }
    }
}
