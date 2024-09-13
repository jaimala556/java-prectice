public class Ques01 {

    public static void main(String[] args) {
        helloWorld();
        System.out.println("Sum : " + sum(10, 20));
        System.out.println("Average : " + averageNumbers(10, 20, 30, 40, 60));
        System.out.println("Reverse : " + reverse(123456));
    }

    public static void helloWorld() {
        System.out.println("Hello world");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float averageNumbers(int... num) {
        int sum = 0;
        for (int i : num) {
            sum = sum + i;
        }
        return (sum / num.length);
    }

    public static int reverse(int num) {
        int reverse = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        return reverse;
    }
}