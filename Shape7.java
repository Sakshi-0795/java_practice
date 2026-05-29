class Shape7{
    void display(){
        System.out.println("This is shape class ");
    }
}
class Circle extends Shape7{
    void area() { 
        System.out.println("Area of circle ");

    }
}
class Rectangle extends Shape7{
    void area(){
        System.out.println("Area of Rectangle");
    }
}
class Main7{
public static void main(String[]args){
    Circle c = new Circle();
    Rectangle  r = new Rectangle();

    c.display();
    c.area();

    r.display();
    r.area();
}}