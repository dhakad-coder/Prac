public class Prac7 {
    class A {
        void foo() {
            System.out.println("Inside the Foo method of base class");
        }
    }

    //child or derived class
     class B extends A {
        void foo() {
            System.out.println("Inside the foo method of derived class");
        }
    }

    private class CouplingEx {
        //main method
        public void main(String[] argvs) {
            //creating an object of class B
            B obj = new B();
            obj.foo();
        }
    }
}
