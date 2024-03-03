import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.DelayQueue;
//В обычный калькулятор без логирования добавьте
// возможность отменить последнюю операцию.
//
//Отмена последней операции должна быть реализована
// следующим образом: если передан оператор '<'
// калькулятор должен вывести результат предпоследней операции.
public class temp07 {
    public static void main(String[] args) {
        Deque<Double> que = new ArrayDeque<>();
        int a, b, c, d;
        char op, op2, undo;
        a = 3;
        op = '+';
        b = 7;
        c = 4;
        op2 = '+';
        d = 7;
        undo = '<';

        System.out.println(calculate('*', 3, 2, que));
        System.out.println(calculate('-', 7, 4, que));
        System.out.println(calculate('<', 0, 0, que));

    }


    public static Double calculate(char op, int a, int b, Deque<Double> que) {


        Double result = 0.0;

        if (op == '+') {
            que.add((double) (a+b));
            return que.peekLast();

        }
        if (op == '-') {
            que.add((double) (a-b));
            return que.peekLast();
        }
        if (op == '*') {
            que.add((double) (a*b));
            return que.peekLast();
        }
        if (op == '/') {
            que.add((double) (a/b));
            return que.peekLast();
        }
        if (op == '<') {
            return que.peekFirst();
        }
        return result;
    }

}
