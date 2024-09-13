public class Employee {
    public static void main(String[] args) {

        // InnerEmployee obj1 = new InnerEmployee();
        InnerEmployee obj2 = new InnerEmployee("Jaimala", "20", 70000.00f);
        obj2.showData();
    }
}

class InnerEmployee {

    String name;
    String age;
    float salary;

    // default constructor
    InnerEmployee() {
        System.out.println("default constructor");
    }

    // parameter constructor
    InnerEmployee(String name, String age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        System.out.println("parameteized constructor");
    }

    public void showData() {
        System.out.println("Name : " + this.name + " age : " + this.age + " salary : " + this.salary);
    }

}