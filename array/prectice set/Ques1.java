import java.util.Scanner;
public class Ques1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        if(num>=18){
            System.out.println("eligible for vote");
        }
        else
        {
            System.out.println("Not eligible");
        }
        
        

    }
}