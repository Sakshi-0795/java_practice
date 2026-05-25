class ZooAnimal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends ZooAnimal{
    void sound(){
        super.sound();
        System.out.println("Dog barks!!!");
    }
}
public class Pet{
    public static void main(String[]args){
        Dog d = new Dog();
        d.sound();
        
    }
}
