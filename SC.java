import java.util.Scanner;
public class SC
{
    public static void main(String[]args){

        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name");
        String name = sc.nextLine();
    
        System.out.println("Enter the age");
        int age = sc.nextInt();

        System.out.println("Enter the Percentage");
        double per = sc.nextDouble();


        System.out.println("The name is " + name + "\nThe a age " + age  + "\nThe Percentage " + per);

    }
}