import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

 
  
    public static void sort(int[] mas) {
        java.time.LocalDate date = java.time.LocalDate.now();
        java.time.LocalDateTime time = java.time.LocalDateTime.now();

        try (FileWriter fw = new FileWriter("log.txt")) {
            fw.write("");
           } 
          catch (Exception e) {
           e.printStackTrace();
           }

      
        int temp = 0;
        int[] tempArr = new int[mas.length];
        for (int j = 0; j < mas.length; j++) {
            System.arraycopy(mas, 0, tempArr, 0, mas.length);
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    temp = mas[i + 1];
                    mas[i + 1] = mas[i];
                    mas[i] = temp;
                }
            }
          
           try (FileWriter fw = new FileWriter("log.txt", true)) {
            fw.write(date + " " + time.getHour() + ":" + time.getMinute()+ " " +Arrays.toString(mas)+'\n');
           } 
           catch (Exception e) {
           e.printStackTrace();
           }
           if(Arrays.equals(mas, tempArr)==true)
                break;
//           System.out.println(Arrays.toString(mas));
        }
        
      
   }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      int[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
      }     
      
      BubbleSort ans = new BubbleSort();      
      ans.sort(arr);

      try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
      
      
        
       
      
    }
}