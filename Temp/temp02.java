import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;



/**
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после
 * каждой итерации запишите в лог-файл.
 * Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на
 * вход один параметр: * int[] arr - числовой массив
 * После каждого прохода по массиву ваш код должен делать запись в лог-файл *
 * 'log.txt'
 * в формате год-месяц-день час:минуты {массив на данной итерации}.
 * Для логирования использовать логгер logger класса BubbleSort.
 */
public class temp02 {
    static Logger logger = Logger.getLogger(temp02.class.getName());

    public static void main(String[] args) {

        try {
            
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            
            SimpleFormatter txt = new SimpleFormatter();
            
            fh.setFormatter(txt);
        } catch (Exception e) {

        }

        int[] arr = new int[] { 9, 4, 8, 3, 1 };

        int temp = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            logger.info(Arrays.toString(arr));
        }

    }

}