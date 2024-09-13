public class reverse {
    public static void main(String[] args) {
        System.out.println("Rever of num is :"+reverse(1234567       ));
    }
    public static int reverse(int num){
        int Reverse=0;
        int tem =num;
        while(tem>0){
            int digit =tem%10;
            Reverse=Reverse*10+digit;
            tem/=10;
        }
        return Reverse;
    }
}
