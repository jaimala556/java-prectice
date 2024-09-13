public class Ques7 {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int next=0;
        System.out.print(num1);
        System.out.print(num2);
        for(int i=0;i<=7;i++){ 
            System.out.print(num1 + num2 +" "); 
            next=num1+num2;
            num1=num2;
            num2=next;

        }
    }
}
