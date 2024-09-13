import java.util.Scanner;

public class Ques02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the terms : ");
        int index = sc.nextInt();
        int[] num = new int[index];

        int sumOfEven = 0;
        System.out.println("Enter the " + index + " elements : ");
        for (int i = 0; i < index; i++)
            num[i] = sc.nextInt();
        for (int elem : num) {
            if (elem % 2 == 0) {
                sumOfEven = sumOfEven + elem;
            }
        }
        System.out.println("Sum of even : " + sumOfEven);
    }
}
