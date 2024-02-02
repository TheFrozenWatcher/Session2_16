package Ex4;

import static Ex4.FootballTeam.displayTeam;

public class SortingMembers {
    public static void insertionSort(FootballTeam[] team) {
        FootballTeam[] result = team.clone();
        int n = team.length;
        for (int i = 1; i < n; i++) {
            FootballTeam temp = result[i];
            int j = i - 1;
            while (j >= 0 && result[j].getScore() < temp.getScore()) {
                result[j + 1] = result[j];
                j--;
            }
            result[j + 1] = temp;
        }
        System.out.println("Danh sách sắp xếp điểm cao đến thấp theo phương pháp chèn là:");
        displayTeam(result);
    }
    public static void selectionSort(FootballTeam[] team){
        FootballTeam[] result = team.clone();
        int n=team.length;
        for (int i=0;i<n-1;i++){
            int maxIndex=i;
            for (int j=i+1;j<n;j++){
                if (result[j].getScore()>result[maxIndex].getScore()){
                    maxIndex=j;
                }
            }
            FootballTeam temp=result[i];
            result[i]=result[maxIndex];
            result[maxIndex]=temp;
        }
        System.out.println("Danh sách sắp xếp điểm cao đến thấp theo phương pháp chèn là:");
        displayTeam(result);
    }

    public static void bubbleSort(FootballTeam[] team){
        FootballTeam[] result = team.clone();
        int n=team.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1;j++){
                if (result[j].getScore()<result[j+1].getScore()){
                    FootballTeam temp=result[j];
                    result[j]=result[j+1];
                    result[j+1]=temp;
                }
            }
        }
        System.out.println("Danh sách sắp xếp điểm cao đến thấp theo phương pháp sủi bọt là:");
        displayTeam(result);
    }
    public static void main(String[] args) {
        FootballTeam[] team = new FootballTeam[4];
        team[0] = new FootballTeam(1, "TeamA", 11, 90);
        team[1] = new FootballTeam(2, "TeamB", 12, 80);
        team[2] = new FootballTeam(3, "TeamC", 10, 95);
        team[3] = new FootballTeam(4, "TeamD", 14, 85);
        System.out.println("Danh sách thành viên: ");
        displayTeam(team);
        insertionSort(team);
        selectionSort(team);
        bubbleSort(team);
    }
}
