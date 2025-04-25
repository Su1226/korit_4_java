package ch09_classes.students;

public class StudentsMain {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "김일";
        s1.score = 4.5;
        s1.studentCode = 20250001;

        Students s2 = new Students(20250002);
        s2.name = "김이";
        s2.score = 100;

        Students s3 = new Students("김삼");
        s3.studentCode = 20250003;
        s3.score = 95.8;

        Students s4 = new Students(20250004, "김사");
        s4.score = 4.0;

        Students s5 = new Students(20250005, "김오", 80.7);

        System.out.println();

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
        s4.showInfo();
        s5.showInfo();
    }
}
