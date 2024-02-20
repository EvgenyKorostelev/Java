package Seminar_002_;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * 📌 Напишите метод, который вернет содержимое текущей папки в виде
 * массива строк.
 * 📌 Напишите метод, который запишет массив, возвращенный предыдущим
 * методом в файл.
 * 📌 Обработайте ошибки с помощью try-catch конструкции. В случае
 * возникновения исключения, оно должно записаться в лог-файл.
 */
public class LoggerUse {
    static Logger logger = Logger.getLogger(LoggerUse.class.getName());

    public static void main(String[] args) {
        getLog();
        writeArrayToFile(getContentFolder("."), ".");
    }

    public static String[] getContentFolder(String folderName) {
        File folder = new File(folderName);
        return folder.list();
    }

    public static void writeArrayToFile(String[] arr, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            if (arr == null)
                return;
            for (int i = 0; i < arr.length; i++) {
                fileWriter.write(arr[i]);
                fileWriter.write(System.lineSeparator());
            }
        } catch (IOException e) {
            logger.log(Level.WARNING, e.getMessage());
        }
    }

    public static void getLog() {
        try {
            FileHandler fileHandler = new FileHandler("log.txt");
            logger.addHandler(fileHandler);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
        } catch (Exception e) {

        }
    }

}