import java.util.LinkedList;
class Demo15{
    public static void main(String[]args){
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Html");
        list.add("Python");

        list.remove("Html");
        System.out.println(list);
        
    }
}