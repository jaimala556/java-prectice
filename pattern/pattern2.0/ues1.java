public class ues1{
    public static void main(String[] args) {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            System.out.print(j);
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            for(int sp=1;sp<i;sp++)
            System.out.print(" ");
            for(int j=i;j<=5;j++)
            System.out.print(j);
            System.out.println();
        }
    }
}