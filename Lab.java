import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Lab {
    private String TeacherName;
    private String DayOfWeek;
    private double AvgGrade;
    private int MaxSize;
    private int CurrentSize;
    private Student[] student;
    public Lab (String teacherName, String dayOfWeek, int maxSize)
    {
        TeacherName = teacherName;
        DayOfWeek = dayOfWeek;
        MaxSize = maxSize;
        student = new Student[MaxSize];
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }
    public void setDayOfWeek(String dayOfWeek)
    {
        DayOfWeek =dayOfWeek;
    }
    public void setAvgGrade(double avg)
    {
        if (avg <= 20 || avg >= 0)
            AvgGrade = avg;
        else
            System.out.println("Invalid Grade");
    }
    public void setMaxSize(int maxSize)
    {
        if (maxSize > 0)
            MaxSize = maxSize;
        else
            System.out.println("Invalid Size");
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public void setCurrentSize(int currentSize) {
        CurrentSize = currentSize;
    }
    public String getTeacherName ()
    {
        return TeacherName;
    }
    public String getDayOfWeek ()
    {
        return DayOfWeek;
    }
    public int getCurrentSize()
    {
        return CurrentSize;
    }
    public int getMaxSize()
    {
        return MaxSize;
    }
    public double getAvgGrade()
    {
        return AvgGrade;
    }
    public Student[] getStudents()
    {
        return student;
    }
    public void EnrollStudent(Student std)
    {
        if (CurrentSize == MaxSize)
        {
            System.out.println("The Class Is Full");
            return;
        }
        student[CurrentSize] = std;
        CurrentSize++;
    }
    public void CalAvg()
    {
        double sum = 0;
        for (int i = 0; i < CurrentSize; i++)
            sum += student[i].GetGrade();
        AvgGrade = sum / CurrentSize;
    }
    public void PrintLabInfo()
    {
        for (int i = 0; i < CurrentSize; i++)
        {
            student[i].PrintStudentInfo();
        }
        System.out.println("Teacher Name : " + TeacherName);
        System.out.println("Day of Class : " + DayOfWeek);
        System.out.println("Max Size : " + MaxSize);
    }
}
