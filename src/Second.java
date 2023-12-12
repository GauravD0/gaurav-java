public class Second {
    String name;
    int roll_no;
    void getInfo()
    {
        name="Gaurav";
        roll_no=217;
    }
    void printData()
    {
        System.out.println(name+" "+roll_no);
    }

    public static void main(String[] args) {
        Second obj=new Second();
        obj.getInfo();
        obj.printData();
    }
}
