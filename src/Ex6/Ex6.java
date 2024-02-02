package Ex6;

import java.util.Arrays;

public class Ex6 {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

//  Hiện mảng mới
            displayArray(arr);
        }
    }

    public static void displayArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arrayToSort = {12, 11, 13, 5, 6};

        System.out.println("Mảng ban đầu:");
        displayArray(arrayToSort);

        System.out.println("\nThuật toán sắp xếp chèn:");

        int[] sortedArray = arrayToSort.clone();
        insertionSort(sortedArray);

        System.out.println("\nMảng sau khi sắp xếp chèn:");
        displayArray(sortedArray);
    }
}
