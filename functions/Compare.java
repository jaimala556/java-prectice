import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Username=sc.nextLine();
        String Password=sc.nextLine();
        compare(Username, Password);

    }
    public static void compare(String Username,String Password){
        String name="admin";
        String ourpassword="admin";
        boolean isEqualUsername=name.equals(Username);
        boolean isEqualPassword=Password.equals(ourpassword);
        if(isEqualPassword==true && isEqualUsername==true)
        {
            System.out.println("valid");
        }
        else{
            System.out.println("not valid");
        }
    }
}
