import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num =sc.nextInt();
        int next;
        if(num%3 ==0){
            System.out.println("term is divisible by 3"+num);
        }
        else{
            next=num+(3-(num%3));
            System.out.println("next term is divisible by 3 is:" +next);
        }
    }
}
