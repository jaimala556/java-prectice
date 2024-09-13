public class Rectangle {
    public static void main(String[] args) {
        InnerRectangle obj1 = new InnerRectangle();
        obj1.width=234.5f;
        obj1.length=98.4f;
        // obj1.area(23.3f, 43.0f);
        obj1.area();
        obj1.perimeter();
    }
}

class InnerRectangle {
    float width;
    float length;

    // public void area(float width, float length) {
    //     float area1 = width * length;
    //     System.out.println("Area of rectangle is " + area1);
    // }

    // public void perimeter(float width, float length) {
    //     float perimeter1 = 2 * (width + length);
    //     System.out.println("Perimeter of rectangle is " + perimeter1);
    // }
    public void area(){
        float area1=width*length;
        System.out.println("area of rectangle is : "+area1);
    }
    public void perimeter(){
        float perimeter1 = 2 * (width + length);
         System.out.println("Perimeter of rectangle is " + perimeter1);
        
    }

}
