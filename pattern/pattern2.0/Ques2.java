public class Ques2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int sp = 6; sp > i; sp--)
                System.out.print(" ");
            for (int j = i; j >= 1; j--)
                System.out.print(j);
            
            for(int k=2;k<=i;k++)
            System.out.print(k);
            System.out.println();
        }
    }
}
