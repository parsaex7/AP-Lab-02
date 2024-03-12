public class Student {
    private String Name;
    private String LastName;
    private String Id;
    private double Grade;

    public Student(String name, String lastName, String id) {
        if (id.length() != 7) // check if id length equals to 7
            System.out.println("Invalid ID");
        else {
            Name = name;
            LastName = lastName;
            Id = id;
            Grade = 0;
        }
    }

    public void SetGrade(double grade) {
        if (grade > 20 || grade < 0) //check whether grade is valid or no
            System.out.println("Invalid Grade");
        else
            Grade = grade;
    }

    public double GetGrade() {
        return Grade;
    }

    public void PrintStudentInfo() {
        if (Name == null || LastName == null || Id == null) // if id is not equals to 7
        {
            System.out.println("Invalid Data");
        } else
            System.out.println(Name + " " + LastName + "\nID : " + Id + "\nGrade : " + Grade);
    }
}