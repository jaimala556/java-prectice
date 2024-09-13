import java.util.Scanner;

public class Ques06 {
    public static void main(String[] args) {
        // 6. Write a program to copy the elements of one array into another array.

        Scanner sc = new Scanner(System.in);

        System.out.print("Eter the term: ");
        int term = sc.nextInt();

        int[] num = new int[term];

        System.out.println("Enter the numbers : ");
        for (int i = 0; i < term; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("copy items to another array : ");
        int[] anotherArray = new int[num.length];
        for (int i = 0; i < anotherArray.length; i++)
            anotherArray[i] = num[i];

        System.out.print("Size of num array : " + num.length);
        System.out.print("Size of another array : " + anotherArray.length);

        sc.close();
    }
}
