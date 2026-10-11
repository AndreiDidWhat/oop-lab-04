import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        //метод, возвращающий среднее значение списка целых чисел;
        System.out.println(StreamTasks.average(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)));

        //метод, приводящий все строки в списке в верхний регистр и добавляющий к ним префикс «new»;
        System.out.println(StreamTasks.upperCaseWithPrefix(List.of("nif", "naf", "nuf")));

        //метод, возвращающий список квадратов всех встречающихся только один раз элементов списка;
        System.out.println(StreamTasks.squaresOfUnique(List.of(1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9)));

        //метод, принимающий на вход коллекцию и возвращающий ее последний элемент или кидающий исключение, если коллекция пуста;
        System.out.println(StreamTasks.getLastElement(List.of("heh", "haha", "hoho")));
        try {
            StreamTasks.getLastElement(List.of());
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        //метод, принимающий на вход массив целых чисел, возвращающий сумму чётных чисел или 0, если чётных чисел нет;
        System.out.println(StreamTasks.sumOfEven(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(StreamTasks.sumOfEven(new int[]{1, 3, 5, 7, 9}));

        //метод, преобразовывающий все строки в списке в Map, где первый символ – ключ, оставшиеся – значение;
        System.out.println(StreamTasks.toMapByFirstChar(List.of("car", "plane", "boat")));
    }
}