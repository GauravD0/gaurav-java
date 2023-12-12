import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr= {10,25,30,45,50,60,70};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the number to search");
        int target=sc.nextInt();
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                index=i;
                break;
            }
        }
        if(index!=0)
        {
            System.out.println("Element "+target+" found at index "+index);
        }
        else
        {
            System.out.println("Element "+target+" not found in the array.");
        }
    }
}
