//📔 **Текст задачи:**
//   Создать структуру для хранения Номеров паспортов и
//   Фамилий сотрудников организации.
//
//123456 Иванов
//321456 Васильев
//234561 Петрова
//234432 Иванов
//654321 Петрова
//345678 Иванов
//    Вывести данные по сотрудникам с фамилией Иванов.
public class Passports {
    private Map<String, String> map = new HashMap<>();

    public void add(String passNum, String lastName){
        map.put(passNum, lastName);
    }

    public String getByPassNum(String passNum){
        return passNum + " : " + map.get(passNum);
    }

    public String getByLastName(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (var entry : map.entrySet()){
            if(entry.getValue().equals(lastName)){
                stringBuilder.append(entry.getKey())
                        .append(" : ")
                        .append(lastName)
                        .append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public String getAll(){
        return map.toString();
    }

}
//📔 **Текст задачи:**
//Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
//1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
//2. буква может не меняться, а остаться такой же. (Например, note - code)
//Пример 1:
//Input: s = "foo", t = "bar"
//Output: false
//Пример 2:
//Input: s = "paper", t = "title"
//Output: true
static boolean task0(String str1, String str2){
    Map<Character , Character> map = new HashMap<>();
    if(str1.length() != str2.length()) return false;
    char[] c1 = str1.toCharArray();
    char[] c2 = str2.toCharArray();
    for (int i = 0; i < c1.length; i++) {
        if(map.containsKey(c1[i])){
            if(map.get(c1[i]) != c2[i]) return false;
        } else {
            map.put(c1[i], c2[i]);
        }
    }
    return true;
}
//📔 **Текст задачи:**
// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
//Пример 2: [a+(1*3) - ложь
//Пример 3: [6+(3*3)] - истина
//Пример 4: {a}[+]{(d*3)} - истина
//Пример 5: <{a}+{(d*3)}> - истина
//Пример 6: {a+]}{(d*3)} - ложь
static boolean task1(String str){
    Stack<Character> stack = new Stack<>();//((1-2(4+4)(2*3))
    char[] c = str.toCharArray();
    for (int i = 0; i < c.length; i++) {// <{[
        if(c[i] == '(') stack.push(c[i]);
        if(c[i] == ')'){
            if(stack.isEmpty() || stack.pop() != '(') return false;
        }
    }
    return stack.isEmpty();
}

static boolean task2(String str) {
    Map<Character,Character> characterMap = new HashMap<>();
    characterMap.put('{', '}');
    characterMap.put('(', ')');
    characterMap.put('<', '>');
    characterMap.put('[', ']');

    Stack<Character> stack = new Stack<>();

    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
        if(characterMap.containsKey(chars[i])) {
            stack.push(chars[i]);
        }
        if (characterMap.containsValue(chars[i])){
            if(stack.isEmpty() || characterMap.get(stack.pop()) != chars[i]) return false;
        }
    }
    return stack.isEmpty();
}

//📔 **Текст задачи:**
//Взять набор строк, например,Мороз и солнце день чудесный
// Еще ты дремлешь друг прелестный Пора красавица проснись.
//Написать метод, который отсортирует эти строки по длине с
// помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
static void task3(String str){
    String[] words = str.split(" ");
    Map<Integer, List<String>> map = new TreeMap<>();
    for (String word : words){
        int len = word.length();
        if(map.containsKey(len)){
            List<String> list = map.get(len);
            list.add(word);
        } else {
            List<String> list = new ArrayList<>();
            list.add(word);
            map.put(len, list);
        }
    }
    System.out.println(map);
}
