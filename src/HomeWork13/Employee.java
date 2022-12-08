package HomeWork13;

public class Employee {
    String name;
    String position;
    double salary;

    Employee (String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String getInfoEmployee (int month) {
        return "Имя : " + name + ". Должность : " + position + ". За последние : " + month + " месяцев" + ". Полученно зарплаты : " + salary * month + " рублей.";
    }
}
 class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Иван","Программист", 10000.550);
        System.out.println(employee.getInfoEmployee(12));
    }
}
