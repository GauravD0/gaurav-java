public class Student {
    String studName;
    int rollno;
    Student(String studName,int rollno)
    {
        this.studName=studName;
        this.rollno=rollno;
    }
    void printData()
    {
        System.out.println("Student Name: "+studName+"  Student Rollno: "+rollno);
    }
    public static void main(String[] args)
    {
        Student s=new Student("Gaurav",75);
        s.printData();
    }
}
