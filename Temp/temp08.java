import java.util.*;

public class temp08 {
    //    Напишите программу, представляющую телефонную книгу. Программа должна иметь следующие функции:
//    ```add(String name, Integer phoneNum)```: Добавляет запись в телефонную книгу.
//    Если запись с именем ```name``` уже существует, добавляет новый номер телефона в существующую запись.
//    Если запись с именем ```name``` не существует, создает новую запись с этим именем и номером телефона ```phoneNum```.
//    ```find(String name)```: Поиск номеров телефона по имени в телефонной книге.
//    Если запись с именем name существует, возвращает список номеров телефона для этой записи.
//    Если запись с именем name не существует, возвращает пустой список.
//    ```getPhoneBook()```: Возвращает всю телефонную книгу в виде ```HashMap```, где ключи - это имена, а значения - списки номеров телефона.
    public static void main(String[] args) {
        Map<String, List<Integer>> PhoneBook = new HashMap<>();
        String n = "Amika"; Integer p = 8888888;
        String t = "Evgeny"; Integer r = 7777777;

        add(n, p, PhoneBook);
        add(t, r, PhoneBook);
        System.out.println(find("Me", PhoneBook));

        System.out.println(getPhoneBook(PhoneBook));

    }

    public static void add(String name, Integer phoneNum,
                           Map<String, List<Integer>> map) {
            if (map.containsKey(name)) {
                List<Integer> list = map.get(name);
                list.add(phoneNum);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(phoneNum);
                map.put(name, list);
            }
    }

    public static List<Integer> find(String name, Map<String, List<Integer>> map){
        return map.get(name);
    }
    public static Map<String, List<Integer>> getPhoneBook(Map<String, List<Integer>> map){
        return map;
    }

}


//static void task3(String str){
//    String[] words = str.split(" ");
//    Map<Integer, List<String>> map = new TreeMap<>();
//    for (String word : words){
//        int len = word.length();
//        if(map.containsKey(len)){
//            List<String> list = map.get(len);
//            list.add(word);
//        } else {
//            List<String> list = new ArrayList<>();
//            list.add(word);
//            map.put(len, list);
//        }
//    }
//    System.out.println(map);
//}
