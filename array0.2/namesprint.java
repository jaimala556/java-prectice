import java.util.Scanner;

public class namesprint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of String :");
        int Size=sc.nextInt();
        String arr[]=new String[Size];
        System.out.println("taking names:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.next();
        }
        System.out.println("names are :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
