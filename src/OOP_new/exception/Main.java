package OOP_new.exception;

public class Main {
/*
    public static void main(String[] args) {
//        int a = 1;
        int a = 0;
        try {
            int b = 7/a;
            int с =Integer.parseInt("fsfsfs");
        }      catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
        catch (Exception e){
            System.out.println("Поймано исключение " + e.getClass());
        }
//        catch (ArithmeticException e) {
//            System.out.println("На ноль делить нельзя");
//        }catch (NumberFormatException e1){
//            System.out.println("NumberFormatException");
//        }
        System.out.println("Hello");
    }
 */

    public static void main(String[] args) {
        int [] numbers = new int[10];
        try {                                   //ctrl + alt + t и выбрать блок try catch
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println("Выход за пределы массива");
        }
    }
}
