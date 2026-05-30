interface Calculator9 { 
    void add(int a,int b);

    void sub(int a , int b);

    void mul(int a , int b);

    void div(int a , int b);
}
class Demo9 implements Calculator9 {

    public void add(int a,int b){
        System.out.println("Addition : " + (a + b));
    }
     public void sub(int a ,int b){
        System.out.println("Subtraction : " + (a - b));

     }
     public void mul(int a, int b){
        System.out.println("Multiplication : " + (a * b));

     }
     public void div(int a,int b){
        System.out.println("Division : " + (a / b));

     }
     public static void main(String[]args){
        Demo9  d = new Demo9();
        d.add(10,20);
        d.sub(10,20);
        d.mul(10,20);
        d.div(10,20);
     }


}