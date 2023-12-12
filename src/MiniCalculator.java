import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number to perform Arithmetic operation: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the operator: ");
        char ch=sc.next().charAt(0);
        int c;
        switch (ch)
        {
            case '+':
                c=a+b;
                System.out.println("Addition: "+c);
                break;

            case '-':
                c=a-b;
                System.out.println("Subtraction: "+c);
                break;

            case '*':
                c=a*b;
                System.out.println("Product: "+c);
                break;

            case '/':
                c=a/b;
                System.out.println("Quotient: "+c);
                break;

            case '%':
                c=a%b;
                System.out.println("Remainder: "+c);
                break;

            default:
                System.out.println("Wrong Choice!!!");
                break;
        }
    }
}
