package Ex2;

public class Student {
    int id;
    String name;
    double score;
    public Student(){}
    public Student(int id, String name, double score){
        this.id=id;
        this.name=name;
        this.score=score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public static void displayStudents(Student[] students){
        for (Student student: students){
            System.out.println("Name: "+student.name+", ID: "+student.id+", Score: "+student.score);
        }
    }
}
