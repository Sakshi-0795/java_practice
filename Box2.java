class Box2 {
    int length;
    int width;

    Box2(){
        length = 10;
        width = 5;

    }
    Box2(int l ,int w){
        length = l;
        width = w;
    }
    void display(){
        System.out.println("Length : " + length);
        System.out.println("Width : " + width);
    }
    public static void main(String[]args){
        Box2 b1 = new Box2();
        Box2 b2 = new Box2(20,10);

        b1.display();
        b2.display();
    }
}