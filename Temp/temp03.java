import java.lang.reflect.Array;
import java.util.Arrays;

//Реализация сортировки слиянием на Java.
//Примерно O(n log n) операций.
public class temp03 {
    public static void main(String[] args) {
        int[] a = new int[]{5, 1, 6, 2, 3, 4};
        System.out.println(Arrays.toString(mergeSort(a)));
//        mergeSort(a);

    }

    public static int[] mergeSort(int[] a) {

            int[] temp1 = Arrays.copyOf(a, a.length);
            int[] temp2 = new int[a.length];
            int[] result = merg(temp1, temp2, 0, a.length);
            return result;


    }


//     temp1 Массив для сортировки.
//     temp2 Буфер. Размер должен быть равен размеру temp1.
//     lIndex Начальный индекс в temp1 для сортировки.
//     hIndex Конечный индекс в temp1 для сортировки.

    public static int[] merg(int[] temp1, int[] temp2, int lIndex, int hIndex) {
        if (lIndex >= hIndex - 1)
            return temp1;

        // уже отсортирован.
        int mIndex = lIndex + (hIndex - lIndex) / 2;
        int[] sorted1 = merg(temp1, temp2, lIndex, mIndex);
        int[] sorted2 = merg(temp1, temp2, mIndex, hIndex);

        // Слияние
        int index1 = lIndex;
        int index2 = mIndex;
        int dIndex = lIndex;

        int[] result = sorted1 == temp1 ? temp2 : temp1;
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
