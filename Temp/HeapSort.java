import java.util.Arrays;

public class HeapSort {
//    Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort). Программа должна работать следующим образом:
//    Принимать на вход массив целых чисел для сортировки. Если массив не предоставлен, программа использует массив по умолчанию.
//    Сначала выводить исходный массив на экран.
//    Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.
//    Выводить отсортированный массив на экран.
//    Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево на основе массива, и heapSort, который выполняет собственно сортировку кучей.
//    Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.
    public static void main(String[] args) {
        int[] arr = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        int sortLength = arr.length;
        buildTree(arr, sortLength);
        System.out.println(Arrays.toString(arr));


    }
    public static void buildTree(int[] tree,int sortLength) {

        for (int i = sortLength/2-1; i >=0 ; i--) {
            heapSort(tree, i, sortLength);
        }

        for (int i = sortLength - 1; i >= 0 ; i--) {
            int temp = tree[i];
            tree[i] = tree[0];
            tree[0] = temp;

            heapSort(tree, 0, i);
        }
    }

    public static void heapSort(int[] sortArray, int i, int sortLength) {
        int left = i * 2 +1;
        int right = i *2 +2;
        int bigest = i;

        if(left < sortLength && sortArray[left] > sortArray[bigest])
            bigest = left;
        if(right < sortLength && sortArray[right] > sortArray[bigest])
            bigest = right;

        if(i !=bigest){
            int temp = sortArray[i];
            sortArray[i] = sortArray[bigest];
            sortArray[bigest] = temp;

            heapSort(sortArray, bigest, sortLength);
        }

    }
}
