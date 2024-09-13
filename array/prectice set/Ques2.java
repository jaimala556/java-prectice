import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int num =sc.nextInt();
        if(num%2==0 && num>=0){
            System.out.println("Postivie even number "+num);
        }
        else if(num%2==0 && num<=0){
            System.out.println("Negative even number"+num);
        }
    }
}
