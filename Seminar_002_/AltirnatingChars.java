package Seminar_002_;

/**
 * 📌 Дано четное число N (>0) и символы c1 и c2.
 * 📌 Написать метод, который вернет строку длины N, которая
 * состоит из чередующихся символов c1 и c2, начиная с c1.
 */
public class AltirnatingChars {
    public static void main(String[] args) {
        int n = 500_000;
        char c1 = 'G';
        char c2 = 'b';

        long start = System.currentTimeMillis();
        getAltirnatingCharsStr(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

        long start1 = System.currentTimeMillis();
        getAltirnatingCharsSb(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start1);

    }

    public static String getAltirnatingCharsStr(int n, char c1, char c2) {
        String str = "";
        for (int i = 0; i < n / 2; i++) {
            str += Character.toString(c1) + Character.toString(c2);
        }
        return str;
    }

    public static String getAltirnatingCharsSb(int n, char c1, char c2) {

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
        }
        return sb.toString();
    }
}