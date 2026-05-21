
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Visitor {
	String name;
	int vehicleNo;
	double mobileNo;
	
	Visitor(String name,int vehicleNo,double mobileNo){
		this.name = name;
		this.vehicleNo = vehicleNo;
		this.mobileNo = mobileNo;
	}
		
		
	public static void main(String[]args) {	
	
	Scanner sc = new Scanner(System.in);
	
	
	LinkedHashSet<Visitor> visitors = new LinkedHashSet<>();
	System.out.println("Enter the no of visitors");
	
	int n = sc.nextInt();
	sc.nextLine();
	
	for ( int i = 1; i <= n; i++) {
		System.out.println("\nEnter Visitors" + i + "Details");
		
		System.out.println("Enter name :  ");
		String name  = sc.next();
		
		System.out.println("Enter vehicle number :  ");
		int vehicleNo = sc.nextInt();
		
		System.out.println("Enter the mobile number ");
		double mobileNo = sc.nextDouble();
		
		Visitor v =new Visitor(name,vehicleNo,mobileNo);
		
		
		visitors.add(v);
		
	}
	System.out.println("\nVisitors Records");
	
	for(Visitor v : visitors) {
		System.out.println("Name : " + v.name + " | Vehicle No : " + v.vehicleNo + " | Mobile no : "  +  v.mobileNo);
	}
	sc.close();
	
	
	}
}
