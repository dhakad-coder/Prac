public class Student5 {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Student5(int i, String n){
        id = i;
        name = n;
    }
    //Creating three arg constructor
    Student5(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }
    void display(){
        System.out.println(id + "" + name+ "" + age);
    }
    public static void main(String[] args){
        Student5 s1 = new Student5(274293, "Shiwam", 25);
        Student5 s2 = new Student5(274300, "Arihant",22 );
        s1.display();
        s2.display();
    }
}
