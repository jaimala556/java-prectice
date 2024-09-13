import java.util.Scanner;

public class Ques05 {
    public static void main(String[] args) {
        // 5. Write a program to find the sum of all elements of the array.
        Scanner sc = new Scanner(System.in);

        System.out.println("Eter the term: ");
        int term = sc.nextInt();

        int[] num = new int[term];
        int sum = 0;

        System.out.println("Enter the numbers : ");
        for (int i = 0; i < term; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Display in reverse");
        for (int i = term - 1; i >= 0; i--)
            sum = sum + num[i];

        System.out.println("Sum of array : " + sum);
        sc.close();
    }
}
