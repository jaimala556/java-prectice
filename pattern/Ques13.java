public class Ques13 {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {
            for (int sp = 4; sp > i; sp--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
