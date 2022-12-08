public class Space1 {
    public static void main(String[] args) {
        int numberOfMonth = 4;
        /*   if (numberOfMonth == 1) {
            System.out.println("Январь");
        } else if (numberOfMonth == 2) {
            System.out.println("Февраль");
        } else if (numberOfMonth == 3) {
            System.out.println("Март");
        } else if (numberOfMonth == 4) {
            System.out.println("Апрель");
        } else if (numberOfMonth == 5) {
            System.out.println("Май");
        } else if (numberOfMonth == 6) {
            System.out.println("Июнь");
        } else if (numberOfMonth == 7) {
            System.out.println("Июль");
        } else if (numberOfMonth == 8) {
            System.out.println("Август");
        } else if (numberOfMonth == 9) {
            System.out.println("Сентябрь");
        } else if (numberOfMonth == 10) {
            System.out.println("Октябрь");
        } else if (numberOfMonth == 11) {
            System.out.println("Ноябрь");
        } else if (numberOfMonth == 12) {
            System.out.println("Декабрь");
        }else {
            System.out.println("Месяц не существует");
        }
        */
        switch (numberOfMonth) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Месяц не существует");
                break;
        }
    }
}
