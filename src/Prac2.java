
class Frog {
    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();
        //return id + ": " + name;
    }

    public Frog() {

    }

//    public String toString() {
//        return "Hello";
//    }
}





public class Prac2 {
    public static void main(String[] args) {
        Frog frog1 = new Frog(7, "Freddy");
        Frog frog2 = new Frog(5, "Reddy");
        System.out.println(frog1);
        System.out.println(frog2);
    }
}



//Understanding problem arises without toString() method
class Student1{
    int rollno;
    String name;
    String city;

    Student1(int rollno, String name, String city){
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public static void main(String[] args){
        Student1 s1 = new Student1(27, "Raman", "Darbhanga");
        Student1 s2 = new Student1(29, "Aman", "Darbhanga");

        System.out.println(s1); //compiler writes here s1.toString()
        System.out.println(s2); //compiler writes here s2.toString()
    }

}


class Employee2{
    float salary = 40000;
}
class Programmer extends Employee2{
    int bonus = 100000;
    public static void main(String[] args){
        Programmer p = new Programmer();
        System.out.println("Programmer salary is :" + p.salary);
        System.out.println("Bonus of Programmer is:"+ p.bonus);
    }
}



class Animal{
    void eat(){
        System.out.println("eating....");
    }
    class Dog extends animal {
        void bark(){
            System.out.println("barking");
        }
        class Test{
            public void main(String[] args){
                Dog d = new Dog();
                d.bark();
                d.eat();
            }
        }
    }

}



