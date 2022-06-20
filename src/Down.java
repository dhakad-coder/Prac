public class Down {
    public static void main(String[] args) {
        DowncastingEx p = new Child();
        p.name = "Shiwam";

        //Performing Downcasting Implicitly
        //Child c= new DowncastingEx();// it will give compile-time error
        Child c = (Child) p;
        c.age = 25;
        System.out.println(c.name);
        System.out.println(c.age);
        c.showMessage();
    }
}
