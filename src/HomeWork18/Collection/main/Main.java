package HomeWork18.Collection.main;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Никита");
        employees.add("Игорь");
        employees.add("Сергей");
        employees.add("Катя");
        employees.add("Ира");
        employees.add("Петр");
        employees.add("Andre");
        employees.remove("Ира");
        employees.remove("Андре");

        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }


    }
}
