// find x in array
import java.util.Scanner;

public class findx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size:");
        int Size=sc.nextInt();
        int arr[]=new int[Size];
        System.out.println("Elements are:");
        for(int i=0;i<Size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("x is :");
        int x=sc.nextInt();
        for(int i=0;i<Size;i++){
            if(arr[i]==x){
                System.out.println("x is present "+x);
                break;
            }
            // if(arr[i]==x){
            //     System.out.println("x is present "+i);
            //     // break;
            // }
            if(arr[i]!=x){
                System.out.println("not present");
                // break;
            }

        }
    }
}
