import java.util.Scanner;

public class Ques03 {
    public static void main(String[] args) {
        // 3. Write a program to store elements in an array and print them.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the terms : ");
        int term = sc.nextInt();

        int num[] = new int[term];

        for (int i = 0; i < term; i++)
            num[i] = sc.nextInt();

        System.out.println("The number in arryas : ");
        for (int i : num) {
            System.out.println(i);
        }
        sc.close();
    }
}
