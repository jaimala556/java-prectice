import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  term :");
        int term=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(term +"*"+i+"="+(term*i) );
        }
    }
}
