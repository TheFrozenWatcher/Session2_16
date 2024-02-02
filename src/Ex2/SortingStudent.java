package Ex2;

import static Ex2.Student.displayStudents;

public class SortingStudent {
    //    Sắp xếp kiểu chèn
    public static Student[] insertionSort(Student[] students) {
        Student[] sorted = students.clone();
        int n = students.length;
        for (int i = 1; i < n; ++i) {
            Student temp = students[i];
            int j = i - 1;
            while (j >= 0 && sorted[j].score > temp.score) {
                sorted[j + 1] = sorted[j];
                j--;
            }
            sorted[j + 1] = temp;
        }
        return sorted;
    }

    //    Sắp xếp kiểu chọn
    public static Student[] selectionSort(Student[] students) {
        Student[] sorted = students.clone();
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (sorted[j].score < sorted[minIndex].score) {
                    minIndex = j;
                }
            }
            Student X = sorted[minIndex];
            sorted[minIndex] = sorted[i];
            sorted[i] = X;
        }
        return sorted;
    }
//  Sắp xếp sủi bọt
    public static Student[] bubbleSort(Student[] students){
        Student[] sorted = students.clone();
        int n = students.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1;j++){
                if (sorted[j].score>sorted[j+1].score){
                    Student temp=sorted[j+1];
                    sorted[j+1]=sorted[j];
                    sorted[j]=temp;
                }
            }
        }
        return sorted;
    }
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student(1, "Alice", 85.5);
        students[1] = new Student(2, "Bob", 92.0);
        students[2] = new Student(3, "Charlie", 78.3);
        students[3] = new Student(4, "David", 89.7);
        students[4] = new Student(5, "Eva", 95.2);
        students[5] = new Student(6, "Frank", 77.8);
        students[6] = new Student(7, "Grace", 88.6);
        students[7] = new Student(8, "Hank", 91.4);
        students[8] = new Student(9, "Ivy", 79.9);
        students[9] = new Student(10, "Jack", 94.1);
        System.out.println("Danh sách học sinh sắp xếp theo phương pháp chèn:");
        displayStudents(insertionSort(students));
        System.out.println("Danh sách học sinh sắp xếp theo phương pháp chọn:");
        displayStudents(selectionSort(students));
        System.out.println("Danh sách học sinh sắp xếp theo phương pháp bong bóng:");
        displayStudents(bubbleSort(students));
    }
}
