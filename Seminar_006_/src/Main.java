import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Имя";
        w1.lastName = "Фамилия";
        w1.salary = 1000000;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Имя";
        w4.lastName = "Фамилия";
        w4.salary = 1000000;
        w4.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Имя-2";
        w2.lastName = "Фамилия-2";
        w2.salary = 500000;
        w2.id = 2000;

        Worker w3 = new Worker();
        w3.firstName = "Имя-3";
        w3.lastName = "Фамилия-3";
        w3.salary = 250000;
        w3.id = 3000;


        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<Worker>(Arrays.asList(w1,w2,w3));
        System.out.println(workers.contains(w4));

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);
    }
}