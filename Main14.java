class Company14{
    int item;

    synchronized void produce(int item){
        this.item = item;
        System.out.println("Produced : " + item);

       }
       synchronized void consume() { 
        System.out.println("consumed : " + item);
       }
}
class Main14{
    public static void main(String[]args){
        Company14 c = new Company14();

        c.produce(10);
        c.consume();
    }
}