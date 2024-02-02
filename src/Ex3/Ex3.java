package Ex3;

import java.util.Arrays;

public class Ex3 {
    public static String[] insertionSort(String[] array) {
        String[] newArr = array.clone();
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            String key = newArr[i];
            int j = i - 1;
            while (j >= 0 && newArr[j].compareTo(key) > 0) {
                newArr[j + 1] = newArr[j];
                j--;
            }
            newArr[j + 1] = key;
        }
        return newArr;
    }

    public static String[] selectionSort(String[] array) {
        String[] newArr = array.clone();
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (newArr[j].compareTo(newArr[minIndex]) < 0) {
                    minIndex = j;
                }

            }
            String temp =newArr[minIndex];
            newArr[minIndex]=newArr[i];
            newArr[i]=temp;
        }
        return newArr;

    }
    public static String[] bubbleSort(String[] array){
        String[] newArr = array.clone();
        int n = array.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1;j++){
                if (newArr[j].compareTo(newArr[j+1])>0){
                    String temp=newArr[j];
                    newArr[j]=newArr[j+1];
                    newArr[j+1]=temp;
                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};
        System.out.println("Danh sách sắp xếp bằng phương pháp chèn: " + Arrays.toString(insertionSort(arr)));
        System.out.println("Danh sách sắp xếp bằng phương pháp chọn: " + Arrays.toString(selectionSort(arr)));
        System.out.println("Danh sách sắp xếp bằng phương pháp sủi bọn: " + Arrays.toString(bubbleSort(arr)));
    }
}
