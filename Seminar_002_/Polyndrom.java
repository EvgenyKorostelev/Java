package Seminar_002_;

/**
 * Напишите метод, который принимает на вход строку (String) и
 * определяет является ли строка палиндромом (возвращает
 * boolean значение).
 */
public class Polyndrom {

    public static void main(String[] args) {
        System.out.println(isPolyndrome("анна"));
    }

    static boolean isPolyndrome(String s) {
        for (int i = 0, k = s.length() - 1; i < k; i++, k--) {
            if (s.charAt(i) != s.charAt(k))
                return false;
        }
        return true;
    }

}