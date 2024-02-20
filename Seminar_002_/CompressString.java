package Seminar_002_;

/**
 * 📌 Напишите метод, который сжимает строку.
📌 Пример: вход aaaabbbcdd.
результат a4b3c1d2.
 */
public class CompressString {

    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(compreStr(str));

    }

    public static String compreStr(String str){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char c = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == c)
                count++;
            else{
                sb.append(c).append(count);
                c = str.charAt(i);
                count = 1;
            }    
        }
        sb.append(c).append(count);
        return sb.toString();
    }
}