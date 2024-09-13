// 2. Write a program to accept N term and 
//     - Add all even
//     - Add all odd
//     - Add all prime
//     - Count of even
//     - Count of prime number
//     - Count of odd number

// import java.util.Scanner;

// public class Ques02 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the terms : ");
//         int index = sc.nextInt();
//         int[] num = new int[index];

//         int sumOfEven = 0;
//         System.out.println("Enter the " + index + " elements : ");
//         for (int i = 0; i < index; i++)
//             num[i] = sc.nextInt();
//         for (int elem : num) {
//             if (elem % 2 == 0) {
//                 sumOfEven = sumOfEven + elem;
//             }
//         }
//         System.out.println("Sum of even : " + sumOfEven);
//     }
// }

// import java.util.Scanner;

// public class Ques02 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the terms : ");
//         int index = sc.nextInt();
//         int[] num = new int[index];

//         int sumOfOdd = 0;
//         System.out.println("Enter the " + index + " elements : ");
//         for (int i = 0; i < index; i++)
//             num[i] = sc.nextInt();
//         for (int elem : num) {
//             if (elem % 2 == 1) {
//                 sumOfOdd = sumOfOdd + elem;
//             }
//         }
//         System.out.println("Sum of odd : " + sumOfOdd);
//     }
// }

// import java.util.Scanner;

// public class Ques02 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the terms : ");
//         int index = sc.nextInt();
//         int[] num = new int[index];

//         int count = 0;
//         System.out.println("Enter the " + index + " elements : ");
//         for (int i = 0; i < index; i++)
//             num[i] = sc.nextInt();

//         for (int elem : num) {
//             if (elem % 2 == 0) {
//                 count++;
//             }
//         }
//         System.out.println("Count of even : " + count);
//     }
// }

// import java.util.Scanner;

// public class Ques02 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the terms : ");
//         int index = sc.nextInt();
//         int[] num = new int[index];

//         int count = 0;
//         System.out.println("Enter the " + index + " elements : ");
//         for (int i = 0; i < index; i++)
//             num[i] = sc.nextInt();

//         for (int elem : num) {
//             if (elem % 2 == 1) {
//                 count++;
//             }
//         }
//         System.out.println("count of odd : " + count);
//     }
// }

// import java.util.Scanner;

// public class Ques02 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the terms : ");
//         int index = sc.nextInt();
//         int[] num = new int[index];

//         int prime = 0;
//         System.out.println("Enter the " + index + " elements : ");
//         for (int i = 0; i < index; i++)
//             num[i] = sc.nextInt();

//         for (int elem : num) {
//             int counter = 0;
//             for (int i = 1; i <= elem; i++) {
//                 if (elem % i == 0) {
//                     counter++;
//                 }
//             }
//             if (counter == 2)
//                 prime = prime + elem;

//         }
//         System.out.println("Sum of prime : " + prime);
//     }
// }

import java.util.Scanner;

public class Ques02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the terms : ");
        int index = sc.nextInt();
        int[] num = new int[index];

        int prime = 0;
        System.out.println("Enter the " + index + " elements : ");
        for (int i = 0; i < index; i++)
            num[i] = sc.nextInt();

        for (int elem : num) {
            int counter = 0;
            for (int i = 1; i <= elem; i++) {
                if (elem % i == 0) {
                    counter++;
                }
            }
            if (counter == 2)
                prime++;

        }
        System.out.println("count of prime : " + prime);
    }
}