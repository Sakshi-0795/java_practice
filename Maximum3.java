class Maximum3 {
    int max(int a,int b){
        return (a > b) ? a : b;
    }
    float max(float a,float b){
        return (a > b) ? a : b;
    }
    public static void main(String[]args){
        Maximum3 m = new Maximum3();
        System.out.println("Maximum Integer : " + m.max(10,20));
        System.out.println("Maximum Float  : " + m.max(12.5f,8.5f));
    }
}