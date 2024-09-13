import java.util.Scanner;

public class Ques04 {
    public static void main(String[] args) {
        // 4. Write a program to read n number of values in an array and display them in
        // reverse order.
        Scanner sc = new Scanner(System.in);

        System.out.println("Eter the term: ");
        int term = sc.nextInt();

        int[] num = new int[term];

        System.out.println("Enter the numbers : ");
        for (int i = 0; i < term; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Display in reverse");
        for (int i = term - 1; i >= 0; i--)
            System.out.println(num[i]);

        sc.close();
    }
}
