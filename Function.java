public class Function{
    public static int addNumbers(int a,int b){
        int sum = a + b;
        return sum;

    }
    public static void main(String[]args){
        int result = addNumbers(10,10);

        System.out.println("The sum is : " + result );
    }
}