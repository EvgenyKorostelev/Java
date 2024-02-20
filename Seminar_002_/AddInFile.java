package Seminar_002_;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * Напишите метод, который составит строку, состоящую из 100
 * повторений слова TEST и метод, который запишет эту строку в
 * простой текстовый файл, обработайте исключения.
 * 
 * 
 */
public class AddInFile {
    public static void main(String[] args) {
        String str = "TEST";
        int count = 100;
        String result = repeattWord(str, count);
        writeToFile(result, "temp.txt");
    }

    public static String repeattWord(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str).append(' ');
        }
        return sb.toString();
    }

    public static void writeToFile(String str, String fileName ){

        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(str);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // FileWriter fw = null;
        // try {
        //     fw = new FileWriter(fileName);
        //     fw.write(str);
        // }
        //  catch (Exception e) {
        //     e.printStackTrace();
        // }
        // finally {
        //     try{
        //         fw.close();
        //     }
        //     catch(Exception e){
        //         e.printStackTrace();
        //     }
        // }
    }
}