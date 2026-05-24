public class ThisKeyWord{
    String name = "sakshi";
    int age = 20;
    double salary = 100000;


    ThisKeyWord(String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public static void main(String[]args){
    ThisKeyWord t = new ThisKeyWord("sakshi", 20, 100000);
      
        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.salary);
    
        
    }
}