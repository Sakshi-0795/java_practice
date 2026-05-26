class Student {
    int rollNo;
    String name;
    double marks;

    void setData(int r, String n, double m){
        rollNo = r;
        name = n;
        marks = m;

    }
    void dispaly(){
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);

    }
    public static void main(String[]args){
        Student s = new Student();
        s.setData(1,"Sakshi",99);

        s.dispaly();
    }
    }
