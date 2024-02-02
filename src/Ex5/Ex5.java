package Ex5;

import java.util.Arrays;

public class Ex5 {
    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
        /** Copyright belong to Rikkei Academy*/
    }

    private static void selectionSort(int[] originalArray) {
        int n = originalArray.length;
        int[] arr = originalArray.clone();
        for (int i = 0; i < n-1; i++) {
            int maxIndex=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }
            }
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[i];
            arr[i]=temp;
        }

        System.out.println("Mảng theo sắp xếp chọn là " + Arrays.toString(arr));
    }

    //    Sắp xếp chèn
    private static void insertionSort(int[] originalArray) {
        int n = originalArray.length;
        int[] arr = originalArray.clone();
        for (int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]<key){
                arr[j+1]=arr[j];
                arr[j]=key;
                j--;
            }
        }
        System.out.println("Mảng theo sắp xếp chèn là " + Arrays.toString(arr));
    }

    //    Sắp xếp sủi bọt
    private static void bubbleSort(int[] originalArray) {
        int n = originalArray.length;
        int[] arr = originalArray.clone();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Mảng theo sắp xếp chèn là " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] array = getArr();
        System.out.println("Mảng ban đầu " + Arrays.toString(array));
        selectionSort(array);
        insertionSort(array);
        bubbleSort(array);
    }
}
