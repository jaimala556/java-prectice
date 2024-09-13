public class Ques27 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int sp = 4; sp > i; sp--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            for (int k = i - 1; k >= 1; k--) {
                if (k % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}
