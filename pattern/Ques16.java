public class Ques16 {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {
            for (int sp = 1; sp < i; sp++)
                System.out.print(" ");
            for (int j = i; j <= 4; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
