import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted Array in Ascending order");
        for(int num: arr)
        {
            System.out.println(num+" ");
        }

    }
}
