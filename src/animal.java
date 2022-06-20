public class animal {
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends animal{
    void eat(){
        System.out.println("eating fruits");
    }
}
class BabyDog extends Dog{
    void eat(){
        System.out.println("drinking milk");
    }
    public static void main(String[] args){
        animal a1, a2, a3;
        a1 = new animal();
        a2 = new Dog();
        a3 = new BabyDog();
        a1.eat();
        a2.eat();
        a3.eat();
    }
}

