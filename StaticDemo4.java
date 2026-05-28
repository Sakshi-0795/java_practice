public class StaticDemo4 {
    static String college = "ABC College";

    
    static void display() {
        System.out.println("College Name: " + college);
    }

    public static void main(String[] args) {

        display();

        System.out.println("Static Variable: " + college);
    }
}