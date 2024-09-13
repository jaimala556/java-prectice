public class count {
    public static void main(String[] args) {
        System.out.println(siCalculate(1000, 2, 1));
        System.out.println(siCalculate(2000, 2, 1));
    }

    public static float siCalculate(int p, int r, int t) {
        return ((p * r * t) / 100);
    }

}
