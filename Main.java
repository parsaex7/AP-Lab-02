import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("James", "Gosling", "0987654");
        Student std2 = new Student("Dennis", "Ritchie", "1234678");
        std1.SetGrade(18);
        std2.SetGrade(17.5);
        Lab WorkShop = new Lab("Mr.Smith", "Monday", 30);
        WorkShop.EnrollStudent(std1);
        WorkShop.EnrollStudent(std2);
        WorkShop.CalAvg();
        WorkShop.PrintLabInfo();


    }
}


