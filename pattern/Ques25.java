public class Ques25 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int sp = 5; sp > i; sp--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            for (int k = i - 1; k >= 1; k--)
                System.out.print(k);
            System.out.println();
        }
    }
}
