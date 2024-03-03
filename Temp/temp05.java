import java.util.*;
import java.util.stream.DoubleStream;

public class temp05 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        newList(arr);
    }
    public static void newList(Integer[] arr){
        ArrayList result = new ArrayList<>(sort(arr));
        System.out.println(result);
        System.out.println("Minimum is " + result.getFirst());
        System.out.println("Maximum is " + result.getLast());

        int sum = 0;
        for (int i = 0; i < result.size(); i++) {
             sum += (int) result.get(i);
        }

        System.out.println("Average is = " + (double) sum / result.size());


//        OptionalDouble average = OptionalDouble.of(result.stream()
//                .mapToDouble(val->val)
//                .average()
//                .orElse(Double.NaN));
//        System.out.println("Average is = " + average.getAsDouble());
    }

    public static ArrayList<Integer> sort(Integer[] a){

        Integer[] temp1 = Arrays.copyOf(a, a.length);
        Integer[] temp2 = new Integer[a.length];
        Integer[] result = merg(temp1, temp2, 0, a.length);
        ArrayList<Integer> resultt = new ArrayList<>(Arrays.asList(result));
        return resultt;

    }
    public static Integer[] merg(Integer[] temp1, Integer[] temp2, int lIndex, int hIndex) {
        if (lIndex >= hIndex - 1)
            return temp1;

        // уже отсортирован.
        int mIndex = lIndex + (hIndex - lIndex) / 2;
        Integer[] sorted1 = merg(temp1, temp2, lIndex, mIndex);
        Integer[] sorted2 = merg(temp1, temp2, mIndex, hIndex);

        // Слияние
        int index1 = lIndex;
        int index2 = mIndex;
        int dIndex = lIndex;

        Integer[] result = sorted1 == temp1 ? temp2 : temp1;
        while (index1 < mIndex && index2 < hIndex) {
            result[dIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < mIndex) {
            result[dIndex++] = sorted1[index1++];
        }
        while (index2 < hIndex) {
            result[dIndex++] = sorted2[index2++];
        }
        return result;
    }
}
