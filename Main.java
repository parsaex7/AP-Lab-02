import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("James", "Gosling", "0987654");
        Student std2 = new Student("Dennis", "Ritchie", "123467");
        std1.SetGrade(18);
        std2.SetGrade(17.5);
        std1.PrintStudentInfo();
        std2.PrintStudentInfo();
    }
}


