class Person5{
    String name = "Sakshi";

}
class Employee extends Person5{
    int salary = 500000;

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);

    }
    public static void main(String[]args){
        Employee e = new Employee();
        e.display();
    }
}