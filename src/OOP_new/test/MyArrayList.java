package OOP_new.test;

public class MyArrayList {
    private String[] array = new String[10]; // массив типа String на 10 элементов
    private int size = 0;

    public String get(int index) {
        return array[index]  ;
    } // Для того что бы получать элементы из коллекции

    public void add(String element) { // метод add в качестве параметра принимает строку (добавляем элемент) которую хотим добавить в коллекцию
        array[size] = element;
        size++;
        if (size == array.length) {                            // если массив заполнен, то увеличиваем его размер вдвое
            String[] newArray = new String[array.length * 2]; // новый массив с размером x2
            for (int i = 0; i < array.length; i++) { // циклом переносим все элементы в новый массив
                newArray[i] = array[i];
            }
            array = newArray; // в старую переменную array положили новый массив
        }
    }
// метод удаления по индексу
    public void remove(int index) { // в качестве параметра принимает позицию элемента и цикл начинается с этого индекса
        for (int i = index; i < size - 1; i++) { // size -1 минус один для того чтобы не выйти за размеры
            array[i] = array[i + 1]; // элемент смещается и меняется индекс ... когда по циклу дойдет до 9 и нужно присвоить 10
                                                // выпадет ошибка выход за границы , для этого size -1 //
        }
        array[size] = null; // последнему элементу присвоим null
        size--;             // и уменьшим на единицу
    }
// метод удаления по строке (содержимому)
    public void remove(String element) {
        for (int i = 0; i < size; i++) {
//            if (element == array[i]) {  \\ если элемент который хотим удалить совпадает с элементом массива
            if (element.equals(array[i])) { // способ сравнения предпочтительнее
                remove(i); // то удаляем используя уже имеющийся метод
                return;
            }
        }
    }
    // для того чтобы узнавать размер (поле size приватное) создаем геттер
    public int getSize() {
        return size;
    }
}

