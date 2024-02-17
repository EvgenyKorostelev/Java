import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Sem1 {
    public static void main(String[] args) {

        System.out.println(task4(0, 2));
    }

//    Написать программу, которая запросит пользователя ввести
//    <Имя> в консоли.
//    Получит введенную строку и выведет в консоль сообщение
//“Привет, <Имя>!”
//    Задание №1+
//    В консоли запросить имя пользователя. В зависимости от
//    текущего времени, вывести приветствие вида
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
//            "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    static void task0() {
        System.out.println("What is you name?: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();
        if (hour >= 5 && hour < 12) System.out.println("Good morning! " + name);
        else if (hour < 18) System.out.println("Good afternoon! " + name);
        else if (hour < 23) System.out.println("Good evening! " + name);
        else System.out.println("Good night! " + name);
    }

//    Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
//    максимальное количество подряд идущих 1.
    static void task1() {
        int[] array = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxOnes = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) count++;
            if (array[i] == 0 || i == array.length - 1) {
                if (count > maxOnes) {
                    maxOnes = count;
                }
                count = 0;
            }
        }
        System.out.println(maxOnes);
    }

//    Дан массив nums = [3,2,2,3] и число val = 3.
//    Если в массиве есть числа, равные заданному, нужно перенести
//    эти элементы в конец массива.
//    Таким образом, первые несколько (или все) элементов массива
//    должны быть отличны от заданного, а остальные - равны ему

    static  void task2(){
        int[] nums = {3,2,2,3,2,6,83,3,3,3,21,5,32,6,2,3};
        int val = 3;
        int[] tempArr = new int [nums.length];
        Arrays.fill(tempArr, val);
        int count = 0;
        for (int i = 0; i < tempArr.length; i++) {
            if(nums[i] != val){
                tempArr[count++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(tempArr));
    }

//    Во фразе "Добро пожаловать на курс по Java" переставить слова
//    в обратном порядке.
    static void task3(String str){
        str = str.toLowerCase(Locale.ROOT);
        String[] strArr = str.split(" ");
        for (int i = strArr.length - 1; i >= 0 ; i--) {
            System.out.print(strArr[i] + " ");
        }
    }

//    Реализовать функцию возведения числа а в степень b. a, b из Z.
//    Сводя количество выполняемых действий к минимуму.
//    Пример 1: а = 3, b = 2, ответ: 9
//    Пример 2: а = 2, b = -2, ответ: 0.25
//    Пример 3: а = 3, b = 0, ответ: 1

    static double task4(double a, int b){
        double result = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            result *= a;
        }
        return b > 0 ? result : 1/result;
    }
}
