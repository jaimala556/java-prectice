import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        System.out.println("Enter a range");
        int range=sc.nextInt();
        System.out.println("prime number "+num+" to " +range);
        for(int i=num;i<=range;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
            
        }
    }
}
