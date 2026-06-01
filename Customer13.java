class Bank13{
    synchronized void withdraw(int amount){
        System.out.println(amount + "Withdraw");
    }
}
class Customer13 extends Thread{
    Bank13 b;

    Customer13(Bank13 b){
        this.b = b;
    }
    public void run(){
        b.withdraw(50000);

    }
    public static void main(string[]args){
        Bank13 obj = new Bank13();

        Customer13 c1 = new Customer13(obj);
        Customer13 c2 = new Customer13(obj);

        c1.start();
        c2.start();
    }
}