import java.util.ArrayList;
import java.util.List;

public class temp04 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(removeEvenNumbers(arr));

    }
    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr){
        ArrayList<Integer> result = new ArrayList<>(arr.length);
        for (int j : arr) {
            if (j % 2 != 0)
                result.add(j);
        }
        return result;
    }
}
