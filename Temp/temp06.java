import java.util.LinkedList;
import java.util.Objects;
//Дан LinkedList с несколькими элементами разного типа. В
// методе revert класса LLTasks реализуйте разворот этого списка
// без использования встроенного функционала.
public class temp06 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(1);
        list.add("One");
        list.add(2);
        list.add("Two");
        System.out.println(list);

        System.out.println(reserve(list));

    }
    public static LinkedList<Object> reserve(LinkedList<Object> list){
        LinkedList<Object> temp = new LinkedList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            temp.add(list.get(i));
        }
        return temp;
    }
}
