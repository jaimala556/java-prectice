
public class personclass {
    public static void main(String[] args) {
        person p = new person();
        person p1=new person();
        p.age=20;
        p.name="hey";
        p1.age=40;
        p1.name="jhdg";
        System.out.println(p.age + " " + p.name);
        System.out.println(p1.age + " " + p1.name);
    }

}

class person {
    int age;
    String name;
}