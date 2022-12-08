package HelloWorld.src;

public class SwitchCase {
    public static void main(String[] args) {
        int month = 0;// если нужно выполнять различные действия (вывод месяца в консоль)
                    // в зависимости от одной переменной int month,
                    // то можно воспользоваться конструкцией switch case
        switch (month) { // в круглых скобках указывается переменная
                        // которая будет сравниваться
            case 1: // проверка действия
                System.out.println("January"); // вывод если верно
                break; // выход из конструкции
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default: // вывод по умолчанию если ничего не подошло
                System.out.println("Unknown month");
        }


//        if (month == 1) {
//            System.out.println("January");
//        }else if (month == 2) {
//            System.out.println("February");
//        }else if (month == 3) {
//            System.out.println("March");
//        }else if (month == 4) {
//            System.out.println("April");
//        }else if (month == 5) {
//            System.out.println("May");
//        }else if (month == 6) {
//            System.out.println("June");
//        }else if (month == 7) {
//            System.out.println("July");
//        }else if (month == 8) {
//            System.out.println("August");
//        }else if (month == 9) {
//            System.out.println("September");
//        }else if (month == 10) {
//            System.out.println("October");
//        }else if (month == 11) {
//            System.out.println("November");
//        }else if (month == 12) {
//            System.out.println("December");
//        }

    }
}
/*
* package HomeWork9.src;

public class Seasons {
    public static void main(String[] args) {
       String month = "Октябрь";
//
//        if (month.equals("Декабрь") || month.equals("Январь") || month.equals("Февраль")) {
//            System.out.println("Зима");
//        } else if (month.equals("Март") || month.equals("Апрель") || month.equals("Май")) {
//            System.out.println("Весна");
//        } else if (month.equals("Июнь") || month.equals("Июль") || month.equals("Август")) {
//            System.out.println("Лето");
//        } else if (month.equals("Сентябрь") || month.equals("Октябрь") || month.equals("Ноябрь")) {
//            System.out.println("Осень");
//        } else {
//            System.out.println("Такого времяни года Нет!");
//        }

  //      month = "Июнь";

        switch (month) {
            case "Декабрь":
            case "Январь":
            case "Февраль":
                System.out.println("Зима");
                break;
            case "Март":
            case "Апрель":
            case "Май":
                System.out.println("Весна");
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                System.out.println("Лето");
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого времени годя нет ");
                break;
        }
    }
}

* */