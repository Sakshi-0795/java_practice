import java.util.ArrayList;

class Demo16{
    public static void main(String[]args){
        ArrayList<String>list = new ArrayList<>();
        list.add("Java");
        list.add("Html");
        list.add("Python");


        list.remove("Html");
        System.out.println(list.contains("Html"));
        System.out.println(list);
    }
}