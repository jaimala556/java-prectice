public class Circle {
    public static void main(String[] args) {
        area obj=new area();
        obj.circumference();
    }

}

class area {
    public void circumference() {
        float pi = 3.14f;
        float r = 45;
        float circircumference1 = 2 * pi * r;
        System.out.println(" area of circumference : " + circircumference1);
    }
}
